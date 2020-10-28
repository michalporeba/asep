public class LineWrappingPrinter extends PrinterDecorator {
    private final int lineWidth;

    public LineWrappingPrinter(Printer printer, int lineWidth) {
        super(printer);
        this.lineWidth = lineWidth;
    }

    public void print(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.length() > i + lineWidth) {
                super.print(s.substring(i, i+lineWidth));
            } else {
                super.print(s.substring(i));
            }

            i += lineWidth;
        }
    }
}
