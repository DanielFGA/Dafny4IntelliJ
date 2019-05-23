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

    private JButton setFilesButton;
    private JButton testFilesButton;
    private JButton downloadFilesButton;

    private JLabel testFilesLED;
    private JTextPane filesTestOutputPane;

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

    private DafnyConfigurationModel dafnyConfigurationModel;

    public DafnyConfigurationWindowView(DafnyConfigurationModel dafnyConfigurationModel) {
        this.dafnyConfigurationModel = dafnyConfigurationModel;
    }

    public void updatePaths() {

        pathTextField.setText(dafnyConfigurationModel.getDafnyPath());
        monoPathTextField.setText(dafnyConfigurationModel.getMonoPath());

    }

    public void updateTests() {
        if (dafnyConfigurationModel.testDafnyPath()) {
            filesTestOutputPane.setForeground(Color.GREEN);
            filesTestOutputPane.setText(DafnyPluginStrings.DAFNY_FILES_FOUND);
            testFilesLED.setForeground(Color.GREEN);
        } else {
            filesTestOutputPane.setForeground(Color.RED);
            filesTestOutputPane.setText(DafnyPluginStrings.DAFNY_FILES_NOT_FOUND);
            testFilesLED.setForeground(Color.RED);
        }

        if (dafnyConfigurationModel.testMonoPath()) {
            monoTestOutputPane.setForeground(Color.GREEN);
            monoTestOutputPane.setText(DafnyPluginStrings.MONO_FOUND);
            testMonoLED.setForeground(Color.GREEN);
        } else {
            monoTestOutputPane.setForeground(Color.RED);
            monoTestOutputPane.setText(DafnyPluginStrings.MONO_NOT_FOUND);
            testMonoLED.setForeground(Color.RED);
        }
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
        return testFilesButton;
    }

    public JButton getSetFilesButton() {
        return setFilesButton;
    }

    public JButton getDownloadFilesButton() {
        return downloadFilesButton;
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




}
