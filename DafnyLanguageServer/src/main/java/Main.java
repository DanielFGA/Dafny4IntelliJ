import LSPImplementation.DafnyLanguageServer;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageClient;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Client client = new Client(System.in, System.out);
        client.start();
        System.out.println("Verbudnen");*/

        DafnyLanguageServer dafnyLanguageServer = new DafnyLanguageServer();
        Launcher<LanguageClient> launcher =
                LSPLauncher.createServerLauncher(dafnyLanguageServer,
                        System.in,
                        System.out);

        dafnyLanguageServer.connect(launcher.getRemoteProxy());
        launcher.startListening();
    }
}
