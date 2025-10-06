package eIlumage;

public class StockFisico extends Stock {

    private ProductoFisico producto;

    /**
     *
     * @param producto
     */
    public void setProducto(ProductoFisico producto) {
        this.producto = producto;
    }

    public ProductoFisico getProducto() {
        return producto;
    }

}
