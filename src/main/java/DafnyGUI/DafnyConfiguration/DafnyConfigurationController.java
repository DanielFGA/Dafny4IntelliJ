package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyPluginStrings;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.options.ConfigurationException;
import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * DafnyConfigurationController creates the DafnyConfigurationWindowView and DafnyConfigurationModel. It handles the
 * communication between these classes. Notifies the DafnyConfigurationWindowView, if the model has new results, so that
 * the DafnyConfigurationWindowView can update his elements. Notifies the model, if there was an action on the
 * DafnyConfigurationWindowView and need to do some calculations.
 */
public class DafnyConfigurationController {

    private DafnyConfigurationWindowView dafnyConfigurationWindowView;
    private DafnyConfigurationModel dafnyConfigurationModel;
    /**
     * The DafnyStateService is responsible for saving data (persistent state).
     */
    private DafnyStateService dafnyStateService;

    /**
     * Constructor. Add all necessary action Listener, initialize DafnyConfigurationWindowView and DafnyConfigurationModel
     * and load the configuration.
     */
    public DafnyConfigurationController() {
        dafnyStateService = ServiceManager.getService(DafnyStateService.class);
        dafnyConfigurationModel = new DafnyConfigurationModel(dafnyStateService.getPath(), dafnyStateService.getMono());
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView(dafnyConfigurationModel);
        setTestFilesButtonListener();
        setSetFilesButtonListener();
        setDownloadButtonListener();
        setPathTextFieldListener();

        if (dafnyConfigurationModel.isMac()) {
            setSetMonoButtonListener();
            setTestMonoButtonListener();
            setMonoPathTextFieldListener();
            setMonoDownloadButtonListener();
        }

        if (dafnyConfigurationModel.isWindows()) dafnyConfigurationWindowView.setWindowsView();

        dafnyConfigurationWindowView.updatePaths();
    }

    private void setPathTextFieldListener() {
        dafnyConfigurationWindowView.getPathTextField().getDocument().addDocumentListener(new DocumentListener() {

            private void action() {
                dafnyConfigurationModel.setFilesPath(dafnyConfigurationWindowView.getFilesPath());
                dafnyConfigurationWindowView.updateTests();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                action();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                action();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                action();
            }
        });
    }

    /**
     * Add the Action Listener to the "Test Source" - Button. ->
     * Tests if the path in the activated text field is correct and displays the solution on the view.
     * If the path is correct, then add the language server to the IntellijLanguageClient Definitions.
     */
    private void setTestFilesButtonListener() {
        dafnyConfigurationWindowView.getTestFilesButton().addActionListener(e -> {
            dafnyConfigurationWindowView.updatePaths();
        });
    }

    /**
     * Add the Action Listener to the "Set Source" - Button. ->
     * Opens a File Chooser (DIRECTORIES_ONLY)
     * Tests if the path in the activated text field is correct and displays the solution on the view.
     * If the path is correct, then add the language server to the IntellijLanguageClient Definitions.
     */
    private void setSetFilesButtonListener() {
        dafnyConfigurationWindowView.getSetFilesButton().addActionListener(e -> {
            String path = selectDirectory();
            if (path != null) {
                dafnyConfigurationModel.setFilesPath(path);
                dafnyConfigurationWindowView.updatePaths();
            }

        });
    }

    /**
     * Add the action listener to the "Download" - button. ->
     * Opens the download site for the files in the default web browser.
     */
    private void setDownloadButtonListener() {
        dafnyConfigurationWindowView.getDownloadFilesButton().addActionListener(e -> {
            openBrowser(DafnyPluginStrings.FILES_DOWNLOAD_LINK);
        });
    }

    private void setMonoPathTextFieldListener() {

        dafnyConfigurationWindowView.getMonoPathTextField().getDocument().addDocumentListener(new DocumentListener() {

            private void action() {
                dafnyConfigurationModel.setMonoPath(dafnyConfigurationWindowView.getMonoPath());
                dafnyConfigurationWindowView.updateTests();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                action();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                action();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                action();
            }
        });
    }

    private void setTestMonoButtonListener() {
        dafnyConfigurationWindowView.getTestMonoButton().addActionListener(e -> {
            dafnyConfigurationWindowView.updatePaths();
        });
    }

    private void setSetMonoButtonListener() {
        dafnyConfigurationWindowView.getSetMonoButton().addActionListener(e -> {
            String path = selectDirectory();
            if (path != null) {
                dafnyConfigurationModel.setMonoPath(path);
                dafnyConfigurationWindowView.updatePaths();
            }

        });
    }

    private void setMonoDownloadButtonListener() {
        dafnyConfigurationWindowView.getDownloadMonoButton().addActionListener(e -> {
            openBrowser(DafnyPluginStrings.MONO_DOWNLOAD_LINK);
        });
    }

    /**
     * Opens the download site for the files in the default web browser.
     */
    private void openBrowser(String link) {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Opens a File Chooser (DIRECTORIES_ONLY).
     *
     * @return the path of the choosen directory.
     */
    private String selectDirectory() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showDialog(null, DafnyPluginStrings.SET_PATH);
        File choice = chooser.getSelectedFile();
        return choice == null ? null : choice.getPath();
    }

    /**
     * Save the path as a persistent state.
     */
    private void save() {
        dafnyStateService.setPath(dafnyConfigurationModel.getDafnyPath());
        dafnyStateService.setMono(dafnyConfigurationModel.getMonoPath());
        if (dafnyConfigurationModel.testDafnyPath()) addServerDefinition(dafnyConfigurationModel.getDafnyPath());
    }

    /**
     * Add a new server definition to the IntellijLanguageClient.
     *
     * @param filesPath - the path of directory of the language server
     */
    private void addServerDefinition(String filesPath) {
        filesPath = filesPath + DafnyPluginStrings.LANGUAGE_SERVER_JAR;
        IntellijLanguageClient.addServerDefinition(
                new RawCommandServerDefinition(DafnyPluginStrings.DAFNY_FILE_ABBR, new String[]{DafnyPluginStrings.JAVA, DafnyPluginStrings.COMMAND_JAR, filesPath}));

    }

    public boolean validate() throws ConfigurationException {
        boolean testFilesResult = dafnyConfigurationModel.testDafnyPath();
        boolean testMonoResult = dafnyConfigurationModel.isMac() ? dafnyConfigurationModel.testMonoPath() : true;
        if (!testFilesResult) {
            throw new ConfigurationException("The path to the Dafny files/Language Server is not valid. Please check it again.", "Unvalid Dafny files/Language Server Path");
        } else if (!testMonoResult) {
            throw new ConfigurationException("The path to Mono is not valid. Please check it again.", "Unvalid Mono Path");
        } else {
            save();
        }
        return testFilesResult;
    }

    /**
     * Necessary for ConfigurableProvider and ModuleWizardStep to get the JPanel of DafnyConfigurationWindowView.
     */
    public JPanel getConfigurationPanel() {
        return dafnyConfigurationWindowView.getConfigurationPanel();
    }


}
