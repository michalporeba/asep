import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {
    private FileWriter writer = null;

    public FilePrinter(String filename) {
        try {
            this.writer = new FileWriter(filename);
        } catch(Exception ex) {
            System.out.println("Unable to create or open file");
        }
    }

    public void print(String s) {
        try {
            writer.write(s+"\n");
            writer.flush();
        } catch(Exception ex) {
            System.out.println("Unable to write to file");
        }
    }
}
