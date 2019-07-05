package DafnyCommunication;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import DafnyGUI.DafnyConfiguration.DafnyStateService;

import com.intellij.codeInsight.daemon.DaemonCodeAnalyzer;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

import java.io.*;
import java.util.*;

public class Dafny {

    /**
     * The DafnyConnectionProvider provides a connection to the Dafny Server (DafnyServer.exe).
     * The DafnyConnectionProvider receive a filename and sourcecode and send it to the Dafny Server for the verification.
     */
    private DafnyConnectionProvider dafnyConnectionProvider;

    /**
     * Every file, which was send to the DafnyConnectionProver will be mapped to his verification state.
     * True for no errors during the verification, false if at least one error occurred.
     */
    private Map<String, Boolean> fileToVerifiedState = new HashMap<>();

    /**
     * TODO
     */
    private Map<String, List<DafnyResponse>> fileToDafnyResponse = new HashMap<>();

    /**
     * The path to the Dafny files.
     */
    private String dafnyPath;

    /**
     * The path to Mono. (for macOS users)
     */
    private String monoPath;

    /**
     * The current project.
     */
    private Project project;

    /**
     * TODO
     */
    private Process dafnyRunProcess;

    /**
     * Constructor. Load the path for dafny and mono from DafnyStateService.
     * If the path for dafny is null, then the DafnyConnectionProvider will not be initialize.
     */
    public Dafny() throws IOException {
        dafnyPath = ServiceManager.getService(DafnyStateService.class).getPath();
        monoPath = ServiceManager.getService(DafnyStateService.class).getMono();
        //If the dafnyPath is null, then is no Dafny configuration saved.
        //Without valid configuration a DafnyConnectionProver can not be initialize.
        if (DafnyConfigurationController.pathAreValid(dafnyPath, monoPath)) {
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
    public List<DafnyResponse> getResponseList(String sourcecode, String filename) {
        if (dafnyConnectionProvider == null) {
            return new ArrayList<>();
        }

        List<DafnyResponse> dafnyResponses = dafnyConnectionProvider.sendData(sourcecode,filename);

        Collections.sort(dafnyResponses);

        //Update fileToVerifiedState
        fileToVerifiedState.put(filename, true);
        for (DafnyResponse d : dafnyResponses) {
            if (d.getHighlightSeverity().equals(HighlightSeverity.ERROR))
                fileToVerifiedState.put(filename, false);
        }

        if (fileToDafnyResponse.containsKey(filename)) {
            fileToDafnyResponse.get(filename).clear();
            fileToDafnyResponse.get(filename).addAll(dafnyResponses);
        } else {
            fileToDafnyResponse.put(filename, dafnyResponses);
        }

        return dafnyResponses;
    }

    /**
     * Shutdown the current DafnyConnectionProvider and initialize a new one.
     * @throws IOException
     */
    public void reset() throws IOException {
        if (dafnyConnectionProvider != null) {
            dafnyConnectionProvider.disconnect();
        }
        dafnyPath = ServiceManager.getService(DafnyStateService.class).getPath();
        monoPath = ServiceManager.getService(DafnyStateService.class).getMono();

        if (DafnyConfigurationController.pathAreValid(dafnyPath, monoPath)) {
            dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);
        }

        fileToDafnyResponse.clear();
        fileToVerifiedState.clear();
        if (project != null) DaemonCodeAnalyzer.getInstance(project).restart(); //Restart the Annotation.
    }

    /**
     * Checks if a file is verified.
     * @param file - the file to be checked.
     * @return false if DafnyConnectionProvider is null or file is not verified, true if the file is verified.
     */
    public boolean fileIsVerified(String file) {
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
    public BufferedReader run(String filepath, String sourcecode) throws IOException {

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

        dafnyRunProcess = dafnyProcessBuilder.start();
        while (dafnyRunProcess.isAlive());
        dafnyRunProcess.destroy();

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

        dafnyRunProcess = dafnyProcessBuilder.start();
        inputStreamReader = new InputStreamReader(dafnyRunProcess.getInputStream());
        return new BufferedReader(inputStreamReader);
    }

    /**
     * Setter for project.
     * @param project the new project.
     */
    public void setProject(Project project) {
        this.project = project;
    }

    public void endRunProcess() {
        dafnyRunProcess.destroy();
        dafnyRunProcess.destroyForcibly();
    }

    public List<DafnyResponse> getDafnyResponse(String file, String sourcecode) {
        //return fileToDafnyResponse.containsKey(file) ? fileToDafnyResponse.get(file) : new ArrayList<>();
        return getResponseList(sourcecode, file);
    }

    public boolean isConnected() {
        return dafnyConnectionProvider != null && dafnyConnectionProvider.isConnected();
    }

}
