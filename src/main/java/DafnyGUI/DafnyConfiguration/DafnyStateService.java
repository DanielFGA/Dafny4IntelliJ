package DafnyGUI.DafnyConfiguration;

import com.intellij.openapi.components.*;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name = "Dafny",
        storages = @Storage("justthiseasy.xml")
)

public class DafnyStateService implements PersistentStateComponent<DafnyStateService> {

    private String pathAndOS[];

    @Nullable
    @Override
    public DafnyStateService getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull DafnyStateService state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    @Nullable
    public static DafnyStateService getInstance() {
        return ServiceManager.getService(DafnyStateService.class);
    }

    public String[] getPathAndOS() {
        return pathAndOS;
    }

    public String getPath() {
        return pathAndOS[0];
    }

    public void setPathAndOS(String[] pathAndOS) {
        this.pathAndOS = pathAndOS;
    }
}
