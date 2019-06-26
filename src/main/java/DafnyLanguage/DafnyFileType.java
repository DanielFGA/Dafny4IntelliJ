package DafnyLanguage;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DafnyFileType extends LanguageFileType{

    public static final DafnyFileType INSTANCE = new DafnyFileType();

    protected DafnyFileType() {
        super(DafnyLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Dafny File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Dafny language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "dfy";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return DafnyIcon.FILE;
    }
}
