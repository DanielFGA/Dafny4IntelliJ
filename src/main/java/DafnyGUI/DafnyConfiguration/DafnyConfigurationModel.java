package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyPluginStrings;
import com.intellij.openapi.components.ServiceManager;
import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import javax.swing.*;
import java.io.File;
import java.net.URISyntaxException;

/**
 * DafnyConfigurationModel does the calculation and processing for the Dafny-Configurations.
 * DafnyConfigurationController creates and trigger the methods.
 */
public class DafnyConfigurationModel {

    /**
     * The DafnyStateService is responsible for saving data (persistent state).
     */
    private DafnyStateService dafnyStateService = ServiceManager.getService(DafnyStateService.class);


    /**
     * Checks if ithe files Dafny.exe, Dafny_Sever.exe and DafnyLanguageServer.jar exist in the given path.
     * @param path - the path, where the files should be stored
     * @return - true if all files exist, false if one file does not exist
     */
    public boolean testDafnyPath(String path) {
        File dafnyExe = new File(path + DafnyPluginStrings.DAFNY_EXE);
        File dafnyServer = new File(path + DafnyPluginStrings.DAFNY_SERVER_EXE);
        File dafnyLanguageServer = new File(path + DafnyPluginStrings.LANGUAGE_SERVER_JAR);
        return dafnyExe.exists() && dafnyServer.exists() && dafnyLanguageServer.exists();
    }

    /**
     * Opens a File Chooser (DIRECTORIES_ONLY).
     * @return the path of the choosen directory.
     */
    public String selectDirectory() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showDialog(null, DafnyPluginStrings.SET_PATH);
        return chooser.getSelectedFile().getPath();
    }

    /**
     * Load the persistent state of the configuration, consisting of path and os.
     * @return the path of the Dafny-Files and language Server and the chosen operating system.
     */
    public String[] loadPathAndOS() {
        return dafnyStateService.getPathAndOS();
    }

    /**
     * Save the persistent state of the configuration, consisting of path and os.
     */
    public void savePathAndOS(String[] configuration) {
        dafnyStateService.setPathAndOS(configuration);
    }

    /**
     * Opens the download site for the files in the default web browser.
     */
    public void openBrowserForDownload() {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(DafnyPluginStrings.DOWNLOAD_LINK));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Add a new server definition to the IntellijLanguageClient.
     * @param srcPath - the path of directory of the language server
     */
    public void addServerDefinition(String srcPath) {
        srcPath = srcPath + DafnyPluginStrings.LANGUAGE_SERVER_JAR;
        IntellijLanguageClient.addServerDefinition(
                new RawCommandServerDefinition(DafnyPluginStrings.DAFNY_FILE_ABBR, new String[]{DafnyPluginStrings.JAVA, DafnyPluginStrings.COMMAND_JAR, srcPath}));
    }
}
