package DafnyGUI.DafnyConfiguration;

import DafnyGUI.DafnyPluginStrings;
import com.intellij.openapi.components.*;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name = DafnyPluginStrings.DAFNY,
        storages = @Storage(DafnyPluginStrings.DAFNY_CONFIGURATION_XML)
)

/**
 * DafnyStateServer is responsible for saving the configuration data. It implements the PersistentStateComponent from IntelliJ OpenAPI and
 * save the data as a persistent state. The data is saved in the xml file DafnyConfiguration.xml.
 * The data, which get saved, is the path to the Dafny files/Language server and the selected operating system.
 *
 * DafnyConfigurationProvider is registered in the plugin.xml as a Application Service.
 */
public class DafnyStateService implements PersistentStateComponent<DafnyStateService> {

    /**
     * The path to the Dafny files/Language Server.
     */
    private String path;
    /**
     * The path to the mono.
     */
    private String mono;

    @Nullable
    @Override
    public DafnyStateService getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull DafnyStateService state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    /**
     * @return the path to the Dafny-files/Language Server.
     */
    public String getPath() {
        return path;
    }

    /**
     * Set the path to the Dafny-files/Language Server and save.
     * @param path - the new path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the path to mono.
     */
    public String getMono() {
        return mono;
    }

    /**
     * Set the path to the Dafny-files/Language Server and save.
     * @param mono - the new mono path
     */
    public void setMono(String mono) {
        this.mono = mono;
    }
}
