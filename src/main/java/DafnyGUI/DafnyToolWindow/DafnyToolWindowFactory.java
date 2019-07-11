package DafnyGUI.DafnyToolWindow;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyResponse;
import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import DafnyLanguage.DafnyLanguage;
import com.intellij.codeInsight.daemon.DaemonCodeAnalyzer;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import DafnyLanguage.DafnyIcon;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static DafnyCommunication.DafnyPluginStrings.*;
import static DafnyLanguage.DafnyIcon.FILE;

public class DafnyToolWindowFactory implements ToolWindowFactory {

    private DafnyToolWindowView dafnyToolWindowView = new DafnyToolWindowView();
    private Project project;
    private Boolean isRunning = false;
    private Dafny dafny;
    private DafnyEditorManagerListener dafnyEditorManagerListener;

    public DafnyToolWindowFactory() {
        dafny = ServiceManager.getService(Dafny.class);
        dafny.setToolWindow(this);

        addVerifyButtonListener();
        addRunButtonListener();
        addResetButtonListener();

        if (!dafny.isConnected()) {
            dafnyToolWindowView.writeOutput(UNVALID_CONFIGURATION);
        }
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        toolWindow.setIcon(FILE);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(dafnyToolWindowView.getDafnyMainPanel(), DAFNY_TOOL_WINDOW, false);
        toolWindow.getContentManager().addContent(content);
        this.project = project;
        dafny.setProject(project);
        dafnyEditorManagerListener = new DafnyEditorManagerListener(project, dafnyToolWindowView);

        if (dafnyFileSelected()) {
            String file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();
            String sourcecode = FileEditorManager.getInstance(project).getSelectedTextEditor().getDocument().getText();
            dafny.getResponseList(sourcecode, file);
        } else {
            dafnyToolWindowView.writeOutput(NO_SELECTED_FILE);
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

            setVerifiedOutput(file);
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

            dafnyToolWindowView.getRunButton().setEnabled(false);
            dafnyToolWindowView.getVerifyButton().setEnabled(false);

            if (!dafny.fileIsVerified(file)) {
                setVerifiedOutput(file);
                dafnyToolWindowView.getRunButton().setEnabled(true);
                dafnyToolWindowView.getVerifyButton().setEnabled(true);
                return;
            }

            ApplicationManager.getApplication().executeOnPooledThread(() -> {
                try {
                    isRunning = true;
                    BufferedReader bufferedReader = dafny.run(file, sourcecode);
                    String line;
                    String output = "Output for file " + file + ":\n\n";
                    if (bufferedReader == null) {
                        setRunOutput(file, output + NO_MAIN_METHOD);
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
                        if (isRunning) setRunOutput(file, output);
                        else
                            setRunOutput(file, output + COMPILING_CANCEL);
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
                } catch (IOException | InterruptedException e1) {
                    e1.printStackTrace();
                }
            });
        });
    }

    private void deleteFiles(String file, String[] abbr) {
        for (String abb : abbr) {
            File actualFile = new File(file.replace(DAFNY_FILE, OUTPUT_FILE_NAME + abb));
            while (actualFile.exists()) actualFile.delete();
        }
    }

    public void setVerfiedStart(String filename) {
        String currentOpenFile = dafnyFileSelected() ?
                FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath() :
                "";
        if (filename.equals(currentOpenFile)) dafnyToolWindowView.writeOutput(VERIFYING);
        if (dafnyEditorManagerListener != null) dafnyEditorManagerListener.updateState(filename, VERIFYING, false);
    }

    public void setVerifiedOutput(String file) {
        //dafnyToolWindowView.writeOutput(VERIFYING);
        String output = "Verifying Result for file " + file + ":\n\n";
        List<DafnyResponse> dafnyResponseList = dafny.getDafnyResponse(file);
        String currentOpenFile = dafnyFileSelected() ?
                FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath() :
                "";

        if (dafnyResponseList.isEmpty()) output = NOT_VERIFIED_MESSAGE;
        else {
            for (DafnyResponse response : dafnyResponseList) {
                output += response;
            }
        }

        if (file.equals(currentOpenFile)) {
            dafnyToolWindowView.writeOutput(output);
            dafnyToolWindowView.setVerifiedState(dafny.fileIsVerified(file));
        }
        if (dafnyEditorManagerListener != null) dafnyEditorManagerListener.updateState(file, output, dafny.fileIsVerified(file));
    }

    private void setRunOutput(String file, String output) {
        String currentOpenFile = dafnyFileSelected() ? FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath() : "";
        if (file.equals(currentOpenFile)) dafnyToolWindowView.writeOutput(output);
        dafnyEditorManagerListener.updateState(file, output, dafny.fileIsVerified(file));
    }

    private boolean dafnyFileSelected() {
        if (project == null || project.isDisposed()) return false;
        if (FileEditorManager.getInstance(project).getSelectedEditor() == null) return false;
        if (FileEditorManager.getInstance(project).getSelectedEditor().getFile() == null) return false;
        if (!FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath().endsWith(".dfy")) return false;
        return true;
    }



}
