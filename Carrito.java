package eIlumage;

/**
 * Modela el carro de compras
 */
public class Carrito {

    private int codigo;
    private Articulo[] articulos;
    private int count = 0;
    private float total = Float.parseFloat("0");
    private static int consecutivo = 0;

    public Carrito() {
        this.codigo = ++Carrito.consecutivo;
        this.articulos = new Articulo[50];
    }

    /**
     *
     * @param articulo
     */
    public void addArticulo(Articulo articulo) {
        articulos[count] = articulo;
        this.total += articulos[count].getSubTotal();
        this.count++;
    }

    /**
     *
     * @param producto
     * @param cantidad
     */
    public void addArticulo(Producto producto, int cantidad) {
        articulos[count] = new Articulo(new Stock(producto, cantidad));
        this.total += articulos[count].getSubTotal();
        this.count++;
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
        articulos[count] = new Articulo(new Stock(new ProductoFisico(nombre, valor, peso, dimensiones, color), cantidad));
        this.total += articulos[count].getSubTotal();
        this.count++;
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
        articulos[count] = new Articulo(new Stock(new ProductoDigital(nombre, valor, formatoArchivo, tamano, codec), cantidad));
        this.total += articulos[count].getSubTotal();
        this.count++;
    }

    /**
     *
     * @param nombre
     * @param cantidad
     */
    public void setCantidadArticulo(String nombre, int cantidad) {
        int pos = 0;
        float valor;
        boolean encontrado = false;
        Stock stock;
        Producto producto;

        while (!encontrado && pos < count) {
            stock = articulos[pos].getStock();
            producto = stock.getProducto();
            if (producto.getNombre().equals(nombre)) {
                valor = Float.parseFloat(producto.getCaracteristica("Valor").getValor());
                this.total -= valor * stock.getCantidad();
                stock.setCantidad(cantidad);
                this.total += valor * cantidad;
                encontrado = true;
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
    public void deleteArticulo(String nombre) {
        int pos = 0;
        boolean encontrado = false;

        while (!encontrado && pos < count) {
            if (articulos[pos].getStock().getProducto().getNombre().equals(nombre)) {
                articulos[pos] = null;
                encontrado = true;
                break;
            }
            pos++;
        }
        if (pos == count) {
            System.out.println("Artículo llamado " + nombre + " no existe o no pertenece a este Carrito");
        }
    }

    public float getTotal() {
        return this.total;
    }

    public void updateInventario(Inventario inv) {
        Stock stock;

        for (int i = 0; i < this.count; i++) {
            stock = articulos[i].getStock();
            inv.getStock(stock.getProducto().getNombre());
            inv.downStock(stock.getCantidad());
        }
    }

    public String getPedido() {
        Stock stock;
        String texto = "ILUMAGE le informa que ya fue entregada su compra, que consiste de\n";
        texto += "Valor\tCant\tSubTot\tNombre\n"
                + "------- ------- ------- ------\n";

        for (int i = 0; i < this.count; i++) {
            stock = articulos[i].getStock();
            texto += stock.getProducto().getCaracteristica("Valor").getValor() + "\t"
                    + stock.getCantidad() + "\t"
                    + Float.toString(articulos[i].getSubTotal()) + "\t"
                    + stock.getProducto().getFullNombre() + "\n";
        }
        texto += "------- ------- ------- ------\n"
                + "TOTAL           " + Float.toString(this.total);
        return texto;
    }

    public void dumpCarrito() {
        for (int i = 0; i < this.count; i++) {
            articulos[i] = null;
        }
    }

}
