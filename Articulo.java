package eIlumage;

/**
 * Modela cuantos Productos llevo en el Carrito y por cuanto valor
 */
public class Articulo {

    private Stock stock;

    /**
     *
     * @param stock
     */
    public Articulo(Stock stock) {
        setStock(stock);
    }

    public Stock getStock() {
        return this.stock;
    }

    public void setStock(Stock stock) {
        if (stock == null) {
            throw new IllegalArgumentException("El stock viene vacío.");
        }
        this.stock = stock;
    }

    public float getSubTotal() {
        float subTotal = 0.0f;
        if (stock instanceof StockFisico) {
            subTotal = ((StockFisico) this.stock).getProducto().getValor() * this.stock.getCantidad();
        } else if (stock instanceof StockDigital) {
            subTotal = ((StockDigital) this.stock).getProducto().getValor() * this.stock.getCantidad();
        }
        return subTotal;
    }

}
