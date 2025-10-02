package eIlumage;

public class PagoPlataforma implements IProcesoPago {

    private String nombre;
    private float total;

    /**
     *
     * @param nombre
     * @param total
     */
    public PagoPlataforma(String nombre, float total) {
        this.nombre = nombre;
        this.total = total;
    }

    @Override
    public void iniciarPago() {
        System.out.println("Voy a pagar " + Float.toString(total) + " con " + nombre);
    }

    @Override
    public boolean verificarPago() {
        System.out.println("Verificando que exista la cuenta " + nombre + "... Espere un momento");
        System.out.println("Verificando que tenga saldo... Espere un momento");
        return true;
    }

    @Override
    public boolean confirmarPago() {
        System.out.println("Pago confirmado mediante " + nombre);
        return true;
    }

}
