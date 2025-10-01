package eIlumage;

import java.util.ArrayList;
import java.util.List;

/**
 * Modela el carro de compras
 */
public abstract class Carrito implements IObservado {

    private int codigo;
    Articulo[] articulos;
    int count = 0;
    float total = Float.parseFloat("0");
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
        System.out.println("Agregó " + articulo.getStock().getCantidad() + " " +
                           articulo.getStock().getProducto().getNombre() + " al Carrito");
        notificar(articulo.getStock().getProducto().getNombre(), articulo.getStock().getCantidad());
    }

    /**
     *
     * @param producto
     * @param cantidad
     */
    public abstract void addArticulo(Producto producto, int cantidad);

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
        String mensaje = "";

        if (nombre == null || nombre.trim().isEmpty()) {
            mensaje += "El nombre viene vacío. ";
        }
        if (cantidad <= 0) {
            mensaje += "La cantidad debe ser positiva. ";
        }

        if (mensaje.trim().isEmpty()) {
            while (!encontrado && pos < count) {
                stock = articulos[pos].getStock();
                producto = stock.getProducto();
                if (producto.getNombre().equals(nombre)) {
                    valor = producto.getValor();
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
        } else {
            System.out.println(mensaje);
        }
    }

    /**
     *
     * @param nombre
     */
    public void deleteArticulo(String nombre) {
        int pos = 0;
        boolean encontrado = false;

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre viene vacío. ");
        } else {
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
    }

    public float getTotal() {
        return this.total;
    }

    public String getPedido() {
        Stock stock;
        String texto = "ILUMAGE le informa que ya fue entregada su compra, que consiste de\n";
        texto += "Valor\tCant\tSubTot\tNombre\n"
                + "------- ------- ------- ------\n";

        for (int i = 0; i < this.count; i++) {
            stock = articulos[i].getStock();
            texto += stock.getProducto().getValor() + "\t"
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
