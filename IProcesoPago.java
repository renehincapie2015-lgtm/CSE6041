package eIlumage;

/**
 * Define las actividades de iniciar, verificar y confirmar un pago.
 */
public interface IProcesoPago {
    
    public void iniciarPago();

    public boolean verificarPago();

    public boolean confirmarPago();

}
