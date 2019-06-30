package DafnyGUI.DafnyConfiguration;

import Dafny.Dafny;
import Dafny.DafnyPluginStrings;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.Consumer;
import com.intellij.util.download.DownloadableFileDescription;
import com.intellij.util.download.DownloadableFileService;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.ArrayList;

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
        dafnyConfigurationModel = new DafnyConfigurationModel(dafnyStateService.getPath(), dafnyStateService.getMono(),
                isMac() ? DafnyPluginStrings.OS_MACOS : DafnyPluginStrings.OS_WINDOWS);
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView(dafnyConfigurationModel);
        addSetFilesButtonListener();
        addDownloadButtonListener();
        addPathTextFieldListener();

        if (dafnyConfigurationModel.isMac()) {
            addSetMonoButtonListener();
            addMonoPathTextFieldListener();
            addMonoDownloadButtonListener();
        }

        dafnyConfigurationWindowView.update();
    }

    /**
     * Add new DocumentListener to the text field for the files path. With every new input, the model and the view
     * are updated.
     */
    private void addPathTextFieldListener() {
        dafnyConfigurationWindowView.getPathTextField().getDocument().addDocumentListener(new DocumentListener() {

            private void action() {
                dafnyConfigurationModel.setFilesPath(dafnyConfigurationWindowView.getFilesPath());
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
     * Add the Action Listener to the "Set Files Path" - Button. ->
     * Opens a File Chooser (DIRECTORIES_ONLY).
     * Update the model with the selected path and update the view.
     */
    private void addSetFilesButtonListener() {
        dafnyConfigurationWindowView.getSetFilesButton().addActionListener(e -> {
            String path = selectDirectory();
            if (path != null) { //path == null, no path selected.
                dafnyConfigurationModel.setFilesPath(path);
                dafnyConfigurationWindowView.update();
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
     * Add the Action Listener to the "Set Mono Path" - Button. ->
     * Opens a File Chooser (DIRECTORIES_ONLY).
     * Update the model with the selected path and update the view.
     */
    private void addSetMonoButtonListener() {
        dafnyConfigurationWindowView.getSetMonoButton().addActionListener(e -> {
            String path = selectDirectory();
            if (path != null) {
                dafnyConfigurationModel.setMonoPath(path);
                dafnyConfigurationWindowView.update();
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
        //Save the data
        dafnyStateService.setPath(dafnyConfigurationModel.getDafnyPath());
        dafnyStateService.setMono(dafnyConfigurationModel.getMonoPath());
        try {
            ServiceManager.getService(Dafny.class).reset();
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

    /**
     * Checks with System.getProperty if the operating system is macOS.
     * @return If operating systems is mac, then return false, else return false;
     */
    public static boolean isMac() {
        return !System.getProperty("os.name").startsWith(DafnyPluginStrings.OS_MACOS) ? true : false;
    }

    public static boolean pathAreValid(String dafny, String mono) {
        DafnyConfigurationModel testPathModel = new DafnyConfigurationModel(dafny, mono, isMac() ? DafnyPluginStrings.OS_MACOS : DafnyPluginStrings.OS_WINDOWS);
        return testPathModel.testDafnyPath() && testPathModel.testMonoPath();
    }


}
