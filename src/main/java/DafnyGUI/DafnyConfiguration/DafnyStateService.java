package DafnyGUI.DafnyConfiguration;

import DafnyCommunication.DafnyPluginStrings;
import com.intellij.openapi.components.*;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name = DafnyPluginStrings.DAFNY,
        storages = @Storage(DafnyPluginStrings.DAFNY_CONFIGURATION_XML)
)

public class DafnyStateService implements PersistentStateComponent<DafnyStateService> {

    /**
     * The path to the Dafny files.
     */
    private String path;
    /**
     * The path to the Mono.
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
     * @return the path to the Dafny-files.
     */
    public String getPath() {
        return path;
    }

    /**
     * Set the path to the Dafny-files and save.
     * @param path - the new path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the path to Mono.
     */
    public String getMono() {
        return mono;
    }

    /**
     * Set the path to Mono and save
     * @param mono - the new mono path
     */
    public void setMono(String mono) {
        this.mono = mono;
    }
}
