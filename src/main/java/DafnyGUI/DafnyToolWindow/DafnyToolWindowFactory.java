package DafnyGUI.DafnyToolWindow;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyResponse;

import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static DafnyCommunication.DafnyPluginStrings.*;

public class DafnyToolWindowFactory implements ToolWindowFactory {

    private DafnyToolWindowView dafnyToolWindowView = new DafnyToolWindowView();
    private Project project;
    private Boolean isRunning = false;
    private Dafny dafny;

    public DafnyToolWindowFactory() {

        dafny = ServiceManager.getService(Dafny.class);

        addVerifyButtonListener();
        addRunButtonListener();
        addResetButtonListener();

        if (!dafny.isConnected()) {
            dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
        }
    }

    private void addResetButtonListener() {
        dafnyToolWindowView.getResetButton().addActionListener(e -> {

            dafnyToolWindowView.writeOutput(DAFNY_RESET_START);

            if (isRunning) isRunning = false;

            try {
                dafny.reset();
                dafnyToolWindowView.writeOutput(DAFNY_RESET_END);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
                return;
            }
        });
    }

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

            if (!file.endsWith(DAFNY_FILE)) {
                dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                return;
            }

            dafnyToolWindowView.writeOutput(getOutput(file));
        });
    }

    private void addRunButtonListener() {
        dafnyToolWindowView.getRunButton().addActionListener(e -> {

            String file;
            String sourcecode;

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
                return;
            }

            dafnyToolWindowView.writeOutput(COMPILING);

            if (!dafnyFileSelected()) {
                dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                return;
            }

            file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();
            sourcecode = FileEditorManager.getInstance(project).getSelectedTextEditor().getDocument().getText();

            System.out.println(sourcecode);

            if (!file.endsWith(DAFNY_FILE)) {
                dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
                return;
            }

            dafnyToolWindowView.getRunButton().setEnabled(false);
            dafnyToolWindowView.getVerifyButton().setEnabled(false);

            if (!dafny.fileIsVerified(file)) {
                dafnyToolWindowView.writeOutput(getOutput(file));
                dafnyToolWindowView.getRunButton().setEnabled(true);
                dafnyToolWindowView.getVerifyButton().setEnabled(true);
                return;
            }

            ApplicationManager.getApplication().executeOnPooledThread(() -> {
                try {
                    isRunning = true;
                    BufferedReader bufferedReader = dafny.run(file, sourcecode);
                    String line;
                    String output = "";
                    if (bufferedReader == null) {
                        dafnyToolWindowView.writeOutput(NO_MAIN_METHOD);
                        if (DafnyConfigurationController.isMac()) {
                            deleteFiles(file, new String[]{DLL_MDB_FILE_ABBR, DAFNY_FILE_ABBR, DLL_FILE_ABBR});
                        } else {
                            deleteFiles(file, new String[]{PDB_FILE_ABBR, DAFNY_FILE_ABBR, DLL_FILE_ABBR});
                        }
                        dafnyToolWindowView.getRunButton().setEnabled(true);
                        dafnyToolWindowView.getVerifyButton().setEnabled(true);
                    } else {
                        while ((line = bufferedReader.readLine()) != null && isRunning) {
                            output += line + "\n";
                        }
                        if (isRunning) dafnyToolWindowView.writeOutput(output.trim());
                        else
                            dafnyToolWindowView.writeOutput(COMPILING_CANCEL);
                        bufferedReader.close();
                        dafny.endRunProcess();
                        if (DafnyConfigurationController.isMac()) {
                            deleteFiles(file, new String[]{EXE_MDB_FILE_ABBR, DAFNY_FILE_ABBR, EXE_FILE_ABBR});
                        } else {
                            deleteFiles(file, new String[]{PDB_FILE_ABBR, DAFNY_FILE_ABBR, EXE_FILE_ABBR});
                        }

                        dafnyToolWindowView.getRunButton().setEnabled(true);
                        dafnyToolWindowView.getVerifyButton().setEnabled(true);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });
        });
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(dafnyToolWindowView.getDafnyMainPanel(), DAFNY_TOOL_WINDOW, false);
        toolWindow.getContentManager().addContent(content);
        dafny.setProject(project);
        this.project = project;
    }

    private void deleteFiles(String file, String[] abbr) {
        for (String abb : abbr) {
            System.out.println(file.replace(DAFNY_FILE, OUTPUT_FILE_NAME + abb));
            File actualFile = new File(file.replace(DAFNY_FILE, OUTPUT_FILE_NAME + abb));
            while (actualFile.exists()) actualFile.delete();
        }
    }

    private String getOutput(String file) {
        dafnyToolWindowView.writeOutput(VERIFYING);
        String output = "";
        List<DafnyResponse> dafnyResponseList = dafny.getDafnyResponse(file);

        if (dafnyResponseList.isEmpty()) output = NOT_VERIFIED_MESSAGE;
        else {
            for (DafnyResponse response : dafnyResponseList) {
                output += response;
            }
        }
        return output;
    }

    private boolean dafnyFileSelected() {
        return !(FileEditorManager.getInstance(project).getSelectedEditor() == null || FileEditorManager.getInstance(project).getSelectedEditor().getFile() == null);
    }
}
