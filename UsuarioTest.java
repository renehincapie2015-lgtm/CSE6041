package eIlumage;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    Usuario instance;

    public UsuarioTest() {
        instance = new Usuario("CC", 22222222, "Apellido", "Nombre", "Calle 17 #16-39", "3333333333", "cuenta@servidor.com");
    }

    @Test
    public void testGetTipoDocumento() {
        System.out.println("getTipoDocumento");
        String expResult = "CC";
        String result = instance.getTipoDocumento();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTipoDocumento() {
        System.out.println("setTipoDocumento");
        String tipoDocumento = "TI";
        instance.setTipoDocumento(tipoDocumento);
    }

    @Test
    public void testGetNumeroDocumento() {
        System.out.println("getNumeroDocumento");
        int expResult = 22222222;
        int result = instance.getNumeroDocumento();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNumeroDocumento() {
        System.out.println("setNumeroDocumento");
        int numeroDocumento = 1111111111;
        instance.setNumeroDocumento(numeroDocumento);
    }

    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        String expResult = "Apellido";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "Otro";
        instance.setApellidos(apellidos);
    }

    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        String expResult = "Nombre";
        String result = instance.getNombres();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "Apodo";
        instance.setNombres(nombres);
    }

    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        String expResult = "Calle 17 #16-39";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "Calle 15 16-30";
        instance.setDireccion(direccion);
    }

    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        String expResult = "3333333333";
        String result = instance.getCelular();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        String celular = "3888888888";
        instance.setCelular(celular);
    }

    @Test
    public void testGetCorreoElectronico() {
        System.out.println("getCorreoElectronico");
        String expResult = "cuenta@servidor.com";
        String result = instance.getCorreoElectronico();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCorreoElectronico() {
        System.out.println("setCorreoElectronico");
        String correoElectronico = "prueba@servidor.com";
        instance.setCorreoElectronico(correoElectronico);
    }

    @Test
    public void testEsClaveCorrecta() {
        System.out.println("esClaveCorrecta");
        String claveAcceso = "Nombre".substring(0, 2) + "3333333333".substring(6, 9) + "Apellido" + Integer.toString(instance.getCodigo());
        boolean expResult = true;
        boolean result = instance.esClaveCorrecta(claveAcceso);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetClaveAcceso() {
        System.out.println("setClaveAcceso");
        String claveAccesoVieja = "Ap8888Otro1";
        String claveAccesoNueva = "NuevaClave";
        instance.setClaveAcceso(claveAccesoVieja, claveAccesoNueva);
    }

    @Test
    public void testConstructorVacio() {
        instance = new Usuario("", 0, "", "", "", "", "");
    }

    @Test
    public void testSetTipoDocumentoVacio() {
        System.out.println("setTipoDocumentoVacio");
        String tipoDocumento = "";
        instance.setTipoDocumento(tipoDocumento);
    }

    @Test
    public void testSetNumeroDocumentoNegativo() {
        System.out.println("setNumeroDocumentoNegativo");
        int numeroDocumento = -1;
        instance.setNumeroDocumento(numeroDocumento);
    }

    @Test
    public void testSetApellidosVacio() {
        System.out.println("setApellidosVacio");
        String apellidos = "";
        instance.setApellidos(apellidos);
    }

    @Test
    public void testSetNombresVacio() {
        System.out.println("setNombresVacio");
        String nombres = "";
        instance.setNombres(nombres);
    }

    @Test
    public void testSetDireccionVacio() {
        System.out.println("setDireccionVacio");
        String direccion = "Vacio";
        instance.setDireccion(direccion);
    }

    @Test
    public void testSetDireccionMalFormato() {
        System.out.println("setDireccionMalFormato");
        String direccion = "Por la esquina del viejo barrio";
        instance.setDireccion(direccion);
    }

    @Test
    public void testSetCelularVacio() {
        System.out.println("setCelularVacio");
        String celular = "";
        instance.setCelular(celular);
    }

    @Test
    public void testSetCelularMalFormato() {
        System.out.println("setCelularMalFormato");
        String celular = "555";
        instance.setCelular(celular);
    }

    @Test
    public void testSetCorreoElectronicoVacio() {
        System.out.println("setCorreoElectronicoVacio");
        String correoElectronico = "";
        instance.setCorreoElectronico(correoElectronico);
    }

    @Test
    public void testSetCorreoElectronicoMalFormato() {
        System.out.println("setCorreoElectronicoMalFormato");
        String correoElectronico = "correoservidor.y";
        instance.setCorreoElectronico(correoElectronico);
    }

    @Test
    public void testEsClaveCorrectaVacia() {
        System.out.println("esClaveCorrectaVacia");
        String claveAcceso = "";
        boolean expResult = true;
        boolean result = instance.esClaveCorrecta(claveAcceso);
        assertEquals(expResult, result);
    }

    @Test
    public void testEsClaveCorrectaMala() {
        System.out.println("esClaveCorrectaMala");
        String claveAcceso = "ClaveMala";
        boolean expResult = false;
        boolean result = instance.esClaveCorrecta(claveAcceso);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetClaveAccesoVacia() {
        System.out.println("setClaveAccesoVacia");
        String claveAccesoVieja = "";
        String claveAccesoNueva = "";
        instance.setClaveAcceso(claveAccesoVieja, claveAccesoNueva);
    }

    @Test
    public void testSetClaveAccesoMala() {
        System.out.println("setClaveAccesoMala");
        String claveAccesoVieja = "ClaveMala";
        String claveAccesoNueva = "ClaveMala2";
        instance.setClaveAcceso(claveAccesoVieja, claveAccesoNueva);
    }

}
