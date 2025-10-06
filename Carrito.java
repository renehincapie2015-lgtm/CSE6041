package eIlumage;

import java.util.ArrayList;
import java.util.List;

/**
 * Modela el carro de compras
 */
public class Carrito implements IObservado {

    private int codigo;
    Articulo[] articulos;
    int count = 0;
    float total = 0.0f;
    private static int consecutivo = 0;
    private List<IObservador> observadores = new ArrayList<>();

    public Carrito() {
        this.codigo = ++Carrito.consecutivo;
        this.articulos = new Articulo[50];
    }

    /**
     *
     * @param articulo
     */
    public void addArticulo(Articulo articulo) {
        articulos[this.count] = articulo;
        this.total += articulos[this.count].getSubTotal();
        this.count++;
        if (articulo.getStock() instanceof StockFisico) {
            System.out.println("Agregó " + ((StockFisico) articulo.getStock()).getCantidad() + " "
                    + ((StockFisico) articulo.getStock()).getProducto().getNombre() + " al Carrito");
            notificar(((StockFisico) articulo.getStock()).getProducto().getNombre(),
                    ((StockFisico) articulo.getStock()).getCantidad());
        } else if (articulo.getStock() instanceof StockDigital) {
            System.out.println("Agregó " + ((StockDigital) articulo.getStock()).getCantidad() + " "
                    + ((StockDigital) articulo.getStock()).getProducto().getNombre() + " al Carrito");
            notificar(((StockDigital) articulo.getStock()).getProducto().getNombre(),
                    ((StockDigital) articulo.getStock()).getCantidad());
        }
    }

    public float getTotal() {
        return this.total;
    }

    public void dumpCarrito() {
        for (int i = 0; i < this.count; i++) {
            articulos[i] = null;
        }
    }

    public void agregarObservador(IObservador obs) {
        observadores.add(obs);
    }

    public void borrarObservador(IObservador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificar(String nombre, int cantidad) {
        for (IObservador o : observadores) {
            o.actualizar(nombre, cantidad);
        }
    }

}
