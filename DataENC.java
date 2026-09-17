import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface DataENC {

    public void doEnc(InputStream input, OutputStream output) throws IOException;
    public String doEnc(String st);

}
