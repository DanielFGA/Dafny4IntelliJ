package DafnyGUI.DafnyToolWindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import static DafnyCommunication.DafnyPluginStrings.DAFNY_TOOL_WINDOW;
import static DafnyLanguage.DafnyIcon.FILE;

/**
 * Factory for creating a DafnyToolWindow.
 */
public class DafnyToolWindowFactory implements ToolWindowFactory {

    /**
     * Creates the DafnyToolWindow.
     * @param project current project
     * @param toolWindow new tool window
     */
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        DafnyToolWindow dafnyToolWindow = new DafnyToolWindow(project);
        Content content = contentFactory.createContent(dafnyToolWindow.getToolWindowMainPanel(), DAFNY_TOOL_WINDOW, false);
        toolWindow.getContentManager().addContent(content);
        toolWindow.setIcon(FILE);
    }


}
