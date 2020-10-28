import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ScramblingPrinter extends PrinterDecorator {
    public ScramblingPrinter(Printer printer) {
        super(printer);
    }

    public void print(String s) {
        StringBuilder sb = new StringBuilder();

        char[] characters = s.toCharArray();

        Random rand = new Random();
        for(int i = 0; i < characters.length; i++) {
            int j = rand.nextInt(characters.length);
            char tmp = characters[i];
            characters[i] = characters[j];
            characters[j] = tmp;
        }

        for(char c : characters) {
            sb.append(c);
        }

        super.print(sb.toString());
    }
}
