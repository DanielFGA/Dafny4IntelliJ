package DafnyGUI.DafnyToolWindow;

import Dafny.Dafny;

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



public class DafnyToolWindowFactory implements ToolWindowFactory {

    private DafnyToolWindowView dafnyToolWindowView = new DafnyToolWindowView();
    private Project project;

    public DafnyToolWindowFactory() {

        dafnyToolWindowView.getVerifyButton().addActionListener(e -> {
            String file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();
            dafnyToolWindowView.writeOutput(Dafny.unparsedResponse(file).trim());
        });

        dafnyToolWindowView.getRunButton().addActionListener(e -> {

            if (FileEditorManager.getInstance(project).getSelectedEditor() == null || FileEditorManager.getInstance(project).getSelectedEditor().getFile() == null) {
                dafnyToolWindowView.writeOutput("No Dafny-File selected");
                return;
            }
            dafnyToolWindowView.getRunButton().setEnabled(false);
            String file = FileEditorManager.getInstance(project).getSelectedEditor().getFile().getPath();
            String sourcecode = FileEditorManager.getInstance(project).getSelectedTextEditor().getDocument().getText();

            if (!file.endsWith(".dfy")) {
                dafnyToolWindowView.writeOutput("No Dafny-File selected");
                return;
            }

            if (!Dafny.fileIsVerified(file)) {
                dafnyToolWindowView.writeOutput(Dafny.unparsedResponse(file).trim());
                dafnyToolWindowView.getRunButton().setEnabled(true);
                return;
            }
            try {
                BufferedReader bufferedReader = Dafny.run(file, sourcecode);
                String line;
                String output = "";
                if (bufferedReader == null) {
                    dafnyToolWindowView.writeOutput("No Main Method");
                    deleteFiles(file, new String[]{"pdb", "dfy", "dll"});
                    dafnyToolWindowView.getRunButton().setEnabled(true);
                } else {
                    while ((line = bufferedReader.readLine()) != null) {
                        output += line + "\n";
                    }
                    bufferedReader.close();
                    dafnyToolWindowView.writeOutput(output.trim());

                    deleteFiles(file, new String[]{"pdb", "dfy", "exe"});
                    dafnyToolWindowView.getRunButton().setEnabled(true);
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        dafnyToolWindowView.getResetButton().addActionListener(e -> {
            try {
                Dafny.reset();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(dafnyToolWindowView.getDafnyMainPanel(), "Dafny Tool Window", false);
        toolWindow.getContentManager().addContent(content);
        Dafny.setProject(project);
        this.project = project;
    }

    private void deleteFiles(String file, String[] abbr) {
        for (String abb : abbr) {
            while(!new File(file.replace(".dfy", "output." + abb)).delete());
        }
    }
}
