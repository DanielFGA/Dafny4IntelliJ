package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyPluginStrings;

import java.awt.Color;

import javax.swing.*;

/**
 * The View for the Configurations. Used by the DafnyConfigurationController.
 */
public class DafnyConfigurationWindowView {

    private JPanel configurationPanel;

    private JTextField pathTextField;

    private JButton setSrcButton;
    private JButton testSrcButton;
    private JButton downloadSrcButton;

    private JLabel testFilesLED;
    private JTextPane filesTestOutputPane;
    private JLabel pathLabel;

    private JLabel monoLabel;
    private JTextField monoPathTextField;
    private JButton setMonoButton;
    private JPanel pathPane;
    private JButton testMonoButton;
    private JLabel testMonoLED;
    private JTextPane monoTestOutputPane;
    private JButton downloadMonoButton;
    private JPanel downloadButtonsPane;
    private JPanel testPane;

    /**
     * Update the content for the test output.
     * @param state - True for test was successfully, false for test was not successfully.
     */
    public void setFilesTestLEDAndOutput(Boolean state) {
        if (state) {
            filesTestOutputPane.setForeground(Color.GREEN);
            filesTestOutputPane.setText(DafnyPluginStrings.DAFNY_FILES_FOUND);
            testFilesLED.setForeground(Color.GREEN);
        } else {
            filesTestOutputPane.setForeground(Color.RED);
            filesTestOutputPane.setText(DafnyPluginStrings.DAFNY_FILES_NOT_FOUND);
            testFilesLED.setForeground(Color.RED);
        }
    }

    public void setMonoTestLEDAndOutput(Boolean state) {
        if (state) {
            monoTestOutputPane.setForeground(Color.GREEN);
            monoTestOutputPane.setText(DafnyPluginStrings.MONO_FOUND);
            testMonoLED.setForeground(Color.GREEN);
        } else {
            monoTestOutputPane.setForeground(Color.RED);
            monoTestOutputPane.setText(DafnyPluginStrings.MONO_NOT_FOUND);
            testMonoLED.setForeground(Color.RED);
        }
    }

    /**
     * Update one of the path text field related to the currently selected operating system.
     * @param pathText - the path, that gets written in the text field.
     */
    public void setPathText(String pathText) {
        pathTextField.setText(pathText);
    }

    public void setMonoPathText(String monoPathText) {
        monoPathTextField.setText(monoPathText);
    }

    /**
     * @return - The text on the currently activated text field.
     */
    public String getFilesPath() {
        return pathTextField.getText();
    }

    public String getMonoPath() {
        return monoPathTextField.getText();
    }

    public JPanel getConfigurationPanel() {
        return configurationPanel;
    }

    public JButton getTestFilesButton() {
        return testSrcButton;
    }

    public JButton getSetFilesButton() {
        return setSrcButton;
    }

    public JButton getDownloadFilesButton() {
        return downloadSrcButton;
    }

    public JButton getDownloadMonoButton() {
        return downloadMonoButton;
    }

    public JButton getTestMonoButton() {
        return testMonoButton;
    }

    public JTextField getMonoPathTextField() {
        return monoPathTextField;
    }

    public JButton getSetMonoButton() {
        return setMonoButton;
    }

    public JTextField getPathTextField() {
        return pathTextField;
    }

    public void setWindowsView() {
        pathPane.remove(monoLabel);
        pathPane.remove(monoPathTextField);
        pathPane.remove(setMonoButton);
        testPane.remove(testMonoLED);
        testPane.remove(testMonoButton);
        testPane.remove(monoTestOutputPane);
        downloadButtonsPane.remove(downloadMonoButton);
    }


}
