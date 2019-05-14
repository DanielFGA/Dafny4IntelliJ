package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyPluginStrings;

import java.awt.Color;

import javax.swing.*;

/**
 * The View for the Configurations. Used by the DafnyConfigurationController.
 */
public class DafnyConfigurationWindowView {

    private JPanel configurationPanel;

    private JTextField macOSPathTextField;
    private JTextField windowPathTextField;

    private ButtonGroup radioButtons;
    private JRadioButton macOSRadioButton;
    private JRadioButton windowsRadioButton;

    private JButton setSrcButton;
    private JButton testSrcButton;
    private JButton downloadSrcButton;

    private JLabel testLED;
    private JTextPane testOutputTextPane;

    public DafnyConfigurationWindowView() {
        radioButtons = new ButtonGroup();
        radioButtons.add(macOSRadioButton);
        radioButtons.add(windowsRadioButton);
    }

    /**
     * Update the content for the test output.
     * @param state - True for test was successfully, false for test was not successfully.
     */
    public void setTestLEDAndOutput(Boolean state) {
        if (state) {
            testOutputTextPane.setForeground(Color.GREEN);
            testOutputTextPane.setText(DafnyPluginStrings.DAFNY_FILES_FOUND);
            testLED.setForeground(Color.GREEN);
        } else {
            testOutputTextPane.setForeground(Color.RED);
            testOutputTextPane.setText(DafnyPluginStrings.DAFNY_FILES_NOT_FOUND);
            testLED.setForeground(Color.RED);
        }
    }

    /**
     * In related to the given state, enable one of the path text fields and disenable the other path text fields
     * @param state true -> enable the Windows path text field, false -> enable the OS path text field.
     */
    public void setPathTextFieldsEnabled(Boolean state) {
        if (state) {
            windowPathTextField.setEnabled(true);
            macOSPathTextField.setEnabled(false);
        } else {
            windowPathTextField.setEnabled(false);
            macOSPathTextField.setEnabled(true);
        }
    }

    /**
     * Update one of the path text field related to the currently selected operating system.
     * @param pathText - the path, that gets written in the text field.
     */
    public void setPathText(String pathText) {
        if (macOSRadioButton.isSelected()) macOSPathTextField.setText(pathText);
        else windowPathTextField.setText(pathText);
    }

    /**
     * Update one of the path text field and the operating system radio buttons related to the currently selected operating system.
     * @param pathAndOs - the path, that gets written in the text field.
     */
    public void setPathAndOs(String[] pathAndOs) {
        try {
            if (pathAndOs[1].equals(DafnyPluginStrings.OS_MACOS)) {
                macOSRadioButton.setSelected(true);
                macOSPathTextField.setText(pathAndOs[0]);
            } else {
                windowsRadioButton.setSelected(false);
                windowPathTextField.setText(pathAndOs[0]);
            }
        } catch (NullPointerException e) {
            //TODO HIER MUSS WAS HIN!
        }
    }

    /**
     * @return - The text on the currently activated text field.
     */
    public String getPath() {
        return macOSRadioButton.isSelected() ? macOSPathTextField.getText() : windowPathTextField.getText();
    }

    /**
     * @return - The name operating system (as String), in related to the currently selected radio button.
     */
    public String getOS() {
        return macOSRadioButton.isSelected() ? DafnyPluginStrings.OS_MACOS : DafnyPluginStrings.OS_WINDOWS;
    }

    public JPanel getConfigurationPanel() {
        return configurationPanel;
    }

    public JButton getTestSrcButton() {
        return testSrcButton;
    }

    public JButton getSetSrcButton() {
        return setSrcButton;
    }

    public JButton getDownloadSrcButton() {
        return downloadSrcButton;
    }

    public JRadioButton getWindowsRadioButton() {
        return windowsRadioButton;
    }

    public JRadioButton getMacOSRadioButton() {
        return macOSRadioButton;
    }

}
