package DafnyGUI.DafnyToolWindow;

import javax.swing.*;
import java.awt.*;

public class DafnyToolWindowView {

    private JEditorPane dafnyConsole;
    private JPanel dafnyMainPanel;
    private JButton verifyButton;
    private JButton runButton;
    private JButton resetButton;

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

}
