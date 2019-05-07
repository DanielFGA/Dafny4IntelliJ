import LSPImplementation.DafnyLanguageServer;
import org.wso2.lsp4intellij.client.connection.StreamConnectionProvider;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Client implements StreamConnectionProvider {

    private InputStream inputStream ;
    private OutputStream outputStream;
    private DafnyLanguageServer dafnyLanguageServer;
    private Launcher<LanguageClient> launcher;

    public Client(InputStream sysIn, OutputStream sysOut) {
        inputStream = sysIn;
        outputStream = sysOut;
    }

    @Override
    public void start()  {
        dafnyLanguageServer = new DafnyLanguageServer();
        launcher = LSPLauncher.createServerLauncher(dafnyLanguageServer, inputStream, outputStream);
        dafnyLanguageServer.connect(launcher.getRemoteProxy());
        launcher.startListening();
    }

    @Override
    public InputStream getInputStream() {
        return inputStream;
    }

    @Override
    public OutputStream getOutputStream() {
        return outputStream;
    }

    @Override
    public void stop() {
        //TODO implement
    }
}
