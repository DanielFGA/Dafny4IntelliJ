package DafnyLanguage.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import org.jetbrains.annotations.NotNull;

public class DafnyFile extends PsiFileBase{
    @NotNull
    @Override
    public FileType getFileType() {
        return null;
    }
}
