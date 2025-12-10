import java.io.FileNotFoundException;
import java.io.FileReader;

public class ErrorHandling {
    public static void main(String[] args) {
        try {
            readFile();
        }
        catch(FileNotFoundException e) {
            System.out.println("File does not exists");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("file.txt");
    }
}
