package eIlumage;

public class InventarioExcedidoException extends RuntimeException {

    public InventarioExcedidoException() {
    }

    public InventarioExcedidoException(String msg) {
        super(msg);
    }
}
