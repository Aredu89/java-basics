import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErrorHandling {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("story.txt");;
            int character = 0;

            while((character = fileReader.read()) != -1) {
                System.out.print((char) character);
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
