import org.eclipse.lsp4j.Diagnostic;

import java.io.IOException;
import java.util.List;

public class DafnyVerifier {

    private DafnyServer dafnyServer;
    private DafnyParser dafnyParser;

    public DafnyVerifier() {
        dafnyServer = new DafnyServer();
    }

    public List<Diagnostic> getDiagnostics(String code, String filename) throws IOException {

        DafnyRequest dafnyRequest = new DafnyRequest(new String[]{""}, code, filename, false);

        String responseDafnyServer = dafnyServer.sendAndReceive(dafnyRequest);

        List<Diagnostic> diagnostics = dafnyParser.parseResponse(responseDafnyServer);

        return diagnostics;

    }

}
