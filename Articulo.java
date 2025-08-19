package eIlumage;

/**
 * Modela cu�ntos Productos llevo en el Carrito y por cu�nto valor
 */
public class Articulo {

    private Producto producto;
    private int cantidad = 0;
    private float subTotal = Float.parseFloat("0");

    /**
     *
     * @param nombre
     * @param valor
     * @param cantidad
     */
    public Articulo(String nombre, float valor, int cantidad) {
        this.producto = new Producto(nombre, valor);
        this.cantidad = cantidad;
        this.subTotal = valor * cantidad;
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
    public void setCantidad(int cantidad) {
        float valor;

        this.cantidad = cantidad;
        valor = Float.parseFloat(producto.getCaracteristica("Valor").getValor());
        this.subTotal = valor * cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

}
