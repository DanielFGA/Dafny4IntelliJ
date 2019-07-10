package DafnyGUI.DafnyToolWindow;

import DafnyCommunication.DafnyPluginStrings;

import javax.swing.*;
import java.awt.*;

import static DafnyCommunication.DafnyPluginStrings.*;

public class DafnyToolWindowView {

    private JEditorPane dafnyConsole;
    private JPanel dafnyMainPanel;
    private JButton verifyButton;
    private JButton runButton;
    private JButton resetButton;
    private JLabel verfiedStateLabel;

    public void writeOutput(String output) {
        dafnyConsole.setText(output);
    }

    public JPanel getDafnyMainPanel() {
        return dafnyMainPanel;
    }

    public JButton getVerifyButton() {
        return verifyButton;
    }

    public JButton getRunButton() {
        return runButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setVerifiedState(boolean state) {
        if (state)  {
            verfiedStateLabel.setText(VERIFIED);
            verfiedStateLabel.setForeground(Color.GREEN);
        }
        else {
            verfiedStateLabel.setText(NOT_VERIFIED);
            verfiedStateLabel.setForeground(Color.RED);
        }
    }


}
