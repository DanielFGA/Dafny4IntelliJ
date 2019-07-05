package DafnyGUI.DafnyToolWindow;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyPluginStrings;
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
            dafnyToolWindowView.writeOutput(DafnyPluginStrings.UNVALID_CONFIGURATION);
        }
    }

    private void addResetButtonListener() {
        dafnyToolWindowView.getResetButton().addActionListener(e -> {

            dafnyToolWindowView.writeOutput(DafnyPluginStrings.DAFNY_RESET_START);

            if (isRunning) isRunning = false;

            try {
                dafny.reset();
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.DAFNY_RESET_END);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.UNVALID_CONFIGURATION);
                return;
            }
        });
    }

    private void addVerifyButtonListener() {
        dafnyToolWindowView.getVerifyButton().addActionListener(e -> {
            String file;
            String sourcecode;

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.UNVALID_CONFIGURATION);
                return;
            }
            if (!dafnyFileSelected()) {
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.NO_SELECTED_FILE);
                return;
            }

            file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();
            sourcecode = FileEditorManager.getInstance(project).getSelectedTextEditor().getDocument().getText();

            if (!file.endsWith(DafnyPluginStrings.DAFNY_FILE)) {
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.NO_SELECTED_FILE);
                return;
            }

            dafnyToolWindowView.writeOutput(getOutput(file, sourcecode));
        });
    }

    private void addRunButtonListener() {
        dafnyToolWindowView.getRunButton().addActionListener(e -> {

            String file;
            String sourcecode;

            if (!dafny.isConnected()) {
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.UNVALID_CONFIGURATION);
                return;
            }

            dafnyToolWindowView.writeOutput(DafnyPluginStrings.COMPILING);

            if (!dafnyFileSelected()) {
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.NO_SELECTED_FILE);
                return;
            }

            file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();
            sourcecode = FileEditorManager.getInstance(project).getSelectedTextEditor().getDocument().getText();

            System.out.println(sourcecode);

            if (!file.endsWith(DafnyPluginStrings.DAFNY_FILE)) {
                dafnyToolWindowView.writeOutput(DafnyPluginStrings.NO_SELECTED_FILE);
                return;
            }

            dafnyToolWindowView.getRunButton().setEnabled(false);
            dafnyToolWindowView.getVerifyButton().setEnabled(false);

            if (!dafny.fileIsVerified(file)) {
                dafnyToolWindowView.writeOutput(getOutput(file, sourcecode));
                dafnyToolWindowView.getRunButton().setEnabled(true);
                dafnyToolWindowView.getVerifyButton().setEnabled(true);
                return;
            }

            ApplicationManager.getApplication().executeOnPooledThread(() ->
                    ApplicationManager.getApplication().runReadAction(() -> {
                        try {
                            isRunning = true;
                            BufferedReader bufferedReader = dafny.run(file, sourcecode);
                            String line;
                            String output = "";
                            if (bufferedReader == null) {
                                dafnyToolWindowView.writeOutput(DafnyPluginStrings.NO_MAIN_METHOD);
                                if (DafnyConfigurationController.isMac()) {
                                    deleteFiles(file, new String[]{DafnyPluginStrings.DLL_MDB_FILE_ABBR, DafnyPluginStrings.DAFNY_FILE_ABBR, DafnyPluginStrings.DLL_FILE_ABBR});
                                } else {
                                    deleteFiles(file, new String[]{DafnyPluginStrings.PDB_FILE_ABBR, DafnyPluginStrings.DAFNY_FILE_ABBR, DafnyPluginStrings.DLL_FILE_ABBR});
                                }
                                dafnyToolWindowView.getRunButton().setEnabled(true);
                                dafnyToolWindowView.getVerifyButton().setEnabled(true);
                            } else {
                                while ((line = bufferedReader.readLine()) != null && isRunning) {
                                    output += line + "\n";
                                }
                                if (isRunning) dafnyToolWindowView.writeOutput(output.trim());
                                else dafnyToolWindowView.writeOutput(DafnyPluginStrings.COMPILING_CANCEL);
                                bufferedReader.close();
                                dafny.endRunProcess();
                                if (DafnyConfigurationController.isMac()) {
                                    deleteFiles(file, new String[]{DafnyPluginStrings.EXE_MDB_FILE_ABBR, DafnyPluginStrings.DAFNY_FILE_ABBR, DafnyPluginStrings.EXE_FILE_ABBR});
                                } else {
                                    deleteFiles(file, new String[]{DafnyPluginStrings.PDB_FILE_ABBR, DafnyPluginStrings.DAFNY_FILE_ABBR, DafnyPluginStrings.EXE_FILE_ABBR});
                                }

                                dafnyToolWindowView.getRunButton().setEnabled(true);
                                dafnyToolWindowView.getVerifyButton().setEnabled(true);
                            }
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }));
        });
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(dafnyToolWindowView.getDafnyMainPanel(), DafnyPluginStrings.DAFNY_TOOL_WINDOW, false);
        toolWindow.getContentManager().addContent(content);
        dafny.setProject(project);
        this.project = project;
    }

    private void deleteFiles(String file, String[] abbr) {
        for (String abb : abbr) {
            System.out.println(file.replace(DafnyPluginStrings.DAFNY_FILE, DafnyPluginStrings.OUTPUT_FILE_NAME + abb));
            File actualFile = new File(file.replace(DafnyPluginStrings.DAFNY_FILE, DafnyPluginStrings.OUTPUT_FILE_NAME + abb));
            while(actualFile.exists()) actualFile.delete();
        }
    }

    private String getOutput(String file, String sourcecode) {
        dafnyToolWindowView.writeOutput(DafnyPluginStrings.VERIFYING);
        String output = "";
        List<DafnyResponse> dafnyResponseList = dafny.getDafnyResponse(file, sourcecode);

        if (dafnyResponseList.isEmpty()) output = DafnyPluginStrings.NOT_VERIFIED_MESSAGE;
        else {
            for (DafnyResponse response : dafnyResponseList) {
                output+=response;
            }
        }
        return output;
    }

    private boolean dafnyFileSelected() {
        return !(FileEditorManager.getInstance(project).getSelectedEditor() == null || FileEditorManager.getInstance(project).getSelectedEditor().getFile() == null);
    }
}
