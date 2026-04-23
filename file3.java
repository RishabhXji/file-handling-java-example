import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// bufferwriter
public class file3 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a sample text.");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}