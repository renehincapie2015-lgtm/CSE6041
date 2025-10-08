package eIlumage;

import org.junit.Test;
import static org.junit.Assert.*;

public class InventarioFisicoTest {

    InventarioFisico instance;

    public InventarioFisicoTest() {
        instance = new InventarioFisico();
    }

    @Test
    public void testInventarioFisico() {
        System.out.println("iniciar");
        instance.iniciar();
        /**/
        System.out.println("addStock");
        StockFisico stockfis = new StockFisico();
        stockfis.setProducto(new ProductoFisico("Tablet", 500.0f, 0.4f, "50x30in", "azul"));
        stockfis.setCantidad(2);
        instance.addStock(stockfis);
        /**/
        System.out.println("getStock");
        String nombre = "Tablet";
        instance.getStock(nombre);
        /**/
        System.out.println("upStock");
        int cantidad = 10;
        instance.upStock(cantidad);
        /**/
        System.out.println("downStock");
        cantidad = 5;
        instance.downStock(cantidad);
        /**/
        System.out.println("getCantidad");
        int expResult = 7;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        /**/
        System.out.println("actualizar");
        nombre = "Tablet";
        cantidad = 1;
        instance.actualizar(nombre, cantidad);
        /**/
        System.out.println("addStockVacio");
        try {
            instance.addStock(null);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /**/
        System.out.println("getStockVacio");
        nombre = "";
        try {
            instance.getStock(nombre);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /**/
        System.out.println("upStockNegativo");
        cantidad = -1;
        try {
            instance.upStock(cantidad);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /**/
        System.out.println("downStockNegativo");
        cantidad = -1;
        try {
            instance.downStock(cantidad);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /**/
        System.out.println("actualizarVacio");
        nombre = "";
        cantidad = -1;
        try {
            instance.actualizar(nombre, cantidad);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        /**/
        System.out.println("actualizarInexistente");
        nombre = "Televisor";
        cantidad = 10;
        instance.actualizar(nombre, cantidad);
    }

}
