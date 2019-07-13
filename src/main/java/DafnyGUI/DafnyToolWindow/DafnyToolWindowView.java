package DafnyGUI.DafnyToolWindow;

import javax.swing.*;
import java.awt.*;

import static DafnyCommunication.DafnyPluginStrings.*;

public class DafnyToolWindowView {

    private JEditorPane dafnyConsole;
    private JPanel dafnyMainPanel;
    private JButton verifyButton;
    private JButton runButton;
    private JButton resetButton;
    private JLabel verificationStateLabel;

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

    public void setVerificationState(boolean state) {
        if (state)  {
            verificationStateLabel.setText(VERIFIED);
            verificationStateLabel.setForeground(Color.GREEN);
        }
        else {
            verificationStateLabel.setText(NOT_VERIFIED);
            verificationStateLabel.setForeground(Color.RED);
        }
    }


}
