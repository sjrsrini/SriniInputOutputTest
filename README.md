AbstractDataENC : Is an abstract file it has one abstract method processStream(input, output) that are expected to be implemented in sub-classes
                  Process (input, out) calls processStream;
                  doENC(String inputText) converts a STring to binary mode and calls processStream(input,output)

BinaryDataEnc : extends AbstractDataEnc and implements processStream(input, output) and reads and prints binary data.


AbstractTextEnc : is an Abstract class that implements AbstractDataEnc and is a written to process text files. It implements processStream and opens a reader and writer and has an Abstract method processText(reader, writer) 
                  processText(Reader, writer) : is an abstract method that expect sub classes to implement text processing using a reader and writer.


SiblingOneTextProcessor and SiblingTwoTextProcessor: Are classes that extend AbstractTextEnc and implement processText(Reader, Witer) this is how you can implement variations on text processing.

DataEncTester.java : This is a test file that demonstrates how to use the classes to process first the text files, String and then Binary file and String.


