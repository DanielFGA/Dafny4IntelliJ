package DafnyGUI.DafnyConfiguration;

import Dafny.Dafny;
import DafnyGUI.DafnyPluginStrings;
import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.options.ConfigurationException;

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
 * DafnyConfigurationWindowView and there is new data. Add action listener to the DafnyConfigurationWindowView components.
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
     * and load the configuration. If os is Mac, then four extra listener are added.
     */
    public DafnyConfigurationController() {
        dafnyStateService = ServiceManager.getService(DafnyStateService.class);
        dafnyConfigurationModel = new DafnyConfigurationModel(dafnyStateService.getPath(), dafnyStateService.getMono(), System.getProperty("os.name").startsWith("Mac") ? "Mac" : "Windows");
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView(dafnyConfigurationModel);
        addTestFilesButtonListener();
        addSetFilesButtonListener();
        addDownloadButtonListener();
        addPathTextFieldListener();

        if (dafnyConfigurationModel.isMac()) {
            addSetMonoButtonListener();
            addTestMonoButtonListener();
            addMonoPathTextFieldListener();
            addMonoDownloadButtonListener();
        }

        dafnyConfigurationWindowView.updatePaths();
    }

    /**
     * Add new DocumentListener to the text field for the files path. With every new input, the model and the view
     * are updated.
     */
    private void addPathTextFieldListener() {
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
     * Add the Action Listener to the "Test Files Path" - Button. -> Updates the paths in the view.
     */
    private void addTestFilesButtonListener() {
        dafnyConfigurationWindowView.getTestFilesButton().addActionListener(e -> {
            dafnyConfigurationWindowView.updatePaths();
        });
    }

    /**
     * Add the Action Listener to the "Set Files Path" - Button. ->
     * Opens a File Chooser (DIRECTORIES_ONLY).
     * Update the model with the selected path and update the view.
     */
    private void addSetFilesButtonListener() {
        dafnyConfigurationWindowView.getSetFilesButton().addActionListener(e -> {
            String path = selectDirectory();
            if (path != null) { //path == null, no path selected.
                dafnyConfigurationModel.setFilesPath(path);
                dafnyConfigurationWindowView.updatePaths();
            }
        });
    }

    /**
     * Add the action listener to the "Download" - button. ->
     * Opens the download site for the files in the default web browser.
     */
    private void addDownloadButtonListener() {
        dafnyConfigurationWindowView.getDownloadFilesButton().addActionListener(e -> {
            openBrowser(DafnyPluginStrings.FILES_DOWNLOAD_LINK);
        });
    }

    /**
     * Add new DocumentListener to the text field for the files path. With every new input, the model and the view
     * are updated.
     */
    private void addMonoPathTextFieldListener() {

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

    /**
     * Add the Action Listener to the "Test Mono Path" - Button. -> Updates the paths in the view.
     */
    private void addTestMonoButtonListener() {
        dafnyConfigurationWindowView.getTestMonoButton().addActionListener(e -> {
            dafnyConfigurationWindowView.updatePaths();
        });
    }

    /**
     * Add the Action Listener to the "Set Mono Path" - Button. ->
     * Opens a File Chooser (DIRECTORIES_ONLY).
     * Update the model with the selected path and update the view.
     */
    private void addSetMonoButtonListener() {
        dafnyConfigurationWindowView.getSetMonoButton().addActionListener(e -> {
            String path = selectDirectory();
            if (path != null) {
                dafnyConfigurationModel.setMonoPath(path);
                dafnyConfigurationWindowView.updatePaths();
            }

        });
    }

    /**
     * Add the action listener to the "Download" - button. ->
     * Opens the download site for mono in the default web browser.
     */
    private void addMonoDownloadButtonListener() {
        dafnyConfigurationWindowView.getDownloadMonoButton().addActionListener(e -> {
            openBrowser(DafnyPluginStrings.MONO_DOWNLOAD_LINK);
        });
    }

    /**
     * Opens the download site for the given link in the default web browser.
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
    private void save()  {
        String filesPath =  dafnyConfigurationModel.getDafnyPath() + DafnyPluginStrings.LANGUAGE_SERVER_JAR;
        //Save the data
        dafnyStateService.setPath(dafnyConfigurationModel.getDafnyPath());
        dafnyStateService.setMono(dafnyConfigurationModel.getMonoPath());
        try {
            Dafny.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Validate the input in the path text fields. If input is valid, the data will be saved.
     * @return input is valid -> true, else false.
     * @throws ConfigurationException - If input is not valid, an IntelliJ-specific exception is displayed.
     */
    public boolean validate() throws ConfigurationException, IOException {
        boolean testFilesResult = dafnyConfigurationModel.testDafnyPath();
        //if os is windows, the mono test result is always true, to skip the second if-statement.
        boolean testMonoResult = dafnyConfigurationModel.isMac() ? dafnyConfigurationModel.testMonoPath() : true;
        if (!testFilesResult) {
            throw new ConfigurationException(DafnyPluginStrings.UNVALID_PATH_MESSAGE, DafnyPluginStrings.UNVALID_PATH_TITLE);
        } else if (!testMonoResult) {
            throw new ConfigurationException(DafnyPluginStrings.UNVALID_MONO_MESSAGE, DafnyPluginStrings.UNVALID_MONO_TITLE);
        } else {
            save();
        }
        return testFilesResult;
    }

    /**
     * Reset the Model and the View to the last saved data.
     */
    public void reset() {
        dafnyConfigurationWindowView.getPathTextField().setText(dafnyStateService.getPath());
        dafnyConfigurationWindowView.getMonoPathTextField().setText(dafnyStateService.getMono());
    }

    /**
     * Necessary for ConfigurableProvider and ModuleWizardStep to get the JPanel of DafnyConfigurationWindowView.
     */
    public JPanel getConfigurationPanel() {
        return dafnyConfigurationWindowView.getConfigurationPanel();
    }


}
