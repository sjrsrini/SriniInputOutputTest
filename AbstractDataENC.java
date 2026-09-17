import java.io.*;
import java.nio.charset.StandardCharsets;

public abstract class AbstractDataENC implements DataENC {

    protected  abstract void processStream(InputStream input, OutputStream out) throws IOException;

    public void doEnc(InputStream input, OutputStream output) throws IOException {
        processStream(input,output);
        output.flush();
    }

    public String doEnc(String inputText){
        if (inputText == null){
            return null;
        }

        byte[] inputBytes = inputText.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream streamInput = new ByteArrayInputStream(inputBytes);
        ByteArrayOutputStream streamOutput = new ByteArrayOutputStream();

        try {
            processStream(streamInput, streamOutput);
            streamOutput.flush();
        } catch (IOException e){
            throw new RuntimeException("Unexpected error", e);
        }
        return streamOutput.toString(StandardCharsets.UTF_8);
    }
}
