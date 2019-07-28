package DafnyGUI.DafnyToolWindow;

import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorManagerEvent;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static DafnyCommunication.DafnyPluginStrings.DAFNY_FILE;
import static DafnyCommunication.DafnyPluginStrings.NO_SELECTED_FILE;

/**
 * Handles the editor events fileOpen, fileClosed, fileChanged and updates the DafnyToolWindows console.
 */
public class DafnyFileEditorManagerListener implements FileEditorManagerListener {

    /**
     * Saves all open Dafny programs
     */
    private List<DafnyProgramState> states = new ArrayList<>();

    /**
     * The current DafnyToolWindow for the current project.
     */
    private DafnyToolWindowView dafnyToolWindowView;

    /**
     * Constructor.
     * @param dafnyToolWindowView the current DafnyToolWindow
     */
    public DafnyFileEditorManagerListener(DafnyToolWindowView dafnyToolWindowView) {
        this.dafnyToolWindowView = dafnyToolWindowView;
    }

    /**
     * If a new file is opened, then check if file is a Dafny file.
     * If file is a Dafny file, add it to the DafnyProgrmmStates.
     * Otherwise update the DafnyToolWindow.
     */
    @Override
    public void fileOpened(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
        if (file.getPath().endsWith(DAFNY_FILE)) {
            DafnyProgramState newState = new DafnyProgramState(file.getPath());
            if (!states.contains(newState)) {
                states.add(newState);
            }
        } else {
            dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
            dafnyToolWindowView.setVerificationState(false);
        }
    }

    /**
     * If a file is closed, then check if file is a Dafny file.
     * If file is a Dafny file, remove it from the DafnyProgramStates.
     * Otherwise update the DafnyToolWindow.
     */
    @Override
    public void fileClosed(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
        if (file.getPath().endsWith(DAFNY_FILE)) {
            DafnyProgramState newState = new DafnyProgramState(file.getPath());
            if (states.contains(newState)) {
                states.remove(newState);
            }
            if (source.getSelectedEditor() == null || !source.getSelectedEditor().getFile().getPath().endsWith(".dfy")) {
                dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                dafnyToolWindowView.setVerificationState(false);
            }
        }
    }

    /**
     * If a file is changed, then check if file is a Dafny file.
     * If file is a Dafny file and it is already in the DafnyProgramStates:
     *      Update the DafnyToolWindow with its last output.
     * If file is a Dafny file and its no in the DafnyProgramStates:
     *      Add the file to the DafnyProgramStates.
     * If file is not a Dafny file, update the DafnyToolWindow.
     */
    @Override
    public void selectionChanged(@NotNull FileEditorManagerEvent event) {
        if (event.getNewFile() != null) { //event.getNewFile returns null, if no file is selected.
            if (event.getNewFile().getPath().endsWith(DAFNY_FILE)) {
                DafnyProgramState newState = (new DafnyProgramState(event.getNewFile().getPath()));
                if (states.contains(newState)) {
                    newState = states.get(states.indexOf(newState));
                    dafnyToolWindowView.writeOutput(newState.getLastOutput());
                    dafnyToolWindowView.setVerificationState(newState.isVerified());
                } else {
                    states.add(newState);
                }
            } else {
                dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                dafnyToolWindowView.setVerificationState(false);
            }
        }
    }

    /**
     * Updates a state.
     * @param filename the filename.
     * @param output the new output.
     * @param verfied the new verified state.
     */
    public void updateState(String filename, String output, boolean verfied) {
        DafnyProgramState updState = new DafnyProgramState(filename);
        updState.setLastOutput(output);
        updState.setVerified(verfied);
        if (states.contains(updState)) {
            states.remove(updState);
            states.add(updState);
        } else {
            states.add(updState);
        }
    }

    /**
     * Getter for the DafnyProgramStates.
     * @return the DafnyProgramStates.
     */
    public List<DafnyProgramState> getStates() {
        return states;
    }
}
