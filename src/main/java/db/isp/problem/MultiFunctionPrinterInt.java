package db.isp.problem;

public interface MultiFunctionPrinterInt {
    void print(String source);

    String copy(String source);

    String scan(String source);

    void sendFax(String text, String number);

}
