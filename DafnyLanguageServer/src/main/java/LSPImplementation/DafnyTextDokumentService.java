package LSPImplementation;

import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.TextDocumentService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DafnyTextDokumentService implements TextDocumentService {

    private DafnyLanguageServer dafnyLanguageServer;

    public DafnyTextDokumentService(DafnyLanguageServer dafnyLanguageServer) {
        this.dafnyLanguageServer = dafnyLanguageServer;
    }

    @Override
    public CompletableFuture<Hover> hover(TextDocumentPositionParams position) {
        return null;
    }

    @Override
    public void didOpen(DidOpenTextDocumentParams params) {

    }

    @Override
    public void didChange(DidChangeTextDocumentParams params) {
        Diagnostic diagnostic = new Diagnostic();
        diagnostic.setSeverity(DiagnosticSeverity.Error);
        diagnostic.setCode("444");
        diagnostic.setMessage("Error");
        diagnostic.setRange(new Range(new Position(0,0), new Position(0,3)));
        List<Diagnostic> diagnostics = new ArrayList<>();
        diagnostics.add(diagnostic);
        dafnyLanguageServer.getClient().publishDiagnostics(new PublishDiagnosticsParams(params.getTextDocument().getUri(), diagnostics));
    }

    @Override
    public void didClose(DidCloseTextDocumentParams params) {
    }

    @Override
    public void didSave(DidSaveTextDocumentParams params) {
    }
}
