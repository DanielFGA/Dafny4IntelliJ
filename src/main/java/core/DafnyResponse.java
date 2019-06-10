package core;

import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;

public class DafnyResponse {

    private HighlightSeverity highlightSeverity;
    private String message;
    private TextRange textRange;

    public DafnyResponse(HighlightSeverity highlightSeverity, String message, TextRange textRange) {
        this.highlightSeverity = highlightSeverity;
        this.message = message;
        this.textRange = textRange;
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
}
