package DafnyGUI.DafnyConfiguration;

import java.awt.Color;

import javax.swing.*;

public class DafnyConfigurationWindowView {

    private JPanel configurationPanel;
    private JRadioButton windowsRadioButton;
    private JTextField windowPathTextField;
    private JRadioButton macOSRadioButton;
    private JTextField macOSPathTextField;
    private JButton setSrcButton;
    private JButton testSrcButton;
    private JButton downloadSrcButton;
    private JLabel testLED;
    private JTextPane testOutputTextPane;
    private ButtonGroup radioButtons;

    public DafnyConfigurationWindowView() {
        radioButtons = new ButtonGroup();
        radioButtons.add(macOSRadioButton);
        radioButtons.add(windowsRadioButton);
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

    public String getPath() {
        return macOSRadioButton.isSelected() ? macOSPathTextField.getText() : windowPathTextField.getText();
    }

    public String getOS() {
        return macOSRadioButton.isSelected() ? "OS" : "WINDOWS";
    }

    public void setTestLED(Boolean state) {
        if (state) testLED.setForeground(Color.GREEN);
        else testLED.setForeground(Color.RED);
    }

    public void setTestOutputTextPane(Boolean state) {
        if (state) {
            testOutputTextPane.setForeground(Color.GREEN);
            testOutputTextPane.setText("Dafny Files and Language Server found.");
        } else {
            testOutputTextPane.setForeground(Color.RED);
            testOutputTextPane.setText("Dafny-Files/Languages Server not found. " +
                    "The Dafny-Verifier and the execution of the Dafny-Programmcode " +
                    "will not work without Dafny-Files and the Dafny Languages Server!");
        }
    }

    public void setPathTextFieldsEnabled(Boolean state) {
        if (state) {
            windowPathTextField.setEnabled(true);
            macOSPathTextField.setEnabled(false);
        } else {
            windowPathTextField.setEnabled(false);
            macOSPathTextField.setEnabled(true);
        }
    }

    public void setPathText(String pathText) {
        if (getMacOSRadioButton().isSelected()) macOSPathTextField.setText(pathText);
        else windowPathTextField.setText(pathText);
    }

    public void setPathAndOs(String[] pathAndOs) {
        try {
            if (pathAndOs[1].equals("OS")) {
                macOSRadioButton.setSelected(true);
                macOSPathTextField.setText(pathAndOs[0]);
            } else {
                windowsRadioButton.setSelected(false);
                windowPathTextField.setText(pathAndOs[0]);
            }
        } catch (NullPointerException e) {
        }
    }

}
