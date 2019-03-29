package LSPImplementation;

import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.*;

import java.util.concurrent.CompletableFuture;

public class DafnyLanguageServer implements LanguageServer, LanguageClientAware {

    private DafnyTextDokumentService dafnyTextDokumentService;
    private DafnyWorkspaceService dafnyWorkspaceService;
    private LanguageClient languageClient;


    public DafnyLanguageServer() {
        dafnyTextDokumentService = new DafnyTextDokumentService(this);
        dafnyWorkspaceService = new DafnyWorkspaceService();
    }

    @Override
    public CompletableFuture<InitializeResult> initialize(InitializeParams params) {
        InitializeResult result = new InitializeResult(new ServerCapabilities());
        result.getCapabilities().setCodeActionProvider(Boolean.FALSE);
        result.getCapabilities().setDefinitionProvider(Boolean.FALSE);
        result.getCapabilities().setHoverProvider(Boolean.TRUE);
        result.getCapabilities().setReferencesProvider(Boolean.FALSE);
        result.getCapabilities().setTextDocumentSync(TextDocumentSyncKind.Full);
        return CompletableFuture.supplyAsync(() -> result);
    }

    @Override
    public CompletableFuture<Object> shutdown() {
        return CompletableFuture.supplyAsync(() -> Boolean.TRUE);
    }

    @Override
    public void exit() {
    }

    @Override
    public TextDocumentService getTextDocumentService() {
        return dafnyTextDokumentService;
    }

    @Override
    public WorkspaceService getWorkspaceService() {
        return dafnyWorkspaceService;
    }

    public LanguageClient getClient() {
        return languageClient;
    }

    public void setLanguageClient(LanguageClient languageClient) {
        this.languageClient = languageClient;
    }

    @Override
    public void connect(LanguageClient client) {
        this.languageClient = client;
    }
}
