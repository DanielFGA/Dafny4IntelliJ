package DafnyGUI.DafnyConfiguration;

import javax.swing.*;

/**
 * The View for the Configurations. Used by the DafnyConfigurationController.
 */
public class DafnyConfigurationWindowView {

    /**
     * The main panel.
     */
    private JPanel configurationPanel;

    /**
     * The pane for the paths section.
     */
    private JPanel pathPane;

    /**
     * The text field for the Dafny path.
     */
    private JTextField pathTextField;

    /*
    The set path button for the Dafny path.
     */
    private JButton setFilesButton;

    /**
     * The label, that indicates the Mono path components.
     */
    private JLabel monoLabel;
    /**
     * The text field for the Mono path.
     */
    private JTextField monoPathTextField;
    /**
     * The set path button for the Mono path.
     */
    private JButton setMonoButton;

    /**
     * The pane for the download section.
     */
    private JPanel downloadButtonsPane;

    /**
     * The button to open the Dafny download website.
     */
    private JButton downloadFilesButton;

    /**
     * The button to open the Mono install website.
     */
    private JButton downloadMonoButton;

    /**
     * The DafnyConfigurationModel for updating the components.
     */
    private DafnyConfigurationModel dafnyConfigurationModel;

    /**
     * Constructor.
     *
     * @param dafnyConfigurationModel the DafnyConfigurationModel for updating the components.
     */
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

    /**
     * Updates the components with the DafnyConfigurationModel.
     */
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

    /**
     * Getter for the main panel.
     * @return the main panel.
     */
    public JPanel getConfigurationPanel() {
        return configurationPanel;
    }

    /**
     * Getter for the set Dafny path button.
     * @return the set Dafny path button.
     */
    public JButton getSetFilesButton() {
        return setFilesButton;
    }

    /**
     * Getter for the download Dafny button.
     * @return the set Dafny path button.
     */
    public JButton getDownloadFilesButton() {
        return downloadFilesButton;
    }

    /**
     * Getter for the Mono website button.
     * @return the Mono website button.
     */
    public JButton getDownloadMonoButton() {
        return downloadMonoButton;
    }

    /**
     * Getter for the Mono path text field.
     * @return the Mono path text field.
     */
    public JTextField getMonoPathTextField() {
        return monoPathTextField;
    }

    /**
     * Getter for the set Mono path button.
     * @return the set Mono path button.
     */
    public JButton getSetMonoButton() {
        return setMonoButton;
    }

    /**
     * Getter for the Dafny path text field.
     * @return the Dafyn poth text field.
     */
    public JTextField getPathTextField() {
        return pathTextField;
    }

}
