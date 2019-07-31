package DafnyLanguage;

import DafnyCommunication.Dafny;

/**
 * Represent the required informations for the DafnyExternalAnnotator.
 */
public class DafnyVerificationInfo {

    /**
     * The file for the verification.
     */
    private String file;

    /**
     * The sourcode for the verification.
     */
    private String sourcecode;

    /**
     * The Dafny instance for the verification.
     */
    private Dafny dafny;

    /**
     * Constructor.
     *
     * @param file       the file for the verification.
     * @param sourcecode the sourcode for the verification.
     * @param dafny      the Dafny instance for the verification.
     */
    public DafnyVerificationInfo(String file, String sourcecode, Dafny dafny) {
        this.file = file;
        this.sourcecode = sourcecode;
        this.dafny = dafny;
    }

    /**
     * Getter for the file.
     *
     * @return the file.
     */
    public String getFile() {
        return file;
    }

    /**
     * Getter for the sourcecode.
     *
     * @return the  the sourcecode.
     */
    public String getSourcecode() {
        return sourcecode;
    }

    /**
     * Getter for the Dafny instance.
     *
     * @return the Dafny instance.
     */
    public Dafny getDafny() {
        return dafny;
    }
}