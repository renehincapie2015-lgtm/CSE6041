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
    public void addArticulo(ProductoFisico producto, int cantidad) throws LimiteArticulosException {
        if (producto == null) {
            throw new ProductoVacioException("El producto viene vacío.");
        }
        if (cantidad <= 0 || cantidad > 10) {
            throw new LimiteArticulosException("La cantidad de artículos debe estar entre 1 y 10.");
        }
        StockFisico stock = new StockFisico();
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
     * @param peso
     * @param dimensiones
     * @param color
     * @param cantidad
     */
    public void addArticulo(String nombre, float valor, float peso, String dimensiones, String color, int cantidad) throws IllegalArgumentException {
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío.");
        }
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("El valor debe ser positivo.");
        }
        if (peso <= 0.0f) {
            throw new IllegalArgumentException("El peso debe ser positivo.");
        }
        if (dimensiones == null || dimensiones.trim().isEmpty()) {
            throw new IllegalArgumentException("Las dimensiones vienen vacías.");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("El color viene vacío.");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        }
        StockFisico stock = new StockFisico();
        stock.setProducto(new ProductoFisico(nombre.trim(), valor, peso, dimensiones.trim(), color.trim()));
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
        StockFisico stock;
        ProductoFisico producto;
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío.");
        }
        if (cantidad <= 0 || cantidad > 10) {
            throw new LimiteArticulosException("La cantidad de artículos debe estar entre 1 y 10.");
        }
        
        while (pos < count) {
            stock = (StockFisico) articulos[pos].getStock();
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
        StockFisico stock;
        ProductoFisico producto;
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío.");
        }
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("El valor debe ser positivo.");
        }
        
        while (pos < count) {
            stock = (StockFisico) articulos[pos].getStock();
            producto = stock.getProducto();
            if (producto.getNombre().equals(nombre)) {
                cantidad = stock.getCantidad();
                this.total -= producto.getValor() * cantidad;
                producto.setValor(valor);
                this.total += valor * cantidad;
                stock.setProducto(producto);
                articulos[pos].setStock(stock);
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
            if (((StockFisico) articulos[pos].getStock()).getProducto().getNombre().equals(nombre)) {
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
        StockFisico stock;
        String texto = "ILUMAGE le informa que ya fue entregada su compra, que consiste de\n";
        texto += "Valor\tCant\tSubTot\tNombre\n"
                + "------- ------- ------- ------\n";
        
        for (int i = 0; i < this.count; i++) {
            if (articulos[i] != null) {
                stock = ((StockFisico) articulos[i].getStock());
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
