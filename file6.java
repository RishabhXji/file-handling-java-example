import java.io.FileOutputStream;

//  fileoutputstream

public class file6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            String data = "Hello, World!";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
// This code demonstrates how to use FileOutputStream to write data to a file named "output.txt". It converts a string into bytes and writes it to the file, handling any exceptions that may occur during the process.why FileOutputStream is used in Java for writing data to a file in the form of bytes. It allows you to write raw binary data, which can be useful for writing non-text files or when you want more control over the output format. In this example, we convert a string into bytes and write it to the file, demonstrating how to use FileOutputStream effectively.
// heading for github readme: Java File Handling Example output stream example
