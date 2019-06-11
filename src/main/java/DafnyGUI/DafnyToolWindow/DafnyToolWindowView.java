package DafnyGUI.DafnyToolWindow;

import javax.swing.*;

public class DafnyToolWindowView {

    private JEditorPane dafnyConsole;
    private JPanel dafnyMainPanel;
    public JButton testButton;
    private JButton button1;
    private JButton button2;

    public void writeOutput(String output) {
        dafnyConsole.setText(output);
    }

    public JPanel getDafnyMainPanel() {
        return dafnyMainPanel;
    }

}
