import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileExample {
    public static void main(String[] args) {
        // Create a new file
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write to the file
        String content = "Hello, this is an example of writing to a file.";
        try {
            Files.write(Paths.get("example.txt"), content.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from the file
        try {
            String readContent = new String(Files.readAllBytes(Paths.get("example.txt")));
            System.out.println("Content of the file: " + readContent);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
// This code demonstrates how to create a file, write to it, and read from it using Java's File and Files classes. It handles potential IOExceptions that may occur during these operations.
// heading for github readme: Java File Handling Example