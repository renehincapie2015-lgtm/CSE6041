package eIlumage;

public class StockFisico extends Stock {

    private ProductoFisico producto;

    /**
     *
     * @param producto
     */
    @Override
    public void setProducto(Producto producto) {
        if (producto instanceof ProductoFisico) {
            this.producto = (ProductoFisico) producto;
        }
    }

    @Override
    public Producto getProducto() {
        return producto;
    }

}
