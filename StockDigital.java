package eIlumage;

public class StockDigital extends Stock {

    private ProductoDigital producto;

    /**
     *
     * @param producto
     */
    @Override
    public void setProducto(Producto producto) {
        if (producto instanceof ProductoDigital) {
            this.producto = (ProductoDigital) producto;
        }
    }

    @Override
    public Producto getProducto() {
        return producto;
    }

}
