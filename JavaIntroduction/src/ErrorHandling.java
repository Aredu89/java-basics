import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErrorHandling {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            fileReader = new FileReader("story.txt");
            reader = new BufferedReader(fileReader);
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File does not exists");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            if(fileReader != null) {
                fileReader.close();
            }
        }
    }
}
