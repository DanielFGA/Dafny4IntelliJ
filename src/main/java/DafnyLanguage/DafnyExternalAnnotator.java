package DafnyLanguage;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyResponse;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.ExternalAnnotator;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * The annotator for the error highlighting.
 */
public class DafnyExternalAnnotator extends ExternalAnnotator<DafnyVerificationInfo, List<DafnyResponse>> {

    /**
     * Collects infos about the file for the verification. The Dafny instance, the sourcecode and the path to the file are needed.
     * @return the Dafny instance, the sourcecode and the path to the file as a DafnyVerificationInfo-object.
     */
    @Override
    public DafnyVerificationInfo collectInformation(@NotNull PsiFile file, @NotNull Editor editor, boolean hasErrors) {
        String filename = file.getVirtualFile().getPath();
        String sourcecode = editor.getDocument().getText();
        Dafny dafny = file.getProject().getComponent(Dafny.class);
        return new DafnyVerificationInfo(filename, sourcecode, dafny);
    }

    /**
     * Request a verification with Dafny.
     * @param collectedInfo - the Dafny instance, the sourcecode and the path to the file as a DafnyVerificationInfo-object.
     * @return the responses from Dafny as a list.
     */
    @Nullable
    @Override
    public List<DafnyResponse> doAnnotate(DafnyVerificationInfo collectedInfo) {
        return collectedInfo.getDafny().getResponseList(collectedInfo.getSourcecode(), collectedInfo.getFile());
    }

    /**
     * Creates the error highlighting.
     * @param annotationResult the responses from Dafny as a list.
     */
    public void apply(@NotNull PsiFile file, List<DafnyResponse> annotationResult, @NotNull AnnotationHolder holder) {
        for (DafnyResponse r : annotationResult)
            holder.createAnnotation(r.getHighlightSeverity(), r.getTextRange(), r.getMessage());
    }

}
