package DafnyGUI.DafnyConfiguration;

import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * DafnyConfigurationController creates the DafnyConfigurationWindowView and DafnyConfigurationModel. It handles the
 * communication between these classes. Notifies the DafnyConfigurationWindowView, if the Model has new results, so that
 * the DafnyConfigurationWindowView can update his elements. Notifies the model, if there was an action on the
 * DafnyConfigurationWindowView and need to do some calculations.
 *
 */
public class DafnyConfigurationController {

    private DafnyConfigurationWindowView dafnyConfigurationWindowView;
    private DafnyConfigurationModel dafnyConfigurationModel;

    /**
     * Constructor. Add all necessary ActionLister, initialize DafnyConfigurationWindowView and DafnyConfigurationModel
     * and load the configuration.
     */
    public DafnyConfigurationController() {
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView();
        dafnyConfigurationModel = new DafnyConfigurationModel(this);
        setTestSrcButtonListener();
        setRadioButtonListener();
        setSetSrcButtonListener();
        setDownloadButtonListener();
        loadPathAndOS(dafnyConfigurationModel.loadPathAndOS());
    }

    public JPanel getConfigurationPanel() {
        return dafnyConfigurationWindowView.getConfigurationPanel();
    }

    private void setTestSrcButtonListener() {
        dafnyConfigurationWindowView.getTestSrcButton().addActionListener(e -> {
            String srcPath = dafnyConfigurationWindowView.getPath();
            Boolean testResult = dafnyConfigurationModel.testDafnyPath(srcPath);
            dafnyConfigurationWindowView.setTestLED(testResult);
            dafnyConfigurationWindowView.setTestOutputTextPane(testResult);

            if (testResult) addServerDefinition(srcPath);

        });
    }

    private void setSetSrcButtonListener() {
        dafnyConfigurationWindowView.getSetSrcButton().addActionListener(e -> {
            String srcPath = dafnyConfigurationModel.selectFile();
            dafnyConfigurationWindowView.setPathText(srcPath);

            boolean testResult = dafnyConfigurationModel.testDafnyPath(srcPath);
            dafnyConfigurationWindowView.setTestLED(testResult);
            dafnyConfigurationWindowView.setTestOutputTextPane(testResult);

            if (testResult) addServerDefinition(srcPath);

        });
    }

    private void setDownloadButtonListener() {
        dafnyConfigurationWindowView.getDownloadSrcButton().addActionListener(e -> {
            try {
                dafnyConfigurationModel.openBrowserForDownload();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (URISyntaxException e1) {
                e1.printStackTrace();
            }
        });
    }

    private void setRadioButtonListener() {
        dafnyConfigurationWindowView.getWindowsRadioButton().addActionListener(e -> {
            boolean isSelected = dafnyConfigurationWindowView.getWindowsRadioButton().isSelected();
            if (isSelected) {
                dafnyConfigurationWindowView.setPathTextFieldsEnabled(true);
            }
        });

        dafnyConfigurationWindowView.getMacOSRadioButton().addActionListener(e -> {
            boolean isSelected = dafnyConfigurationWindowView.getMacOSRadioButton().isSelected();
            if (isSelected) {
                dafnyConfigurationWindowView.setPathTextFieldsEnabled(false);
            }
        });
    }

    public String[] getConfiguration() {
        String path = dafnyConfigurationWindowView.getPath();
        String os = dafnyConfigurationWindowView.getOS();
        return new String[]{path, os};
    }

    public void savePathandOS() {
        dafnyConfigurationModel.setPathAndOS();
    }

    private void loadPathAndOS(String[] loadPathAndOS) {
        dafnyConfigurationWindowView.setPathAndOs(loadPathAndOS);
    }

    private void addServerDefinition(String srcPath) {
        srcPath = srcPath +"\\LanguageServer.jar";
        IntellijLanguageClient.addServerDefinition(
                new RawCommandServerDefinition("dfy", new String[]{"java", "-jar", srcPath}));
    }


}
