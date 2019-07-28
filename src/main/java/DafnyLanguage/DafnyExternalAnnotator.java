package DafnyLanguage;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyResponse;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.ExternalAnnotator;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * The annotator for the error highlighting.
 */
public class DafnyExternalAnnotator extends ExternalAnnotator<String[], List<DafnyResponse>> {

    /**
     * The annotator need the instance of dafny for the verification.
     */
    private Dafny dafny = ServiceManager.getService(Dafny.class);

    /**
     * Collects infos about the file for the verification. The sourcecode and the path to the file are needed.
     *
     * @return the sourcecode and the path to the file as a string.
     */
    @Override
    public String[] collectInformation(@NotNull PsiFile file, @NotNull Editor editor, boolean hasErrors) {
        return new String[]{editor.getDocument().getText(), file.getVirtualFile().getPath()};
    }

    /**
     * Request a verification with Dafny.
     * @param collectedInfo - the sourcecode and the path to the file as a string.
     * @return the responses from Dafny as a list.
     */
    @Nullable
    @Override
    public List<DafnyResponse> doAnnotate(String[] collectedInfo) {
        return dafny.getResponseList(collectedInfo[0], collectedInfo[1]);
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
