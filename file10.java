import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// bufferedoutputstream
public class file10 {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.bin"))) {
            String data = "Hello, World!";
            bos.write(data.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}