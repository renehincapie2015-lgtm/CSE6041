package eIlumage;

public class StockDigital extends Stock {

    private ProductoDigital producto;

    /**
     *
     * @param producto
     */
    public void setProducto(ProductoDigital producto) {
        this.producto = producto;
    }

    public ProductoDigital getProducto() {
        return producto;
    }

}
