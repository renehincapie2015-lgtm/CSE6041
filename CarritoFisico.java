package eIlumage;

public class CarritoFisico extends Carrito {

    public CarritoFisico() {
        super();
    }
    
    /**
     *
     * @param producto
     * @param cantidad
     */
    public void addArticulo(Producto producto, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
        } else {
            if (producto instanceof ProductoFisico) {
                StockFisico stock = new StockFisico();
                stock.setProducto(producto);
                stock.setCantidad(cantidad);
                articulos[count] = new Articulo(stock);
                this.total += articulos[count].getSubTotal();
                this.count++;
                System.out.println("Agregó " + cantidad + " " + producto.getNombre() + " al Carrito");
                notificar(producto.getNombre(), cantidad);
            }
        }
    }

    /**
     *
     * @param nombre
     * @param valor
     * @param peso
     * @param dimensiones
     * @param color
     * @param cantidad
     */
    public void addArticulo(String nombre, float valor, float peso, String dimensiones, String color, int cantidad) {
        String mensaje = "";

        if (nombre == null || nombre.trim().isEmpty()) {
            mensaje += "El nombre viene vacío. ";
        }
        if (valor <= 0.0f) {
            mensaje += "El valor debe ser positivo. ";
        }
        if (peso <= 0.0f) {
            mensaje += "El peso debe ser positivo. ";
        }
        if (dimensiones == null || dimensiones.trim().isEmpty()) {
            mensaje += "Las dimensiones vienen vacías. ";
        }
        if (color == null || color.trim().isEmpty()) {
            mensaje += "El color viene vacío. ";
        }
        if (cantidad <= 0) {
            mensaje += "La cantidad debe ser positiva. ";
        }
        if (mensaje.trim().isEmpty()) {
            StockFisico stock = new StockFisico();
            stock.setProducto(new ProductoFisico(nombre.trim(), valor, peso, dimensiones.trim(), color.trim()));
            stock.setCantidad(cantidad);
            articulos[count] = new Articulo(stock);
            this.total += articulos[count].getSubTotal();
            this.count++;
            System.out.println("Agregó " + cantidad + " " + nombre.trim() + " al Carrito");
            notificar(nombre.trim(), cantidad);
        } else {
            System.out.println(mensaje);
        }
    }

}
