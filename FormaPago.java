package eIlumage;

public class FormaPago {

    private int codigo;
    private String nombre;
    private static int consecutivo = 0;

    /**
     *
     * @param nombre
     */
    public FormaPago(String nombre) {
        this.codigo = ++FormaPago.consecutivo;
        setNombre(nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre viene vacío");
        }
        this.nombre = nombre;
    }

}
