package DafnyGUI.DafnyActions;

import Dafny.DafnyPluginStrings;
import DafnyLanguage.DafnyIcon;
import com.intellij.ide.actions.CreateFileAction;
import org.jetbrains.annotations.Nullable;

public class DafnyCreateFileAction extends CreateFileAction {

    public DafnyCreateFileAction() {
        super(DafnyPluginStrings.DAFNY, "", DafnyIcon.FILE);
    }

    @Nullable
    protected String getDefaultExtension() {
        return DafnyPluginStrings.DAFNY_FILE_ABBR;
    }

    @Override
    protected String getFileName(String newName) {
        if (getDefaultExtension() == null || newName.endsWith(DafnyPluginStrings.DAFNY_FILE)) {
            return newName;
        }
        return newName + "." + getDefaultExtension();
    }
}
