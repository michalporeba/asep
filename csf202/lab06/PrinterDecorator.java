public abstract class PrinterDecorator implements Printer {
    private final Printer printer;
    
    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    public void print(String s) {
        printer.print(s);
    }
}