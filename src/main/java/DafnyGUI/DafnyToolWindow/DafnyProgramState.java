package DafnyGUI.DafnyToolWindow;

import java.util.Objects;

public class DafnyProgramState {

    private String file;
    private String lastOutput;
    private boolean verified;

    public DafnyProgramState(String file, String lastOutput, boolean verified) {
        this.file = file;
        this.lastOutput = lastOutput;
        this.verified = verified;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getLastOutput() {
        return lastOutput;
    }

    public void setLastOutput(String lastOutput) {
        this.lastOutput = lastOutput;
    }

    public boolean isVerified() {
        return verified;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return ((DafnyProgramState) o).getFile().equals(this.getFile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(file);
    }
}
