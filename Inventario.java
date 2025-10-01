package eIlumage;

/**
 * Modela el Inventario de Productos
 */
public abstract class Inventario implements IObservador {

    Stock[] stocks;
    Stock stock;

    int count = 0;

    public abstract void iniciar();

    /**
     *
     * @param producto
     * @param cantidad
     */
    public void addStock(Stock stock) {
        if (count <= 9) {
            this.stocks[count] = stock;
            count++;
        } else {
            System.out.println("No puede agregar más stocks al Inventario");
        }
    }

    /**
     *
     * @param nombre
     */
    public void getStock(String nombre) {
        int pos = 0;
        boolean encontrado = false;

        this.stock = null;
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
            System.out.println("Stock de " + nombre + " no existe o no pertenece a este Inventario");
        }
    }

    /**
     *
     * @param cantidad
     */
    public void upStock(int cantidad) {
        if (stock != null) {
            stock.setCantidad(stock.getCantidad() + cantidad);
            System.out.println("Inventario de " + stock.getProducto().getNombre() + " aumentó en " + cantidad);
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
            System.out.println("Inventario de " + stock.getProducto().getNombre() + " disminuyó en " + cantidad);
        } else {
            System.out.println("No ha consultado un Stock");
        }
    }

    public int getCantidad() {
        if (stock != null) {
            return stock.getCantidad();
        } else {
            System.out.println("No ha consultado un Stock");
            return 0;
        }
    }

    public void actualizar(String nombre, int cantidad) {
        getStock(nombre);
        downStock(cantidad);
    }
}
