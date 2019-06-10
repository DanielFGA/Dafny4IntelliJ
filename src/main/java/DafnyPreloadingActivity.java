import DafnyGUI.DafnyConfiguration.DafnyConfigurationController;
import DafnyGUI.DafnyConfiguration.DafnyConfigurationModel;
import DafnyGUI.DafnyConfiguration.DafnyStateService;
import DafnyGUI.DafnyPluginStrings;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.application.PreloadingActivity;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;


public class DafnyPreloadingActivity extends PreloadingActivity {
    @Override
    public void preload(@NotNull ProgressIndicator indicator) {

        String path = ServiceManager.getService(DafnyStateService.class).getPath();

    }
}
