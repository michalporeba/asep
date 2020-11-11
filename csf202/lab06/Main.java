public class Main {
    
    public static void main(String[] args) throws Exception {
        //Printer plainPrinter = new ConsolePrinter();
        Printer plainPrinter = new FilePrinter("log.txt");

        plainPrinter.print("Hello, World!");
        plainPrinter.print("How are you today?");
        plainPrinter.print("");

        Printer decoratedPrinter = new LineNumberPrinter(new UpperCasePrinter(plainPrinter));

        decoratedPrinter.print("Hello, World!");
        decoratedPrinter.print("How are you today?");

        plainPrinter.print("");

        Printer wrappingPrinter = new LineWrappingPrinter(decoratedPrinter, 5);

        wrappingPrinter.print("Tom's labs are the best labs.");

        plainPrinter.print("");

        Printer rubbishPrinter = new ScramblingPrinter(wrappingPrinter);
        rubbishPrinter.print("That's so messed up!");
    }
}
