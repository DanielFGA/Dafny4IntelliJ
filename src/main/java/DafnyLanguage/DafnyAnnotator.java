package DafnyLanguage;

import DafnyLanguage.psi.DafnyFile;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import Dafny.DafnyResponse;
import Dafny.Dafny;
import org.jetbrains.annotations.NotNull;

public class DafnyAnnotator implements Annotator {

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element.toString().equals(DafnyFile.getInstance().toString())) {
            for (DafnyResponse r : Dafny.getDiagnosticList(element.getText(), element.getContainingFile().getVirtualFile().getPath())) {
                holder.createAnnotation(r.getHighlightSeverity(), r.getTextRange(), r.getMessage());
            }
        }
    }

}
