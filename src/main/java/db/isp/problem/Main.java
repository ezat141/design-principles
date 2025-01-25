package db.isp.problem;

public class Main {
    public static void main(String[] args) {
        MultiFunctionPrinterInt printer = new MultifunctionPrinter();

        printer.print("TEST PAGE");
        printer.sendFax("Welcome", "012345");
    }
}
