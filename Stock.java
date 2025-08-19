package eIlumage;

/**
 * Modela cu�ntos Productos hay en el Inventario
 */
public class Stock {

    private Producto producto;
    private int cantidad = 0;

    public Stock(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void upCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void downCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }

}
