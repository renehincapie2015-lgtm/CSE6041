package eIlumage;

/**
 * Modela cuantos Productos llevo en el Carrito y por cuanto valor
 */
public class Articulo {

    private Stock stock;
    private float subTotal = 0.0f;

    /**
     *
     * @param stock
     */
    public Articulo(Stock stock) {
        this.stock = stock;
        if (stock instanceof StockFisico) {
            this.subTotal = ((StockFisico) this.stock).getProducto().getValor() * this.stock.getCantidad();
        } else if (stock instanceof StockDigital) {
            this.subTotal = ((StockDigital) this.stock).getProducto().getValor() * this.stock.getCantidad();
        }
    }

    public Stock getStock() {
        return this.stock;
    }

    public float getSubTotal() {
        return subTotal;
    }

}
