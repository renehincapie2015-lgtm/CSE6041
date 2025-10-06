package eIlumage;

public class ProcesoPagoFactory {
    public static IProcesoPago crearPago (String nombre, float total) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío");
        }
        if (total <= 0.0f) {
            throw new IllegalArgumentException("El total debe ser positivo");
        }
        if (nombre.equals("Debito")) {
            return new PagoDebito(nombre, total);
        } else if (nombre.equals("Credito")) {
            return new PagoCredito(nombre, total);
        } else if (nombre.equals("Plataforma")) {
            return new PagoPlataforma(nombre, total);
        } else {
            System.out.println("Forma de Pago no aceptada o vacía");
            return null;
        }
    }
}
