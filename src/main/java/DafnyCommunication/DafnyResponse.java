package DafnyCommunication;

import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a parsed answer from the DafnyServer.
 */
public class DafnyResponse implements Comparable<DafnyResponse> {

    /**
     * Indicates the type of answer. (Error, Warning, Information, Proof Obligation)
     */
    private HighlightSeverity highlightSeverity;

    /**
     * The content of the answer.
     */
    private String message;

    /**
     * Which code section the answer refers to.
     */
    private TextRange textRange;

    /**
     * Which line the answer refers to.
     */
    private Integer line;

    /**
     * Constructor.
     * @param highlightSeverity type of answer.
     * @param message content of answer.
     * @param textRange code section for answer.
     * @param line line for answer.
     */
    public DafnyResponse(HighlightSeverity highlightSeverity, String message, TextRange textRange, Integer line) {
        this.highlightSeverity = highlightSeverity;
        this.message = message;
        this.textRange = textRange;
        this.line = line;
    }

    /**
     * Getter for highlightSeverity.
     * @return highlightSeverity.
     */
    public HighlightSeverity getHighlightSeverity() {
        return highlightSeverity;
    }

    /**
     * Getter for message.
     * @return message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Getter for textRange.
     * @return textRange.
     */
    public TextRange getTextRange() {
        return textRange;
    }

    /**
     * String representation.
     * @return Object as a String.
     */
    @Override
    public String toString() {
        if (line == 0) return highlightSeverity.getName() + ": " + message + "\n";
        return highlightSeverity.getName() + " at line " + line + ": " + message + "\n";
    }

    /**
     * Compares this to another DafnyResponse Object.
     * @param dafnyResponse the other DafnyResponse Object.
     * @return value > 0 if this is "bigger", value = 0 if equals, welse value < 0.
     */
    @Override
    public int compareTo(@NotNull DafnyResponse dafnyResponse) {
        if (dafnyResponse.highlightSeverity.compareTo(highlightSeverity) != 0) return dafnyResponse.highlightSeverity.compareTo(highlightSeverity);
        return line - dafnyResponse.line;
    }
}
