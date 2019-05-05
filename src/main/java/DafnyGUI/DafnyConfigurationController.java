package DafnyGUI;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DafnyConfigurationController implements Configurable {

    public String getDisplayName() {
        return "Dafny Configuration";
    }

    public JComponent createComponent() {
        return null;
    }

    public boolean isModified() {
        return false;
    }

    public void apply() throws ConfigurationException {

    }
}
