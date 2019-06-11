package DafnyGUI.DafnyToolWindow;

import javax.swing.*;

public class DafnyToolWindowView {

    private JEditorPane dafnyConsole;
    private JPanel dafnyMainPanel;
    public JButton testButton;

    public void writeOutput(String output) {
        dafnyConsole.setText(output);
    }

    public JPanel getDafnyMainPanel() {
        return dafnyMainPanel;
    }

}
