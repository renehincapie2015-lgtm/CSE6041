package eIlumage;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductoDigitalTest {

    ProductoDigital instance;

    public ProductoDigitalTest() {
        instance = new ProductoDigital("Podcast", 15.99f, "mp4", "500MB", "AAC");
    }

    @Test
    public void testGetFullNombre() {
        System.out.println("getFullNombre");
        String expResult = "Podcast" + " formato " + "mp4" + ", (" + "500MB" + "), codec " + "AAC";
        String result = instance.getFullNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFormatoArchivo() {
        System.out.println("getFormatoArchivo");
        String expResult = "mp4";
        String result = instance.getFormatoArchivo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFormatoArchivo() {
        System.out.println("setFormatoArchivo");
        String formatoArchivo = "mov";
        instance.setFormatoArchivo(formatoArchivo);
    }

    @Test
    public void testGetTamano() {
        System.out.println("getTamano");
        String expResult = "500MB";
        String result = instance.getTamano();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTamano() {
        System.out.println("setTamano");
        String tamano = "1GB";
        instance.setTamano(tamano);
    }

    @Test
    public void testGetCodec() {
        System.out.println("getCodec");
        String expResult = "AAC";
        String result = instance.getCodec();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCodec() {
        System.out.println("setCodec");
        String codec = "FLV";
        instance.setCodec(codec);
    }

    @Test
    public void testConstructorVacio() {
        instance = new ProductoDigital("", 0.0f, "", "", "");
    }

    @Test
    public void testSetNombreVacio() {
        instance = new ProductoDigital("", 15.99f, "mp4", "500MB", "AAC");
    }

    @Test
    public void testSetValorNegativo() {
        instance = new ProductoDigital("Podcast", -15.99f, "mp4", "500MB", "AAC");
    }

    @Test
    public void testSetFormatoArchivoVacio() {
        System.out.println("setFormatoArchivoVacio");
        String formatoArchivo = "";
        instance.setFormatoArchivo(formatoArchivo);
    }

    @Test
    public void testSetTamanoVacio() {
        System.out.println("setTamanoVacio");
        String tamano = "";
        instance.setTamano(tamano);
    }

    @Test
    public void testSetCodecVacio() {
        System.out.println("setCodecVacio");
        String codec = "";
        instance.setCodec(codec);
    }

}
