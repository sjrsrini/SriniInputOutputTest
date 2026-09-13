import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataEncTester
{
    public static void main(String[] args){
        String inputFile = "out/production/SriniInputOutputTest/input.txt";
        String outputFile = "output.txt";
        try (InputStream inst = new FileInputStream(inputFile); OutputStream outst = new FileOutputStream(outputFile)){

            AbstractDataENC a1 = new SiblingOneTextProcessor();
            a1.process(inst,outst);


            System.out.println(a1.doEnc("This is a test of how  to read and write from StringReader and StringWriter"));
        } catch (IOException ex){
            System.err.println("Error reading file" + ex.getMessage());
        }
    }


}
