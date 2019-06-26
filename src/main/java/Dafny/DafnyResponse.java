package Dafny;

import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

public class DafnyResponse implements Comparable<DafnyResponse> {

    private HighlightSeverity highlightSeverity;
    private String message;
    private TextRange textRange;
    private Integer line;

    public DafnyResponse(HighlightSeverity highlightSeverity, String message, TextRange textRange, Integer line) {
        this.highlightSeverity = highlightSeverity;
        this.message = message;
        this.textRange = textRange;
        this.line = line;
    }

    public HighlightSeverity getHighlightSeverity() {
        return highlightSeverity;
    }

    public String getMessage() {
        return message;
    }

    public TextRange getTextRange() {
        return textRange;
    }

    public Integer getLine() {
        return line;
    }

    @Override
    public String toString() {
        if (line == 0) return highlightSeverity.getName() + ": " + message + "\n";
        return highlightSeverity.getName() + " at line " + line + ": " + message + "\n";
    }

    @Override
    public int compareTo(@NotNull DafnyResponse dafnyResponse) {
        if (dafnyResponse.highlightSeverity.compareTo(highlightSeverity) != 0) return dafnyResponse.highlightSeverity.compareTo(highlightSeverity);
        return line - dafnyResponse.line;
    }
}
