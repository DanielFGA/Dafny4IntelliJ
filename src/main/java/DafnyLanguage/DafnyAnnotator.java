package DafnyLanguage;

import DafnyGUI.DafnyConfiguration.DafnyStateService;
import DafnyLanguage.psi.DafnyFile;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.psi.PsiElement;
import DafnyCommunication.DafnyConnectionProvider;
import DafnyCommunication.DafnyResponse;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.List;

public class DafnyAnnotator implements Annotator {

    private static DafnyConnectionProvider dafnyConnectionProvider;
    private static List<DafnyResponse> diagnosticList;

    public DafnyAnnotator() throws IOException {
        String dafnyPath = ServiceManager.getService(DafnyStateService.class).getPath();
        String monoPath = ServiceManager.getService(DafnyStateService.class).getMono();
        if (dafnyConnectionProvider == null) dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);
    }

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element.toString().equals(DafnyFile.getInstance().toString())) {
            diagnosticList = dafnyConnectionProvider.sendData(element.getText(), element.getContainingFile().getVirtualFile().getPath());
            for (DafnyResponse r : diagnosticList) {
                holder.createAnnotation(r.getHighlightSeverity(), r.getTextRange(), r.getMessage());
            }
        }
    }

    public static void resetProvider() throws IOException {
        if (dafnyConnectionProvider != null) {
            dafnyConnectionProvider.disconnect();
        }
        String dafnyPath = ServiceManager.getService(DafnyStateService.class).getPath();
        String monoPath = ServiceManager.getService(DafnyStateService.class).getMono();
        dafnyConnectionProvider = new DafnyConnectionProvider(dafnyPath, monoPath);
    }

    public static void isVerifid() {
        //TODO
    }

    public static String unparsedResponse() {
        return dafnyConnectionProvider.getUnparsedResponse();
    }
}
