package eIlumage;

/**
 * Modela cuantos Productos hay en el Inventario
 */
public abstract class Stock {

    private int cantidad = 0;

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

}
