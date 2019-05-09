package DafnyGUI.DafnyConfiguration;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.File;

public class DafnyConfigurable implements SearchableConfigurable {

    private DafnyConfigurationProvider dafnyConfigurationProvider;
    private DafnyStateService dafnyStateService = ServiceManager.getService(DafnyStateService.class);

    public DafnyConfigurable(DafnyConfigurationProvider dafnyConfigurationProvider) {
        this.dafnyConfigurationProvider = dafnyConfigurationProvider;
    }

    @NotNull
    @Override
    public String getId() {
        return "Dafny";
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Dafny";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        return dafnyConfigurationProvider.getConfigurationPanel();
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {
        dafnyStateService.setPathAndOS(dafnyConfigurationProvider.getConfiguration());
    }

    public boolean testDafnyPath(String path) {
        File dafnyExe = new File(path + "\\Dafny.exe");
        File dafnyServer = new File(path + "\\DafnyServer.exe");
        File dafnyLanguageServer = new File(path + "\\LanguageServer.jar");
        System.out.println(dafnyExe.getPath());
        System.out.println(dafnyServer.getPath());
        System.out.println(dafnyLanguageServer.getPath());
        return dafnyExe.exists() && dafnyServer.exists() && dafnyLanguageServer.exists();
    }

    public String selectFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showDialog(null, "Set Path");
        return chooser.getSelectedFile().getPath();
    }

    public String[] loadPathAndOS() {
        return dafnyStateService.getPathAndOS();
    }
}
