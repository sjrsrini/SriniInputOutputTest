import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataEncTester
{
    public static void main(String[] args){
        String inputFile = "out/production/SriniInputOutputTest/input.txt";
        String binaryInputFile = "out/production/SriniInputOutputTest/BNLINK-SWITCH-MANUAL.pdf";
        String binaryOutputFile = "binaryOutput.pdf";
        String outputFile = "output.txt";
        try (InputStream inst = new FileInputStream(inputFile); OutputStream outst = new FileOutputStream(outputFile)){

            AbstractDataENC a1 = new SiblingOneTextProcessor();
            a1.process(inst,outst);

            System.out.println(a1.doEnc("This is a test of how  to read and write from StringReader and StringWriter"));
        } catch (IOException ex){
            System.err.println("Error reading file" + ex.getMessage());
        }

        // Test Binary file
        try (InputStream binput = new FileInputStream(binaryInputFile); OutputStream boutst = new FileOutputStream(binaryOutputFile)){

            AbstractDataENC b1 = new BinaryDataEnc();
            b1.process(binput, boutst);

            System.out.println(b1.doEnc("Trying how binary stream treats this. LOL!"));

        }catch (IOException ex){
            System.err.println("Error reading file" + ex.getMessage());
        }


    }


}
