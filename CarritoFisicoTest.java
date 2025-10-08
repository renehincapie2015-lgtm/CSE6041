package eIlumage;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarritoFisicoTest {

    CarritoFisico instance;

    public CarritoFisicoTest() {
        instance = new CarritoFisico();
    }

    @Test
    public void testCarritoFisico() {
        System.out.println("addArticulos");
        StockFisico stockfis = new StockFisico();
        stockfis.setProducto(new ProductoFisico("Tablet", 500.0f, 0.4f, "50x30in", "azul"));
        stockfis.setCantidad(2);
        Articulo articulo = new Articulo(stockfis);
        instance.addArticulo(articulo);
        /**/
        System.out.println("addArticulo_Producto_int");
        ProductoFisico productofis = new ProductoFisico("Televisor", 1000.0f, 10.0f, "60x40in", "negro");
        int cantidad = 3;
        instance.addArticulo(productofis, cantidad);
        /**/
        System.out.println("addArticulo_6args");
        String nombre = "Portatil";
        float valor = 500.0F;
        float peso = 1.0F;
        String dimensiones = "10x7in";
        String color = "blanco";
        cantidad = 2;
        instance.addArticulo(nombre, valor, peso, dimensiones, color, cantidad);
        /**/
        System.out.println("setCantidadArticulo");
        nombre = "Tablet";
        cantidad = 4;
        instance.setCantidadArticulo(nombre, cantidad);
        /**/
        System.out.println("deleteArticulo");
        nombre = "Televisor";
        instance.deleteArticulo(nombre);
        /**/
        System.out.println("getTotal");
        float expResult = 0.0f;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0);
        /**/
        System.out.println("getPedido");
        String expResults = "mp4";
        String results = instance.getPedido();
        assertNotEquals(expResults, results);
        /**/
        System.out.println("dumpCarrito");
        instance.dumpCarrito();
    }

}
