import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.US_ASCII;

public class DafnyServer {

    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private Process processServer;
    private Gson g = new Gson();

    public DafnyServer() {
      start();
    }

    public String sendAndReceive(DafnyRequest dafnyRequest) throws IOException {
        if (!processServer.isAlive()) start();
        String request;
        byte[] encodeRequest;
        String read = "";
        String answer = "";

        printWriter = new PrintWriter(processServer.getOutputStream());
        bufferedReader = new BufferedReader(new InputStreamReader(processServer.getInputStream(), "US-ASCII"));

        encodeRequest = g.toJson(dafnyRequest).getBytes(US_ASCII); //Dann wird der Request zu Bytes convertiert, mit dem Charset US_ASCII
        encodeRequest = Base64.getEncoder().encode(encodeRequest); //Dann werden die Bytes encodiert zu Base64
        request = new String(encodeRequest, US_ASCII); //Dann wird finale Request-String erstellt aus den Bytes.

        printWriter.println("verify\n" + request + "\n[[DAFNY-CLIENT: EOM]]\n");
        printWriter.flush();

        while (!(read = bufferedReader.readLine()).endsWith("[[DAFNY-SERVER: EOM]]")) {
            answer += read;
        }

        return answer;
    }

    private void start() {
        try {
            processServer = new ProcessBuilder("C:\\dafny\\DafnyServer.exe").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() throws IOException {
        if (printWriter != null ) printWriter.close();
        if (bufferedReader != null) bufferedReader.close();
        if (processServer.isAlive()) processServer.destroy();
    }
}
