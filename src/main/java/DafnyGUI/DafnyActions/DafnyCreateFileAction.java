package DafnyGUI.DafnyActions;

import DafnyGUI.DafnyPluginStrings;
import DafnyLanguage.DafnyIcon;
import com.intellij.ide.actions.CreateFileAction;
import org.jetbrains.annotations.Nullable;

public class DafnyCreateFileAction extends CreateFileAction {

    public DafnyCreateFileAction() {
        super(DafnyPluginStrings.DAFNY_FILE, "", DafnyIcon.FILE);
    }

    @Nullable
    protected String getDefaultExtension() {
        return DafnyPluginStrings.DAFNY_FILE_ABBR;
    }
}
