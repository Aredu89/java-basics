import java.io.*;

public class ErrorHandling {
    public static void main(String[] args) throws IOException {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            writer.write("Hello world!");
            writer.newLine();
            writer.write("This is a simple text file");
        }
        catch(IOException e) {
            System.out.println(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
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
            e.printStackTrace();
        }
    }
}
