import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//  file reader

public class FileReaderExample {
    public static void main(String[] args) {
        // Read from the file
        try {
            FileReader reader = new FileReader("data.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

}
