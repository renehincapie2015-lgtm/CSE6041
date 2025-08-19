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

        while (!encontrado && pos < count) {
            if (stocks[pos].getProducto().getNombre().equals(nombre)) {
                this.stock = stocks[pos];
            }
            pos++;
            if (pos == count) {
                this.stock = null;
                System.out.println("Stock del Producto " + nombre + " no existe o no pertenece a este Inventario");
            }
        }
    }

    /**
     *
     * @param nombre
     * @param valor
     * @param cantidad
     */
    public void addStock(String nombre, float valor, int cantidad) {
        stocks[count] = new Stock(new Producto(nombre, valor), cantidad);
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
            stock.upCantidad(cantidad);
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
            stock.downCantidad(cantidad);
            System.out.println(stock.getProducto().getNombre() + " disminuyó en " + cantidad);
        } else {
            System.out.println("No ha consultado un Stock");
        }
    }

}
