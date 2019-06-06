import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import DafnyGUI.DafnyConfiguration.DafnyConfigurationModel;
import DafnyGUI.DafnyConfiguration.DafnyStateService;
import DafnyGUI.DafnyPluginStrings;
import com.intellij.openapi.components.ServiceManager;
import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;
import com.intellij.openapi.application.PreloadingActivity;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;


public class DafnyPreloadingActivity extends PreloadingActivity {
    @Override
    public void preload(@NotNull ProgressIndicator indicator) {

        String path = ServiceManager.getService(DafnyStateService.class).getPath();

        if (new DafnyConfigurationModel(path, "", System.getProperty("os.name").startsWith("Mac") ? "Mac" : "Windows").testDafnyPath()) {
            IntellijLanguageClient.addServerDefinition(new RawCommandServerDefinition(
                    "dfy",
                    new String[]{"java", "-jar", path + DafnyPluginStrings.LANGUAGE_SERVER_JAR}));
        }
    }
}
