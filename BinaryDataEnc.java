import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BinaryDataEnc extends AbstractDataENC{

    @Override
    protected void processStream(InputStream input, OutputStream out) throws IOException {
        int rawByte;
        while ((rawByte = input.read()) != -1){
            out.write(rawByte);
        }
    }
}
