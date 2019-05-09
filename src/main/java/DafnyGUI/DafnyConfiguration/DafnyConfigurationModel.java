package DafnyGUI.DafnyConfiguration;

import com.intellij.openapi.components.ServiceManager;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import javax.swing.*;
import java.io.File;
import java.net.URISyntaxException;

public class DafnyConfigurationModel {

    private DafnyStateService dafnyStateService = ServiceManager.getService(DafnyStateService.class);
    private DafnyConfigurationController dafnyConfigurationController;

    public DafnyConfigurationModel(DafnyConfigurationController dafnyConfigurationController) {
        this.dafnyConfigurationController = dafnyConfigurationController;
    }

    public boolean testDafnyPath(String path) {
        File dafnyExe = new File(path + "\\Dafny.exe");
        File dafnyServer = new File(path + "\\DafnyServer.exe");
        File dafnyLanguageServer = new File(path + "\\LanguageServer.jar");
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

    public void setPathAndOS() {
        dafnyStateService.setPathAndOS(dafnyConfigurationController.getConfiguration());
    }


    public void openBrowserForDownload() throws IOException, URISyntaxException {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI("https://github.com/DanielFGA/DafnyPlugin4Intellij"));
        }
    }
}
