package eIlumage;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProcesoPagoTest {

    Cliente instance;

    public ProcesoPagoTest() {
        instance = new Cliente("CC", 33333333, "Cooper", "Alice", "Calle 15 # 16-30", "3122222222", "alicecooper@hotmail.com");
    }

    @Test
    public void testProcesoPago() {
        System.out.println("addFormaPago");
        String nombre = "Credito";
        instance.addFormaPago(nombre);
        /**/
        System.out.println("addCarritoFisico");
        instance.addCarritoFisico();
        /**/
        System.out.println("addArticulo");
        instance.addArticulo("iPhone", 100.0f, 54.5f, "6x11", "Negro", 3);
        System.out.println("setValorArticuloFisico");
        instance.setValorArticuloFisico("iPhone", 100.0f);
        System.out.println("TotalFisico" + instance.getTotalFisico());
        /**/
        System.out.println("payCarritoFisico " + instance.getTotalFisico());
        instance.payCarritoFisico();
        /**/
        System.out.println("deleteCarritoFisico");
        instance.deleteCarritoFisico();
    }

}
