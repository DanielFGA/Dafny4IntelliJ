package DafnyGUI.DafnyConfiguration;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.options.ConfigurationException;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static DafnyCommunication.DafnyPluginStrings.*;

/**
 * DafnyConfigurationController creates the DafnyConfigurationWindowView and DafnyConfigurationModel. It handles the
 * communication between these classes. Notifies the DafnyConfigurationWindowView, if the model has new results, so that
 * the DafnyConfigurationWindowView can updateVerifyEnd his elements. Notifies the model, if there was an action on the
 * DafnyConfigurationWindowView and there is new data. Add action listener to the DafnyConfigurationWindowView components.
 */
public class DafnyConfigurationController {

    /**
     * The view of the DafnyConfiguration.
     */
    private DafnyConfigurationWindowView dafnyConfigurationWindowView;

    /**
     * The model of the DafnyConfiguration.
     */
    private DafnyConfigurationModel dafnyConfigurationModel;

    /**
     * The DafnyStateService is responsible for saving data (persistent state).
     */
    private DafnyStateService dafnyStateService;

    /**
     * Constructor. Add all necessary action Listener, initialize DafnyConfigurationWindowView and DafnyConfigurationModel
     * and load the configuration. If os is Mac, then two extra listener are added.
     */
    public DafnyConfigurationController() {
        dafnyStateService = ServiceManager.getService(DafnyStateService.class);
        if (isMac())
            dafnyConfigurationModel = new DafnyConfigurationModel(dafnyStateService.getPath(), dafnyStateService.getMono(), OS_MACOS);
        else
            dafnyConfigurationModel = new DafnyConfigurationModel(dafnyStateService.getPath(),null, OS_WINDOWS);

        dafnyConfigurationWindowView = new DafnyConfigurationWindowView(dafnyConfigurationModel);

        addSetFilesButtonListener();
        addDownloadButtonListener();

        if (dafnyConfigurationModel.isMac()) {
            addSetMonoButtonListener();
            addMonoDownloadButtonListener();
        }

        dafnyConfigurationWindowView.update();
    }

    /**
     * Add the Action Listener to the "Set Files Path" - Button. ->
     * Opens a File Chooser (DIRECTORIES_ONLY).
     * Update the model with the selected path and updateVerifyEnd the view.
     */
    private void addSetFilesButtonListener() {
        dafnyConfigurationWindowView.getSetFilesButton().addActionListener(e -> {
            String path = selectDirectory(false);
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
        dafnyConfigurationWindowView.getDownloadFilesButton().addActionListener(e -> openBrowser(FILES_DOWNLOAD_LINK));

    }

    /**
     * Add the Action Listener to the "Set Mono Path" - Button. ->
     * Opens a File Chooser (DIRECTORIES_ONLY).
     * Update the model with the selected path and updateVerifyEnd the view.
     */
    private void addSetMonoButtonListener() {
        dafnyConfigurationWindowView.getSetMonoButton().addActionListener(e -> {
            String path = selectDirectory(true);
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
        dafnyConfigurationWindowView.getDownloadMonoButton().addActionListener(e -> openBrowser(MONO_DOWNLOAD_LINK));
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
     * @return the path of the choosen directory.
     */
    private String selectDirectory(boolean mono) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (mono) {
            if (dafnyConfigurationModel.getMonoPath() != null)
                chooser.setCurrentDirectory(new File(dafnyConfigurationModel.getMonoPath()));
        } else {
            if (dafnyConfigurationModel.getDafnyPath() != null)
                chooser.setCurrentDirectory(new File(dafnyConfigurationModel.getDafnyPath()));
        }
        chooser.showDialog(null, SET_PATH);
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
    }

    /**
     * Validate the input in the path text fields. If input is valid, the data will be saved.
     * @return input is valid -> true, else false.
     * @throws ConfigurationException - If input is not valid, an IntelliJ-specific exception is displayed.
     */
    public boolean validate() throws ConfigurationException {
        dafnyConfigurationModel.setMonoPath(dafnyConfigurationWindowView.getMonoPath());
        dafnyConfigurationModel.setFilesPath(dafnyConfigurationWindowView.getFilesPath());
        boolean testFilesResult = dafnyConfigurationModel.testDafnyPath();
        //if os is windows, the mono test result is always true, to skip the second if-statement.
        boolean testMonoResult = dafnyConfigurationModel.testMonoPath();
        if (!testFilesResult) {
            throw new ConfigurationException(INVALID_PATH_MESSAGE, INVALID_PATH_TITLE);
        } else if (!testMonoResult) {
            throw new ConfigurationException(INVALID_MONO_MESSAGE, INVALID_MONO_TITLE);
        } else {
            save();
        }
        return true;
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
        return System.getProperty("os.name").startsWith(OS_MACOS);
    }

    public static boolean pathsAreValid(String dafny, String mono) {
        DafnyConfigurationModel testPathModel = new DafnyConfigurationModel(dafny, mono, isMac() ? OS_MACOS : OS_WINDOWS);
        return testPathModel.testDafnyPath() && testPathModel.testMonoPath();
    }

}