package eIlumage;

public class StockVacioException extends RuntimeException {

    public StockVacioException() {
    }

    public StockVacioException(String msg) {
        super(msg);
    }
}
