package DafnyGUI.DafnyConfiguration;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * DafnyConfigurationController creates the DafnyConfigurationWindowView and DafnyConfigurationModel. It handles the
 * communication between these classes. Notifies the DafnyConfigurationWindowView, if the model has new results, so that
 * the DafnyConfigurationWindowView can update his elements. Notifies the model, if there was an action on the
 * DafnyConfigurationWindowView and need to do some calculations.
 *
 */
public class DafnyConfigurationController {

    private DafnyConfigurationWindowView dafnyConfigurationWindowView;
    private DafnyConfigurationModel dafnyConfigurationModel;

    /**
     * Constructor. Add all necessary action Listener, initialize DafnyConfigurationWindowView and DafnyConfigurationModel
     * and load the configuration.
     */
    public DafnyConfigurationController() {
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView();
        dafnyConfigurationModel = new DafnyConfigurationModel();
        setTestSrcButtonListener();
        setRadioButtonListener();
        setSetSrcButtonListener();
        setDownloadButtonListener();
        loadPathAndOS();
        testPath();
    }



    /**
     * Add the Action Listener to the "Test Source" - Button. ->
     *      Tests if the path in the activated text field is correct and displays the solution on the view.
     *      If the path is correct, then add the language server to the IntellijLanguageClient Definitions.
     */
    private void setTestSrcButtonListener() {
        dafnyConfigurationWindowView.getTestSrcButton().addActionListener(e -> {
            testPath();
        });
    }

    /**
     * Add the Action Listener to the "Set Source" - Button. ->
     *      Opens a File Chooser (DIRECTORIES_ONLY)
     *      Tests if the path in the activated text field is correct and displays the solution on the view.
     *      If the path is correct, then add the language server to the IntellijLanguageClient Definitions.
     */
    private void setSetSrcButtonListener() {
        dafnyConfigurationWindowView.getSetSrcButton().addActionListener(e -> {
            String srcPath = dafnyConfigurationModel.selectDirectory();
            dafnyConfigurationWindowView.setPathText(srcPath);
            testPath();
        });
    }

    /**
     * Add the action listener to the "Download" - button. ->
     *      Opens the download site for the files in the default web browser.
     */
    private void setDownloadButtonListener() {
        dafnyConfigurationWindowView.getDownloadSrcButton().addActionListener(e -> {
            dafnyConfigurationModel.openBrowserForDownload();
        });
    }

    /**
     * Add two action listener to the radio buttons. ->
     *      If one is selected, then deselect the other and enable the
     *      text field next to the selected radio button and disable the other text field, next to the deselected radio button.
     */
    private void setRadioButtonListener() {
        dafnyConfigurationWindowView.getWindowsRadioButton().addActionListener(e -> {
            boolean isSelected = dafnyConfigurationWindowView.getWindowsRadioButton().isSelected();
            if (isSelected) {
                dafnyConfigurationWindowView.setPathTextFieldsEnabled(true);
            }
        });

        dafnyConfigurationWindowView.getMacOSRadioButton().addActionListener(e -> {
            boolean isSelected = dafnyConfigurationWindowView.getMacOSRadioButton().isSelected();
            if (isSelected) {
                dafnyConfigurationWindowView.setPathTextFieldsEnabled(false);
            }
        });
    }

    /**
     * Test if the path in the enables text field is valid.
     * @return
     */
    public boolean testPath() {
        String srcPath = dafnyConfigurationWindowView.getPath();
        Boolean testResult = dafnyConfigurationModel.testDafnyPath(srcPath);
        dafnyConfigurationWindowView.setTestLEDAndOutput(testResult);
        if (testResult) addServerDefinition(srcPath);
        return testResult;
    }

    /**
     * Save the current input (path and os) as a persistent state.
     */
    public void savePathAndOS() {
        dafnyConfigurationModel.savePathAndOS(getConfiguration());
    }

    /**
     * Load the persistent state (path and os) and update the view.
     */
    private void loadPathAndOS() {
        dafnyConfigurationWindowView.setPathAndOs(dafnyConfigurationModel.loadPathAndOS());
    }

    /**
     * Add a new server definition to the IntellijLanguageClient.
     * @param srcPath - the path of directory of the language server
     */
    private void addServerDefinition(String srcPath) {
        dafnyConfigurationModel.addServerDefinition(srcPath);
    }

    /**
     * Loads the persist state of the configuration.
     * @return a string array with:
     * index 0 -> the path to the Dafny files and the language server.
     * index 1 -> the operating system
     */
    private String[] getConfiguration() {
        String path = dafnyConfigurationWindowView.getPath();
        String os = dafnyConfigurationWindowView.getOS();
        return new String[]{path, os};
    }

    /**
     * Necessary for ConfigurableProvider and ModuleWizardStep to get the JPanel of DafnyConfigurationWindowView.
     */
    public JPanel getConfigurationPanel() {
        return dafnyConfigurationWindowView.getConfigurationPanel();
    }


}
