package Dafny;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import DafnyGUI.DafnyConfiguration.DafnyStateService;

import com.intellij.codeInsight.daemon.DaemonCodeAnalyzer;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dafny {

    /**
     * The DafnyConnectionProvider provides a connection to the Dafny Server (DafnyServer.exe).
     * The DafnyConnectionProvider receive a filename and sourcecode and send it to the Dafny Server for the verification.
     */
    private static DafnyConnectionProvider dafnyConnectionProvider;

    /**
     * Every file, which was send to the DafnyConnectionProver will be mapped to his verification state.
     * True for no errors during the verification, false if at least one error occurred.
     */
    private static Map<String, Boolean> fileToVerifiedState = new HashMap<>();

    /**
     * The path to the Dafny files.
     */
    private static String dafnyPath;

    /**
     * The path to Mono. (for macOS users)
     */
    private static String monoPath;

    /**
     * The current project.
     */
    private static Project project;

    private static Process run;

    /**
     * Constructor. Load the path for dafny and mono from DafnyStateService.
     * If the path for dafny is null, then the DafnyConnectionProvider will not be initialize.
     */
    public Dafny() throws IOException {
        dafnyPath = ServiceManager.getService(DafnyStateService.class).getPath();
        monoPath = ServiceManager.getService(DafnyStateService.class).getMono();
        //If the dafnyPath is null, then is no Dafny configuration saved.
        //Without valid configuration a DafnyConnectionProver can not be initialize.
        if (dafnyPath != null) {

            if (monoPath != null && DafnyConfigurationController.isMac())
                dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);

            if (!DafnyConfigurationController.isMac())
                dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);
        }
    }

    /**
     * Send a filename and sourcecode to the DafnyConnectionProvider for verification.
     * Returns a list with every parsed response from the Dafny Server.
     * If DafnyConnectionProver is null, then return an empty list.
     * @param sourcecode - the code to be verified.
     * @param filename - the name of the file
     * @return a list with every parsed response from the Dafny Server.
     */
    public static List<DafnyResponse> getDiagnosticList(String sourcecode, String filename) {
        if (dafnyConnectionProvider == null) return new ArrayList<>();
        List<DafnyResponse> dafnyResponses = dafnyConnectionProvider.sendData(sourcecode,filename);

        //Update fileToVerifiedState
        fileToVerifiedState.put(filename, true);
        for (DafnyResponse d : dafnyResponses) {
            if (d.getHighlightSeverity().equals(HighlightSeverity.ERROR))
                fileToVerifiedState.put(filename, false);
        }

        return dafnyResponses;
    }

    /**
     * Shutdown the current DafnyConnectionProvider and initialize a new one.
     * @throws IOException
     */
    public static void reset() throws IOException {
        if (dafnyConnectionProvider != null) {
            dafnyConnectionProvider.disconnect();
        }
        dafnyPath = ServiceManager.getService(DafnyStateService.class).getPath();
        monoPath = ServiceManager.getService(DafnyStateService.class).getMono();
        if (dafnyPath != null) {
            if (monoPath != null && DafnyConfigurationController.isMac())
                dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);

            if (!DafnyConfigurationController.isMac())
                dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);
            if (project != null) DaemonCodeAnalyzer.getInstance(project).restart(); //Restart the Annotation.
        }
    }

    /**
     * Get the unparsed response from the DafnyConnectionProvider for a given file.
     * If the DafnyConnectionProvider is null, then return a error message.
     * @param file - the given file.
     * @return unparsed response from the DafnyConnectionProvider.
     */
    public static String unparsedResponse(String file) {
        if (dafnyConnectionProvider == null) return DafnyPluginStrings.UNVALID_CONFIGURATION;
        DaemonCodeAnalyzer.getInstance(project).restart(); //Restart the Annotation.
        return dafnyConnectionProvider.getUnparsedResponse(file);
    }

    /**
     * Checks if a file is verified.
     * @param file - the file to be checked.
     * @return false if DafnyConnectionProvider is null or file is not verified, true if the file is verified.
     */
    public static boolean fileIsVerified(String file) {
        return (dafnyConnectionProvider != null) && (!fileToVerifiedState.containsKey(file) ? false : fileToVerifiedState.get(file));
    }

    /**
     * This method creates from a sourcecode a new Dafny file and use this file as parameter for the Dafny.exe.
     * Dafny.exe creates from this file a executable dafny file. This file will be executed and the output stream will
     * be connected to a BufferReader.  This BufferReader will be returned.
     * @param filepath - the path where the original Dafny file lays.
     * @param sourcecode - the sourcecode for the new Dafny file
     * @return the BufferReader, which is connected to the executable dafny file.
     * @throws IOException
     */
    public static BufferedReader run(String filepath, String sourcecode) throws IOException {

        Process dafnyProcess;
        ProcessBuilder dafnyProcessBuilder;
        File compiledExe;

        InputStreamReader inputStreamReader;

        File file = new File(filepath.replace(DafnyPluginStrings.DAFNY_FILE, DafnyPluginStrings.DAFNY_OUTPUT_FILE_NAME));
        FileWriter writer = new FileWriter(file);

        //create new file and write the sourcecode into it.
        writer.write(sourcecode);
        writer.close();
        file.createNewFile();

        //create run Dafny.exe and create executable Dafny file
        if(DafnyConfigurationController.isMac())
            dafnyProcessBuilder = new ProcessBuilder(monoPath + DafnyPluginStrings.MONO_EXE, dafnyPath + DafnyPluginStrings.DAFNY_EXE, file.getPath());
        else
            dafnyProcessBuilder = new ProcessBuilder(dafnyPath + DafnyPluginStrings.DAFNY_EXE, file.getPath());

        dafnyProcess = dafnyProcessBuilder.start();
        while (dafnyProcess.isAlive());
        dafnyProcess.destroy();

        //After Dafny.exe, there should be a executable Dafny file in the same directory.
        compiledExe = new File(file.getPath().replace(DafnyPluginStrings.DAFNY_FILE, DafnyPluginStrings.EXE_FILE));

        //If the executable Dafny file does not exist, then there is no main method in the sourcecode.
        if (compiledExe.exists()) {
            if(DafnyConfigurationController.isMac()) {
                dafnyProcessBuilder = new ProcessBuilder(monoPath + DafnyPluginStrings.MONO_EXE, compiledExe.getPath());
            }
            else {
                dafnyProcessBuilder = new ProcessBuilder(compiledExe.getPath());
            }
        } else {
            return null;
        }

        run = dafnyProcessBuilder.start();
        inputStreamReader = new InputStreamReader(run.getInputStream());
        return new BufferedReader(inputStreamReader);
    }

    /**
     * Setter for project.
     * @param project the new project.
     */
    public static void setProject(Project project) {
        Dafny.project = project;
    }

    public static void endRunProcess() {
        run.destroy();
        run.destroyForcibly();
    }
}
