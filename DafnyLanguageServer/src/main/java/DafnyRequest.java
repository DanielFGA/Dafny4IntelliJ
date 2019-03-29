public class DafnyRequest {

    private String[] args;
    private String filename;
    private String source;
    private boolean sourceIsFile;

    public DafnyRequest(String[] args, String source, String filename, boolean sourceIsFile) {
        this.args = args;
        this.source = source;
        this.filename = filename;
        this.sourceIsFile = sourceIsFile;
    }

}
