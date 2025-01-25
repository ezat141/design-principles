package db.isp.solution;

public interface OfficeWorkInt {
    String scan(String source);

    void sendFax(String text, String number);
}
