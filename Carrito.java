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
     * @param nombre
     * @param valor
     * @param cantidad
     */
    public void addArticulo(String nombre, float valor, int cantidad) {
        articulos[count] = new Articulo(nombre, valor, cantidad);
        this.count++;
        this.total += valor * cantidad;
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

        while (!encontrado && pos < count) {
            if (articulos[pos].getProducto().getNombre().equals(nombre)) {
                valor = Float.parseFloat(articulos[pos].getProducto().getCaracteristica("Valor").getValor());
                this.total -= valor * articulos[pos].getCantidad();
                articulos[pos].setCantidad(cantidad);
                this.total += valor * cantidad;
                encontrado = true;
            }
            pos++;
            if (pos == count) {
                System.out.println("Artículo llamado " + nombre + " no existe o no pertenece a este Carrito");
            }
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
            if (articulos[pos].getProducto().getNombre().equals(nombre)) {
                articulos[pos] = null;
                encontrado = true;
            }
            pos++;
            if (pos == count) {
                System.out.println("Artículo llamado " + nombre + " no existe o no pertenece a este Carrito");
            }
        }
    }

    public float getTotal() {
        return this.total;
    }

    public void updateInventario(Inventario inv) {

        for (int i = 0; i < this.count; i++) {
            inv.getStock(articulos[i].getProducto().getNombre());
            inv.downStock(articulos[i].getCantidad());
        }
    }

    public String getPedido() {
        String texto = "ILUMAGE le informa que ya fue entregada su compra, que consiste de\n";
        texto += "Nombre\tValor\tCantidad\tSubTotal\n"
                + "------\t-------\t---------\t--------\n";

        for (int i = 0; i < this.count; i++) {
            texto += articulos[i].getProducto().getNombre() + "\t"
                    + articulos[i].getProducto().getCaracteristica("Valor").getValor() + "\t\t"
                    + articulos[i].getCantidad() + "\t"
                    + articulos[i].getSubTotal() + "\n";
        }
        texto += "------\t-------\t---------\t--------\n"
                + "TOTAL                 \t\t" + this.total;
        return texto;
    }

    public void dumpCarrito() {
        for (int i = 0; i < this.count; i++) {
            articulos[i] = null;
        }
    }

}
