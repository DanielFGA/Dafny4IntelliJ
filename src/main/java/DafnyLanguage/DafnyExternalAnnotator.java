package DafnyLanguage;

import DafnyCommunication.Dafny;
import DafnyCommunication.DafnyPluginStrings;
import DafnyCommunication.DafnyResponse;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.ExternalAnnotator;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DafnyExternalAnnotator extends ExternalAnnotator<String[], List<DafnyResponse>> {

    @Override
    public String[] collectInformation(@NotNull PsiFile file, @NotNull Editor editor, boolean hasErrors) {
        if (file.getVirtualFile().getExtension().equals(DafnyPluginStrings.DAFNY_FILE_ABBR)) {
            return new String[]{editor.getDocument().getText(), file.getVirtualFile().getPath()};
        }
        return null;
    }

    @Nullable
    @Override
    public List<DafnyResponse> doAnnotate(String[] collectedInfo) {
        return ServiceManager.getService(Dafny.class).getResponseList(collectedInfo[0], collectedInfo[1]);
    }

    public void apply(@NotNull PsiFile file, List<DafnyResponse> annotationResult, @NotNull AnnotationHolder holder) {
        for (DafnyResponse r : annotationResult) {
            holder.createAnnotation(r.getHighlightSeverity(), r.getTextRange(), r.getMessage());
        }
    }

}
