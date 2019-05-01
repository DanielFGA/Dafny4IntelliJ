package DafnyGUI;

import javax.swing.*;

public class DafnyToolWindow {

    private JEditorPane dafnyConsole;
    private JPanel dafnyMainPanel;
    public JButton testButton;

    private void writeOutput(String output) {
        dafnyConsole.setText(output);
    }

    public JPanel getDafnyMainPanel() {
        return dafnyMainPanel;
    }

}
