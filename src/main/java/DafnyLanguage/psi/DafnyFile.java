package DafnyLanguage.psi;

import DafnyLanguage.DafnyFileType;
import DafnyLanguage.DafnyLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DafnyFile extends PsiFileBase {

    public static DafnyFile INSTANCE;

    public DafnyFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, DafnyLanguage.INSTANCE);
        INSTANCE = this;
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DafnyFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Dafny File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

    public static DafnyFile getInstance() {
        return INSTANCE;
    }
}
