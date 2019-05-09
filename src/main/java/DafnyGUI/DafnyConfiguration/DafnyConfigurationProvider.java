package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyUI.DafnyConfigurationWindowView;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurableProvider;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DafnyConfigurationProvider extends ConfigurableProvider {

    private DafnyConfigurationWindowView dafnyConfigurationWindowView;
    private DafnyConfigurable dafnyConfigurable;

    public DafnyConfigurationProvider() {
        dafnyConfigurationWindowView = new DafnyConfigurationWindowView();
        dafnyConfigurable = new DafnyConfigurable(this);
        setTestSrcButtonListener();
        setRadioButtonListener();
        setSetSrcButtonListener();
        loadPathandOS(dafnyConfigurable.loadPathAndOS());
    }


    @Nullable
    @Override
    public Configurable createConfigurable() {
        return dafnyConfigurable;
    }

    public JPanel getConfigurationPanel() {
        return dafnyConfigurationWindowView.getConfigurationPanel();
    }

    private void setTestSrcButtonListener() {
        dafnyConfigurationWindowView.getTestSrcButton().addActionListener(e -> {
            String srcPath = dafnyConfigurationWindowView.getPath();
            Boolean testResult = dafnyConfigurable.testDafnyPath(srcPath);
            dafnyConfigurationWindowView.setTestLED(testResult);
            dafnyConfigurationWindowView.setTestOutputTextPane(testResult);
        });
    }

    private void setSetSrcButtonListener() {
        dafnyConfigurationWindowView.getSetSrcButton().addActionListener(e -> {
            String path = dafnyConfigurable.selectFile();
            dafnyConfigurationWindowView.setPathText(path);
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

    private void loadPathandOS(String[] loadPathAndOS) {
        dafnyConfigurationWindowView.setPathAndOs(loadPathAndOS);
    }

}
