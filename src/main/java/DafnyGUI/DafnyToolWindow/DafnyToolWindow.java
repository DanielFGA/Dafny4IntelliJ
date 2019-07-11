package DafnyGUI.DafnyToolWindow;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyResponse;
import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static DafnyCommunication.DafnyPluginStrings.*;

/**
 * Represent the Tool Window for the Dafny Plugin.
 */
public class DafnyToolWindow {

    /**
     * Visual UI for the tool window
     */
    private DafnyToolWindowView dafnyToolWindowView = new DafnyToolWindowView();

    /**
     * Handles the actions of open, change or close of an editor tab
     */
    private DafnyEditorManagerListener dafnyEditorManagerListener;

    /**
     * Project for the tool window
     */
    private Project project;

    /**
     * Indicate if a run process is running.
     */
    private Boolean isRunning = false;

    /**
     * Instance of Dafny (for verifying and running)
     */
    private Dafny dafny;

    /**
     * Constructor. Initialize the datafields and action listener.
     * @param project
     */
    public DafnyToolWindow(Project project) {
        dafny = ServiceManager.getService(Dafny.class);
        dafny.addToolWindow(this);
        this.project = project;

        dafnyEditorManagerListener = new DafnyEditorManagerListener(project,dafnyToolWindowView);

        addVerifyButtonListener();
        addRunButtonListener();
        addResetButtonListener();

        if (!dafny.isConnected()) {
            dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
        }

        if (!dafnyFileSelected()) {
            dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
        }
    }

    /**
     * Initialize the action listener for the reset button.
     */
    private void addResetButtonListener() {
        dafnyToolWindowView.getResetButton().addActionListener(e -> {

            dafnyToolWindowView.writeOutput(DAFNY_RESET_START);

            //Set running to false, because this will stop the running process
            if (isRunning) isRunning = false;

            try {
                dafny.reset(project);
                dafnyToolWindowView.writeOutput(DAFNY_RESET_END);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
            }
        });
    }

