package DafnyGUI.DafnyConfiguration;

import javax.swing.*;

/**
 * The View for the Configurations. Used by the DafnyConfigurationController.
 */
public class DafnyConfigurationWindowView {

    private JPanel configurationPanel;

    private JPanel pathPane;
    private JTextField pathTextField;
    private JButton setFilesButton;
    private JLabel monoLabel;
    private JTextField monoPathTextField;
    private JButton setMonoButton;

    private JPanel downloadButtonsPane;
    private JButton downloadFilesButton;
    private JButton downloadMonoButton;

    private DafnyConfigurationModel dafnyConfigurationModel;

    public DafnyConfigurationWindowView(DafnyConfigurationModel dafnyConfigurationModel) {
        this.dafnyConfigurationModel = dafnyConfigurationModel;

        //If os is Windows, the monospecific elements are removed.
        if (dafnyConfigurationModel.isWindows()) {
            pathPane.remove(monoLabel);
            pathPane.remove(monoPathTextField);
            pathPane.remove(setMonoButton);
            downloadButtonsPane.remove(downloadMonoButton);
        }
    }

    public void update() {
        pathTextField.setText(dafnyConfigurationModel.getDafnyPath());
        if (dafnyConfigurationModel.isMac()) monoPathTextField.setText(dafnyConfigurationModel.getMonoPath());
    }


    /**
     * Getter for the text in the path text field.
     * @return - The text in the path text field.
     */
    public String getFilesPath() {
        return pathTextField.getText();
    }

    /**
     * Getter for the text in the mono text field.
     * @return - The text in the mono text field.
     */
    public String getMonoPath() {
        return monoPathTextField.getText();
    }

    public JPanel getConfigurationPanel() {
        return configurationPanel;
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
