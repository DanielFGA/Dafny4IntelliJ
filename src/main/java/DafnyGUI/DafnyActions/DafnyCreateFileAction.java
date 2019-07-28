package DafnyGUI.DafnyActions;

import DafnyCommunication.DafnyPluginStrings;
import DafnyLanguage.DafnyIcon;
import com.intellij.ide.actions.CreateFileAction;
import org.jetbrains.annotations.Nullable;

/**
 * Action for creating a new file.
 */
public class DafnyCreateFileAction extends CreateFileAction {

    /**
     * Constructor.
     */
    public DafnyCreateFileAction() {
        super(DafnyPluginStrings.DAFNY, "", DafnyIcon.FILE);
    }

    /**
     * Get the default extension.
     * @return the default extension.
     */
    @Nullable
    protected String getDefaultExtension() {
        return DafnyPluginStrings.DAFNY_FILE_ABBR;
    }

    /**
     * Get the file name,
     * @param newName the name, the user chooses,
     * @return the adjust name.
     */
    @Override
    protected String getFileName(String newName) {
        if (newName.endsWith(DafnyPluginStrings.DAFNY_FILE)) return newName;
        return newName + DafnyPluginStrings.DAFNY_FILE;
    }
}