    /**
     * Initialize the action listener for the verify button.
     */
    private void addVerifyButtonListener() {
        dafnyToolWindowView.getVerifyButton().addActionListener(e -> {
            String file;

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
                return;
            }
            if (!dafnyFileSelected()) {
                dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                return;
            }

            file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();

            setVerifiedOutput(file);
        });
    }

    /**
     * Initialize the action listener for the run button.
     */
    private void addRunButtonListener() {
        dafnyToolWindowView.getRunButton().addActionListener(e -> {

            String file;
            String sourcecode;

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
                return;
            }

            if (!dafnyFileSelected()) {
                dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                return;
            }

            dafnyToolWindowView.writeOutput(COMPILING);

            file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();
            sourcecode = FileEditorManager.getInstance(project).getSelectedTextEditor().getDocument().getText();

            dafnyToolWindowView.getRunButton().setEnabled(false);
            dafnyToolWindowView.getVerifyButton().setEnabled(false);

            if (!dafny.fileIsVerified(file)) {
                setVerifiedOutput(file);
                dafnyToolWindowView.getRunButton().setEnabled(true);
                dafnyToolWindowView.getVerifyButton().setEnabled(true);
                return;
            }

            /**
             * The compiling and output run on a seperate thread to avoid UI freezes.
             */
            ApplicationManager.getApplication().executeOnPooledThread(() -> {
                try {
                    isRunning = true;
                    BufferedReader bufferedReader = dafny.run(file, sourcecode);
                    String line;
                    String output = "Output for file " + file + ":\n\n";

                    if (bufferedReader == null) {
                        //If BufferReader is null, then the sourcecode has no valid main-Method
                        setRunOutput(file, output + NO_MAIN_METHOD);
                        //Delete generated files.
                        if (DafnyConfigurationController.isMac()) {
                            deleteFiles(file, new String[]{DLL_MDB_FILE_ABBR, DAFNY_FILE_ABBR, DLL_FILE_ABBR});
                        } else {
                            deleteFiles(file, new String[]{PDB_FILE_ABBR, DAFNY_FILE_ABBR, DLL_FILE_ABBR});
                        }
                        dafnyToolWindowView.getRunButton().setEnabled(true);
                        dafnyToolWindowView.getVerifyButton().setEnabled(true);

                    } else {
                        //Read the output, while running is true.
                        while ((line = bufferedReader.readLine()) != null && isRunning) {
                            output += line + "\n";
                        }
                        //If running is still true, write the output
                        if (isRunning) setRunOutput(file, output);
                        //Else inform the user, that the compiling was canceled
                        else setRunOutput(file, output + COMPILING_CANCEL);
                        //Clean close of run process in Dafny and BufferReader.
                        bufferedReader.close();
                        dafny.endRunProcess();
                        //Delete generated files.
                        if (DafnyConfigurationController.isMac()) {
                            deleteFiles(file, new String[]{EXE_MDB_FILE_ABBR, DAFNY_FILE_ABBR, EXE_FILE_ABBR});
                        } else {
                            deleteFiles(file, new String[]{PDB_FILE_ABBR, DAFNY_FILE_ABBR, EXE_FILE_ABBR});
                        }

                        dafnyToolWindowView.getRunButton().setEnabled(true);
                        dafnyToolWindowView.getVerifyButton().setEnabled(true);
                    }
                } catch (IOException | InterruptedException e1) {
                    e1.printStackTrace();
                }
            });
        });
    }

    /**
     * Deletes all files that are named like file and ended with the given abbreviations.
     * @param file the file
     * @param abbr - the abbreviations
     */
    private void deleteFiles(String file, String[] abbr) {
        for (String abb : abbr) {
            File actualFile = new File(file.replace(DAFNY_FILE, OUTPUT_FILE_NAME + abb));
            while (actualFile.exists()) actualFile.delete(); //Brute force deleting
        }
    }

    /**
     * Notifies the tool window, that a verification for a certain file has started.
     * @param filename the file being verfied
     */
    public void updateVerifyStart(String filename) {
        //Find out the current open file
        String currentOpenFile = dafnyFileSelected() ?
                FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath() :
                "";
        //If the current open file is the same as the input file, then write the output to the console.
        if (filename.equals(currentOpenFile)) dafnyToolWindowView.writeOutput(VERIFYING);
        //Update the state for the file in the DafnyEditorManagerListener
        dafnyEditorManagerListener.updateState(filename, VERIFYING, false);
    }

    /**
     * Notifies the tool window, that a verification for a certain file has ended.
     * @param file the verified file
     */
    public void updateVerifyEnd(String file) {
        DafnyProgramState tempState = new DafnyProgramState(file, "", false);
        if (dafnyEditorManagerListener.getStates().contains(tempState)) {
            setVerifiedOutput(file);
        }
    }

    /**
     * Set the verify output for a certain file in the console
     * @param file the file to be checked
     */
    public void setVerifiedOutput(String file) {
        String output = "Verifying Result for file " + file + ":\n\n";
        //Get the current verification result for the file
        List<DafnyResponse> dafnyResponseList = dafny.getDafnyResponse(file);
        //Get the current open file
        String currentOpenFile = dafnyFileSelected() ?
                FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath() :
                "";

        //If the current verification result is empty, then the file is not verified yet.
        if (dafnyResponseList.isEmpty()) output = NOT_VERIFIED_MESSAGE;
        //Else prepare the output
        else {
            for (DafnyResponse response : dafnyResponseList) {
                output += response;
            }
        }

        //If the current open file is the same as the input file, then write the output to the console and updateVerifyEnd the
        //verification state label
        if (file.equals(currentOpenFile)) {
            dafnyToolWindowView.writeOutput(output);
            dafnyToolWindowView.setVerifiedState(dafny.fileIsVerified(file));
        }
        dafnyEditorManagerListener.updateState(file, output, dafny.fileIsVerified(file));
    }

    /**
     * Update the state for a certain file in the DafnyEditorManagerListener and write the output to the console
     * @param file the executed file
     * @param output the result of the execution
     */
    private void setRunOutput(String file, String output) {
        String currentOpenFile = dafnyFileSelected() ?
                FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath() :
                "";
        if (file.equals(currentOpenFile)) dafnyToolWindowView.writeOutput(output);
        dafnyEditorManagerListener.updateState(file, output, dafny.fileIsVerified(file));
    }

    /**
     * Checks if the a Dafny file is selected.
     * @return true if dafny file is selected, otherwise false
     */
    private boolean dafnyFileSelected() {
        if (project == null || project.isDisposed()) return false;
        if (FileEditorManager.getInstance(project).getSelectedEditor() == null) return false;
        if (FileEditorManager.getInstance(project).getSelectedEditor().getFile() == null) return false;
        if (!FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath().endsWith(".dfy")) return false;
        return true;
    }

    /**
     * Getter for the DafnyMainPanel
     * @return DafnyMainPanel
     */
    public JPanel getToolWindowMainPanel() {
        return dafnyToolWindowView.getDafnyMainPanel();
    }


}