package DafnyGUI.DafnyToolWindow;

import javax.swing.*;
import java.awt.*;

import static DafnyCommunication.DafnyPluginStrings.NOT_VERIFIED;
import static DafnyCommunication.DafnyPluginStrings.VERIFIED;

/**
 * Represent the visual view for the Dafny tool window.
 */
public class DafnyToolWindowView {

    /**
     * The main panel.
     */
    private JPanel dafnyMainPanel;

    /**
     * The output console.
     */
    private JEditorPane dafnyConsole;

    /**
     * The button for verify a Dafny program.
     */
    private JButton verifyButton;

    /**
     * The button for running a Dafny program.
     */
    private JButton runButton;

    /**
     * The button for resetting Dafny.
     */
    private JButton resetButton;

    /**
     * Indicates if the current open program is verified.
     */
    private JLabel verificationStateLabel;

    /**
     * Writes text in the console.
     *
     * @param output the text for the console.
     */
    public void writeOutput(String output) {
        dafnyConsole.setText(output);
    }

    /**
     * Getter for the main panel.
     * @return the main panel.
     */
    public JPanel getDafnyMainPanel() {
        return dafnyMainPanel;
    }

    /**
     * Getter for the verify button.
     * @return the verify button.
     */
    public JButton getVerifyButton() {
        return verifyButton;
    }

    /**
     * Getter for the run button.
     * @return the run button.
     */
    public JButton getRunButton() {
        return runButton;
    }

    /**
     * The Getter for the reset button.
     * @return the reset button.
     */
    public JButton getResetButton() {
        return resetButton;
    }

    /**
     * Update the verification state label.
     * @param state the new state.
     */
    public void setVerificationState(boolean state) {
        if (state)  {
            verificationStateLabel.setText(VERIFIED);
            verificationStateLabel.setForeground(Color.GREEN);
        } else {
            verificationStateLabel.setText(NOT_VERIFIED);
            verificationStateLabel.setForeground(Color.RED);
        }
    }


}
