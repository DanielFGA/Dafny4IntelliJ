package DafnyGUI.DafnyToolWindow;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyPluginStrings;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.FileEditorManagerAdapter;
import com.intellij.openapi.fileEditor.FileEditorManagerEvent;
import com.intellij.openapi.fileEditor.FileEditorManagerListener;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.messages.MessageBus;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static DafnyCommunication.DafnyPluginStrings.*;

public class DafnyEditorManagerListener {

    private static List<DafnyProgramState> states = new ArrayList<>();

    public DafnyEditorManagerListener(Project project, DafnyToolWindowView dafnyToolWindowView) {

        MessageBus messageBus = project.getMessageBus();
        messageBus.connect().subscribe(FileEditorManagerListener.FILE_EDITOR_MANAGER, new FileEditorManagerListener() {
            @Override
            public void fileOpened(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
                if (file.getPath().endsWith(DAFNY_FILE)) {
                    DafnyProgramState newState = new DafnyProgramState(file.getPath(), null, false);
                    if (!states.contains(newState)) {
                        states.add(newState);
                    }
                }
            }

            @Override
            public void fileClosed(@NotNull FileEditorManager source, @NotNull VirtualFile file) {
                if (file.getPath().endsWith(DAFNY_FILE)) {
                    DafnyProgramState newState = new DafnyProgramState(file.getPath(), null, false);
                    if (states.contains(newState)) {
                        states.remove(newState);
                    }
                    dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                    dafnyToolWindowView.setVerifiedState(false);
                }
            }

            @Override
            public void selectionChanged(@NotNull FileEditorManagerEvent event) {

                if (event.getNewFile() != null) {
                    if (event.getNewFile().getPath().endsWith(DAFNY_FILE)) {
                        DafnyProgramState newState = (new DafnyProgramState(event.getNewFile().getPath(), null, false));
                        if (states.contains(newState)) {
                            newState = states.get(states.indexOf(newState));
                            dafnyToolWindowView.writeOutput(newState.getLastOutput());
                            dafnyToolWindowView.setVerifiedState(newState.isVerified());
                        } else {
                            newState.setLastOutput("");
                            states.add(newState);
                        }
                    }
                }

            }
        });
    }

    public void updateState(String filename, String output, boolean verfied) {
        DafnyProgramState updState = new DafnyProgramState(filename, output, verfied);
        if (states.contains(updState)) {
            states.remove(updState);
            states.add(updState);
        } else {
            states.add(updState);
        }
    }
}
