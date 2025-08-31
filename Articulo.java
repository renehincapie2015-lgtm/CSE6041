package eIlumage;

/**
 * Modela cuantos Productos llevo en el Carrito y por cuanto valor
 */
public class Articulo {

    private Stock stock;
    private float subTotal = Float.parseFloat("0");

    /**
     *
     * @param stock
     */
    public Articulo(Stock stock) {
        this.stock = stock;
        this.subTotal = Float.parseFloat(this.stock.getProducto().getCaracteristica("Valor").getValor()) *
                                         this.stock.getCantidad();
    }

    public Stock getStock() {
        return this.stock;
    }

    public float getSubTotal() {
        return subTotal;
    }

}
