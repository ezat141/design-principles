package db.isp.solution;

public class Main {
    public static void main(String[] args) {
        PrinterInt printer = new MultifunctionPrinter();
        printer.print("TEST PAGE");

        OfficeWorkInt officeWork = new MultifunctionPrinter();
        officeWork.sendFax("Welcome", "012345");
    }
}
