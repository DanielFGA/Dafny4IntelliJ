package DafnyLanguage;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static DafnyCommunication.DafnyPluginStrings.*;

public class DafnyFileType extends LanguageFileType{

    public static final DafnyFileType INSTANCE = new DafnyFileType();

    protected DafnyFileType() {
        super(DafnyLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return FILE_TYPE;
    }

    @NotNull
    @Override
    public String getDescription() {
        return FILE_TYPE_DESCRIPTION;
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DAFNY_FILE_ABBR;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return DafnyIcon.FILE;
    }
}
