package DafnyLanguage;

import Dafny.Dafny;
import Dafny.DafnyResponse;
import com.intellij.debugger.actions.ArrayFilterAction;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.ExternalAnnotator;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.psi.PsiFile;
import gherkin.lexer.Da;
import org.jetbrains.annotations.NotNull;
import com.intellij.codeInspection.GlobalSimpleInspectionTool;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DafnyExternalAnnotator extends ExternalAnnotator<List<DafnyResponse>, List<DafnyResponse>> {

    @Override
    public List<DafnyResponse> collectInformation(@NotNull PsiFile file, @NotNull Editor editor, boolean hasErrors) {
        if (file.getVirtualFile().getExtension().equals("dfy")) {
            return Dafny.getDiagnosticList(editor.getDocument().getText(), file.getVirtualFile().getPath());

        }
        return null;
    }

    @Nullable
    @Override
    public List<DafnyResponse> doAnnotate(List<DafnyResponse> collectedInfo) {
        return collectedInfo;
    }

    public void apply(@NotNull PsiFile file, List<DafnyResponse> annotationResult, @NotNull AnnotationHolder holder) {
        for (DafnyResponse r : annotationResult) {
            holder.createAnnotation(r.getHighlightSeverity(), r.getTextRange(), r.getMessage());
        }
    }
}
