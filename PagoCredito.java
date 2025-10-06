package eIlumage;

public class PagoCredito implements IProcesoPago {

    private String nombre;
    private float total;

    /**
     *
     * @param nombre
     * @param total
     */
    public PagoCredito(String nombre, float total) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío");
        }
        if (total <= 0.0f) {
            throw new IllegalArgumentException("El total debe ser positivo");
        }
        this.nombre = nombre;
        this.total = total;
    }

    @Override
    public void iniciarPago() {
        System.out.println("Voy a pagar " + Float.toString(total) + " con " + nombre);
    }

    @Override
    public boolean verificarPago() {
        System.out.println("Verificando que exista la tarjeta " + nombre + "... Espere un momento");
        System.out.println("Verificando que tenga saldo... Espere un momento");
        return true;
    }

    @Override
    public boolean confirmarPago() {
        System.out.println("Pago confirmado mediante " + nombre);
        return true;
    }

}
