package eIlumage;

public class CarritoDigital extends Carrito {

    public CarritoDigital() {
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
            if (producto instanceof ProductoDigital) {
                StockDigital stock = new StockDigital();
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
     * @param formatoArchivo
     * @param tamano
     * @param codec
     * @param cantidad
     */
    public void addArticulo(String nombre, float valor, String formatoArchivo, String tamano, String codec, int cantidad) {
        String mensaje = "";

        if (nombre == null || nombre.trim().isEmpty()) {
            mensaje += "El nombre viene vacío. ";
        }
        if (valor <= 0.0f) {
            mensaje += "El valor debe ser positivo. ";
        }
        if (formatoArchivo == null || formatoArchivo.trim().isEmpty()) {
            mensaje += "El formato de archivo viene vacío. ";
        }
        if (tamano == null || tamano.trim().isEmpty()) {
            mensaje += "El tamano viene vacío. ";
        }
        if (codec == null || codec.trim().isEmpty()) {
            mensaje += "El codec viene vacío. ";
        }
        if (cantidad <= 0) {
            mensaje += "La cantidad debe ser positiva. ";
        }
        if (mensaje.trim().isEmpty()) {
            StockDigital stock = new StockDigital();
            stock.setProducto(new ProductoDigital(nombre.trim(), valor, formatoArchivo.trim(), tamano.trim(), codec.trim()));
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
