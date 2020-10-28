public class LineNumberPrinter extends PrinterDecorator {
    private int lineNumber;

    public LineNumberPrinter(Printer printer) {
        super(printer);
    }

    public void print(String s) {
        super.print(++lineNumber + ": " + s);
    }
}
