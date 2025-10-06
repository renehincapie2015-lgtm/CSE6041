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
     * @param stock
     */
    public void addStock(Stock stock) throws InventarioExcedidoException {
        if (stock == null) {
            throw new StockVacioException("El stock viene vacío");
        }
        if (count > 100) {
            throw new InventarioExcedidoException("No puede agregar más stocks al Inventario");
        }
        this.stocks[count] = stock;
        count++;
    }

    /**
     *
     * @param nombre
     */
    public void getStock(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío");
        }

        int pos = 0;

        this.stock = null;
        while (pos < this.count) {
            if (stocks[pos] instanceof StockFisico) {
                if (((StockFisico) stocks[pos]).getProducto().getNombre().equals(nombre)) {
                    this.stock = stocks[pos];
                    break;
                }
            } else if (stocks[pos] instanceof StockDigital) {
                if (((StockDigital) stocks[pos]).getProducto().getNombre().equals(nombre)) {
                    this.stock = stocks[pos];
                    break;
                }
            }
            pos++;
        }
        if (pos == this.count) {
            System.out.println("Stock de " + nombre + " no existe o no pertenece a este Inventario");
        }
    }

    /**
     *
     * @param cantidad
     */
    public void upStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        if (stock != null) {
            stock.setCantidad(stock.getCantidad() + cantidad);
            if (stock instanceof StockFisico) {
                System.out.println("Inventario de " + ((StockFisico) stock).getProducto().getNombre() + " aumentó en " + cantidad);
            } else if (stock instanceof StockDigital) {
                System.out.println("Inventario de " + ((StockDigital) stock).getProducto().getNombre() + " aumentó en " + cantidad);
            }
        } else {
            System.out.println("No ha consultado un Stock");
        }
    }

    /**
     *
     * @param cantidad
     */
    public void downStock(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        if (stock != null) {
            stock.setCantidad(stock.getCantidad() - cantidad);
            if (stock instanceof StockFisico) {
                System.out.println("Inventario de " + ((StockFisico) stock).getProducto().getNombre() + " disminuyó en " + cantidad);
            } else if (stock instanceof StockDigital) {
                System.out.println("Inventario de " + ((StockDigital) stock).getProducto().getNombre() + " disminuyó en " + cantidad);
            }
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

    /**
     *
     * @param nombre
     * @param cantidad
     */
    @Override
    public void actualizar(String nombre, int cantidad) {
        getStock(nombre);
        downStock(cantidad);
    }
}
