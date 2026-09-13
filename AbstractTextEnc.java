import java.io.*;
import java.nio.charset.StandardCharsets;


public abstract class AbstractTextEnc extends AbstractDataENC{
    protected abstract void processText(Reader reader, Writer writer) throws IOException;

    @Override
    protected void processStream(InputStream input, OutputStream out) throws IOException {

        Reader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        Writer writer = new BufferedWriter(new OutputStreamWriter(out,StandardCharsets.UTF_8));
        processText(reader, writer);

        writer.flush();

    }
}
