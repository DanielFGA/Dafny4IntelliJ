import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.lsp4j.DiagnosticSeverity;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;

import java.util.ArrayList;
import java.util.List;

public class DafnyParser {
    public List<Diagnostic> parseResponse(String responseDafnyServer) {
        Diagnostic diagnostic = new Diagnostic();
        diagnostic.setSeverity(DiagnosticSeverity.Error);
        diagnostic.setCode("444");
        diagnostic.setMessage("Error");
        diagnostic.setRange(new Range(new Position(0,0), new Position(0,3)));
        List<Diagnostic> diagnostics = new ArrayList<>();
        diagnostics.add(diagnostic);
        return diagnostics;
    }
}
