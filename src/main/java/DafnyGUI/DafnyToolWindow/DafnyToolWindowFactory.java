package DafnyGUI.DafnyToolWindow;

import DafnyCommunication.DafnyResponse;
import DafnyLanguage.DafnyAnnotator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DafnyToolWindowFactory implements ToolWindowFactory {

    private DafnyToolWindowView dafnyToolWindowView = new DafnyToolWindowView();
    private DafnyRunner dafnyRunner;
    private Project project;

    public DafnyToolWindowFactory() {
        dafnyToolWindowView.testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dafnyToolWindowView.writeOutput(DafnyAnnotator.unparsedResponse());
            }
        });
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(dafnyToolWindowView.getDafnyMainPanel(), "Dafny Tool Window", false);
        toolWindow.getContentManager().addContent(content);
        this.project = project;
    }
}
