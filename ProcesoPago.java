package eIlumage;

/**
 * Realiza las actividades de iniciar, verificar y confirmar un pago.
 */
public class ProcesoPago {

    private String nombre;
    private float total;

    /**
     *
     * @param formaPago
     * @param carrito
     */
    public ProcesoPago(FormaPago formaPago, Carrito carrito) {
        nombre = formaPago.getNombre();
        total = carrito.getTotal();
    }

    public void iniciarPago() {
        System.out.println("Voy a pagar " + Float.toString(total) + " con " + nombre);
    }

    public boolean verificarPago() {
        System.out.println("Verificando... Espere un momento");
        return true;
    }

    public boolean confirmarPago() {
        System.out.println("Pago confirmado");
        return true;
    }

}
