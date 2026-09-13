import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class SiblingTwoTextProcessor extends AbstractTextEnc {

    @Override
    protected void processText(Reader reader, Writer writer) throws IOException {
        int data;
        while ((data = reader.read()) != -1){
            char ch = (char) data;
            writer.write(ch);
        }
    }
}
