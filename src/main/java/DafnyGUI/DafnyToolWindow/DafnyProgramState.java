package DafnyGUI.DafnyToolWindow;

/**
 * Represent the state of a Dafny program.
 */
public class DafnyProgramState {

    /**
     * The file for the Dafny program.
     */
    private String file;

    /**
     * The last output for the file
     */
    private String lastOutput;

    /**
     * Verification state for the Dafny program
     */
    private boolean verified;

    /**
     * Constuctor
     * @param file the file for the Dafny program
     */
    public DafnyProgramState(String file) {
        this.file = file;
        this.lastOutput = "";
        this.verified = false;
    }

    /**
     * Getter for the file
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * Setter for the file
     * @param file the new file
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * Getter fot the output
     * @return the output
     */
    public String getLastOutput() {
        return lastOutput;
    }

    /**
     * Setter for the output
     * @param lastOutput the new output
     */
    public void setLastOutput(String lastOutput) {
        this.lastOutput = lastOutput;
    }

    /**
     * Checks if the file is verified
     * @return the verified state
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * Setter for the verified state
     * @param verified the new verified state
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     * Two DafnyProgramState are equal, if the files are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return ((DafnyProgramState) o).getFile().equals(this.getFile());
    }
}
