package eIlumage;

/**
 * Modela el Inventario de Productos
 */
public class Inventario {

    private Stock[] stocks;
    private int count = 0;
    private Stock stock;

    public Inventario() {
        this.stocks = new Stock[10];
    }

    /**
     *
     * @param nombre
     */
    public void getStock(String nombre) {
        int pos = 0;
        boolean encontrado = false;

        while (!encontrado && pos < this.count) {
            if (stocks[pos].getProducto().getNombre().equals(nombre)) {
                this.stock = stocks[pos];
                encontrado = true;
                break;
            }
            pos++;
        }
        if (pos == this.count) {
            this.stock = null;
            System.out.println("Stock del Producto " + nombre + " no existe o no pertenece a este Inventario");
        }
    }

    /**
     *
     * @param nombre
     * @param valor
     * @param cantidad
     */
    public void addStock(Producto producto, int cantidad) {
        stocks[count] = new Stock(producto, cantidad);
        count++;
    }

    public int getCantidad() {
        if (stock != null) {
            return stock.getCantidad();
        } else {
            System.out.println("No ha consultado un Stock");
            return 0;
        }
    }

    /**
     *
     * @param cantidad
     */
    public void upStock(int cantidad) {
        if (stock != null) {
            stock.setCantidad(stock.getCantidad() + cantidad);
            System.out.println(stock.getProducto().getNombre() + " aumentó en " + cantidad);
        } else {
            System.out.println("No ha consultado un Stock");
        }
    }

    /**
     *
     * @param cantidad
     */
    public void downStock(int cantidad) {
        if (stock != null) {
            stock.setCantidad(stock.getCantidad() - cantidad);
            System.out.println(stock.getProducto().getNombre() + " disminuyó en " + cantidad);
        } else {
            System.out.println("No ha consultado un Stock");
        }
    }

}
