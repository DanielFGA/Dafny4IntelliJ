import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;
import com.intellij.openapi.application.PreloadingActivity;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class DafnyPreloadingActivity extends PreloadingActivity {
    @Override
    public void preload(@NotNull ProgressIndicator indicator) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File("C:\\Users\\Daniel Figia\\IdeaProjects\\DafnyPlugin4Intellij\\Server.jar");
        System.out.println(file.exists());
        IntellijLanguageClient.addServerDefinition(new RawCommandServerDefinition("dfy", new String[]{"java", "-jar", "C:\\Users\\Daniel Figia\\IdeaProjects\\DafnyPlugin4Intellij\\Server3.jar"}));
    }
}
