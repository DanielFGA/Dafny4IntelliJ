import DafnyGUI.DafnyConfiguration.DafnyStateService;
import com.intellij.openapi.components.ServiceManager;
import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;
import com.intellij.openapi.application.PreloadingActivity;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;


public class DafnyPreloadingActivity extends PreloadingActivity {
    @Override
    public void preload(@NotNull ProgressIndicator indicator) {
        String path;
        try {
            path = ServiceManager.getService(DafnyStateService.class).getPathAndOS()[0] + "\\LanguageServer.jar";
        } catch(NullPointerException e) {
            System.out.println("Plugin-Configuration wrong.");
            path = "";
        }

        System.out.println(path);
        IntellijLanguageClient.addServerDefinition(new RawCommandServerDefinition(
                "dfy",
                new String[]{"java", "-jar", path}));
    }
}
