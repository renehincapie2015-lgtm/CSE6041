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
    public void addArticulo(ProductoDigital producto, int cantidad) throws LimiteArticulosException {
        if (producto == null) {
            throw new ProductoVacioException("El producto viene vacío.");
        }
        if (cantidad <= 0 || cantidad > 10) {
            throw new LimiteArticulosException("La cantidad de artículos debe estar entre 1 y 10.");
        }
        StockDigital stock = new StockDigital();
        stock.setProducto(producto);
        stock.setCantidad(cantidad);
        articulos[count] = new Articulo(stock);
        this.total += articulos[count].getSubTotal();
        this.count++;
        System.out.println("Agregó " + cantidad + " " + producto.getNombre() + " al Carrito");
        notificar(producto.getNombre(), cantidad);
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
    public void addArticulo(String nombre, float valor, String formatoArchivo, String tamano, String codec, int cantidad) throws IllegalArgumentException {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío.");
        }
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("El valor debe ser positivo.");
        }
        if (formatoArchivo == null || formatoArchivo.trim().isEmpty()) {
            throw new IllegalArgumentException("El formato de archivo viene vacío.");
        }
        if (tamano == null || tamano.trim().isEmpty()) {
            throw new IllegalArgumentException("El tamano viene vacío.");
        }
        if (codec == null || codec.trim().isEmpty()) {
            throw new IllegalArgumentException("El codec viene vacío.");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        }
        StockDigital stock = new StockDigital();
        stock.setProducto(new ProductoDigital(nombre.trim(), valor, formatoArchivo.trim(), tamano.trim(), codec.trim()));
        stock.setCantidad(cantidad);
        articulos[count] = new Articulo(stock);
        this.total += articulos[count].getSubTotal();
        this.count++;
        System.out.println("Agregó " + cantidad + " " + nombre.trim() + " al Carrito");
        notificar(nombre.trim(), cantidad);
    }

    /**
     *
     * @param nombre
     * @param cantidad
     */
    public void setCantidadArticulo(String nombre, int cantidad) throws IllegalArgumentException {
        int pos = 0;
        float valor;
        StockDigital stock;
        ProductoDigital producto;

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío.");
        }
        if (cantidad <= 0 || cantidad > 10) {
            throw new LimiteArticulosException("La cantidad de artículos debe estar entre 1 y 10.");
        }

        while (pos < count) {
            stock = (StockDigital) articulos[pos].getStock();
            producto = stock.getProducto();
            if (producto.getNombre().equals(nombre)) {
                valor = producto.getValor();
                this.total -= valor * stock.getCantidad();
                stock.setCantidad(cantidad);
                this.total += valor * cantidad;
                break;
            }
            pos++;
        }
        if (pos == count) {
            System.out.println("Artículo llamado " + nombre + " no existe o no pertenece a este Carrito");
        }
    }

    /**
     *
     * @param nombre
     * @param valor
     */
    public void setValorArticulo(String nombre, float valor) throws IllegalArgumentException {
        int pos = 0;
        int cantidad;
        StockDigital stock;
        ProductoDigital producto;

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío.");
        }
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("El valor debe ser positivo.");
        }

        while (pos < count) {
            stock = (StockDigital) articulos[pos].getStock();
            producto = stock.getProducto();
            if (producto.getNombre().equals(nombre)) {
                cantidad = stock.getCantidad();
                this.total -= producto.getValor() * cantidad;
                producto.setValor(valor);
                this.total += valor * cantidad;
                stock.setProducto(producto);
                break;
            }
            pos++;
        }
        if (pos == count) {
            System.out.println("Artículo llamado " + nombre + " no existe o no pertenece a este Carrito");
        }
    }

    /**
     *
     * @param nombre
     */
    public void deleteArticulo(String nombre) throws IllegalArgumentException {
        int pos = 0;

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío.");
        }
        while (pos < count) {
            if (((StockDigital) articulos[pos].getStock()).getProducto().getNombre().equals(nombre)) {
                articulos[pos] = null;
                break;
            }
            pos++;
        }
        if (pos == count) {
            System.out.println("Artículo llamado " + nombre + " no existe o no pertenece a este Carrito");
        }
    }

    public String getPedido() {
        StockDigital stock;
        String texto = "ILUMAGE le informa que ya fue entregada su compra, que consiste de\n";
        texto += "Valor\tCant\tSubTot\tNombre\n"
                + "------- ------- ------- ------\n";

        for (int i = 0; i < this.count; i++) {
            if (articulos[i] != null) {
                stock = ((StockDigital) articulos[i].getStock());
                texto += stock.getProducto().getValor() + "\t"
                        + stock.getCantidad() + "\t"
                        + Float.toString(articulos[i].getSubTotal()) + "\t"
                        + stock.getProducto().getFullNombre() + "\n";
            }
        }
        texto += "------- ------- ------- ------\n"
                + "TOTAL           " + Float.toString(this.total);
        return texto;
    }

}
