import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class ReadWriteFile {
    public static File writeFile() {
        try {
            File file = new File("data.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.write("Hello 123232323");
            writer.close();
            System.out.println(file + " is created successfully.");
            return file;
        }
        catch(Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
    public static void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    public static void main(String[] args) {
        File file = writeFile();
        readFile(file);
    }
}
