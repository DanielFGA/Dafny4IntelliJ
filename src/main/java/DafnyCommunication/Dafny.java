package DafnyCommunication;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import DafnyGUI.DafnyConfiguration.DafnyStateService;
import DafnyGUI.DafnyToolWindow.DafnyToolWindow;
import com.intellij.codeInsight.daemon.DaemonCodeAnalyzer;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

import java.io.*;
import java.util.*;

import static DafnyCommunication.DafnyPluginStrings.*;

/**
 * Provides the connection to the DafnyServer and Dafny. Handles the verification and the running.
 */
public class Dafny {

    /**
     * The DafnyConnectionProvider provides a connection to the Dafny Server (DafnyServer.exe).
     * The DafnyConnectionProvider receive a filename and sourcecode and
     * send it to the Dafny Server for the verification.
     */
    private DafnyConnectionProvider dafnyConnectionProvider;

    /**
     * Every file, which was send to the DafnyConnectionProver will be mapped to his verification state.
     * True for no errors during the verification, false if at least one error occurred.
     */
    private Map<String, Boolean> fileToVerifiedState = new HashMap<>();

    /**
     * Saves the responses from the DafnyServer in a map grouped by the filename.
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
     * The process of running dafny programs.
     */
    private Process dafnyRunProcess;

    /**
     * List with all created DafnyToolWindows
     */
    private DafnyToolWindow dafnyToolWindow;

    /**
     * Constructor. Load the path for dafny and mono from DafnyStateService.
     * If the path for dafny is null, then the DafnyConnectionProvider will not be initialize.
     */
    public Dafny() throws IOException {
        initDafnyConnectionProvider();
    }

    /**
     * Initialize the DafnyConnectionProvider.
     */
    private void initDafnyConnectionProvider() throws IOException {
        dafnyPath = ServiceManager.getService(DafnyStateService.class).getPath();
        monoPath = ServiceManager.getService(DafnyStateService.class).getMono();

        if (DafnyConfigurationController.pathsAreValid(dafnyPath, monoPath)) {
            dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);
        }
    }

    /**
     * Shutdown the current DafnyConnectionProvider and initialize a new one.
     */
    public void reset(Project project) throws IOException {
        if (dafnyConnectionProvider != null) {
            dafnyConnectionProvider.disconnect();
        }

        initDafnyConnectionProvider();

        fileToDafnyResponse.clear();
        fileToVerifiedState.clear();

        DaemonCodeAnalyzer.getInstance(project).restart(); //Restart the inspection.
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
        List<DafnyResponse> dafnyResponses;

        //Update the DafnyToolWindow
        if (dafnyToolWindow != null) dafnyToolWindow.updateVerificationStart(filename);

        if (!isConnected()) {
            return new ArrayList<>();
        }

        dafnyResponses = dafnyConnectionProvider.sendData(sourcecode, filename);

        Collections.sort(dafnyResponses);

        //Update fileToVerifiedState
        fileToVerifiedState.put(filename, true);
        //Search for an error.
        for (DafnyResponse d : dafnyResponses) {
            if (d.getHighlightSeverity().equals(HighlightSeverity.ERROR)) {
                fileToVerifiedState.put(filename, false);
                break; //Because, if one error is found, there is no need check the other responses
            }

        }

        //Update fileToDafnyResponse
        if (fileToDafnyResponse.containsKey(filename)) {
            fileToDafnyResponse.get(filename).clear();
            fileToDafnyResponse.get(filename).addAll(dafnyResponses);
        } else {
            fileToDafnyResponse.put(filename, dafnyResponses);
        }

        if (dafnyToolWindow != null) dafnyToolWindow.updateVerificationEnd(filename);

        return dafnyResponses;
    }

    /**
     * Creates from a sourcecode a new Dafny file and use this file as parameter for the Dafny.exe.
     * Dafny.exe creates from this file a executable dafny file. This file will be executed and the output stream will
     * be connected to a BufferReader. This BufferReader will be returned.
     * @param filepath the path where the original Dafny file lays.
     * @param sourcecode the sourcecode for the new Dafny file.
     * @return the BufferReader, which is connected to the executable dafny file.
     */
    public BufferedReader run(String filepath, String sourcecode) throws IOException, InterruptedException {

        ProcessBuilder dafnyProcessBuilder;
        File compiledExe;
        InputStreamReader inputStreamReader;
        File file = new File(filepath.replace(DAFNY_FILE, DAFNY_OUTPUT_FILE_NAME));
        FileWriter writer = new FileWriter(file);

        //create new file and write the sourcecode into it.
        writer.write(sourcecode);
        writer.close();
        file.createNewFile();

        //run Dafny.exe and create executable Dafny file
        if(DafnyConfigurationController.isMac())
            dafnyProcessBuilder = new ProcessBuilder(monoPath + MONO_FRAMEWORK, dafnyPath + DAFNY_EXE, file.getPath());
        else
            dafnyProcessBuilder = new ProcessBuilder(dafnyPath + DAFNY_EXE, file.getPath());

        dafnyRunProcess = dafnyProcessBuilder.start();
        dafnyRunProcess.waitFor();
        dafnyRunProcess.destroy();

        //After Dafny.exe, there should be a executable Dafny file in the same directory.
        compiledExe = new File(file.getPath().replace(DAFNY_FILE, EXE_FILE));

        //If the executable Dafny file does not exist, then there is no main method in the sourcecode.
        if (compiledExe.exists()) {
            if(DafnyConfigurationController.isMac())
                dafnyProcessBuilder = new ProcessBuilder(monoPath + MONO_FRAMEWORK, compiledExe.getPath());
            else dafnyProcessBuilder = new ProcessBuilder(compiledExe.getPath());
        } else return null;

        dafnyRunProcess = dafnyProcessBuilder.start();
        inputStreamReader = new InputStreamReader(dafnyRunProcess.getInputStream());
        return new BufferedReader(inputStreamReader);
    }

    /**
     * Method for properly end the dafnyRunProcess.
     */
    public void endRunProcess() {
        dafnyRunProcess.destroy();
        dafnyRunProcess.destroyForcibly();
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
     * Checks if a file is verified.
     * @param file the file to be checked.
     * @return if the file is verified true, else false.
     */
    public List<DafnyResponse> getDafnyResponse(String file) {
        return fileToDafnyResponse.containsKey(file) ? fileToDafnyResponse.get(file) : new ArrayList<>();
    }

    /**
     * Checks if the connection to the DafnyServer is valid.
     * @return true if the connection is valid, else false.
     */
    public boolean isConnected() {
        return dafnyConnectionProvider != null && dafnyConnectionProvider.isConnected();
    }

    /**
     * Setter for the DafnyToolWindow.
     * @param dafnyToolWindow the new Dafny Tool Window.
     */
    public void setToolWindow(DafnyToolWindow dafnyToolWindow) {
        this.dafnyToolWindow = dafnyToolWindow;
    }

}
