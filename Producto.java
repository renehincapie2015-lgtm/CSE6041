package eIlumage;

/**
 * Modela la informacion del Producto
 */
public abstract class Producto {

    private int codigo;
    protected String nombre;
    private float valor;
    private Caracteristica[] caracteristicas;
    private int count = 0;
    private static int consecutivo = 0;

    /**
     *
     * @param nombre
     * @param valor
     */
    public Producto(String nombre, float valor) {
        this.codigo = ++Producto.consecutivo;
        setNombre(nombre);
        setValor(valor);
        this.caracteristicas = new Caracteristica[5];
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract String getFullNombre();

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre de Producto viene vacío");
        }
        this.nombre = nombre.trim();
    }

    public float getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(float valor) throws IllegalArgumentException {
        if (valor <= 0.0f) {
            throw new IllegalArgumentException("Precio del Producto debe ser positivo");
        }
    }

    /**
     *
     * @param nombre
     * @return
     */
    public Caracteristica getCaracteristica(String nombre) throws IllegalArgumentException {
        int pos = 0;

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre de Característica viene vacío");
        }
        while (pos < count) {
            if (caracteristicas[pos].getNombre().equals(nombre)) {
                return caracteristicas[pos];
            }
            pos++;
        }
        System.out.println(nombre + " no ha sido asignado o no describe este Producto");
        return null;
    }

    /**
     *
     * @param nombre
     * @param valor
     */
    public void setCaracteristica(String nombre, String valor) throws IllegalArgumentException {
        int pos = 0;

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre de Característica viene vacío");
        }
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("Valor de Característica viene vacío");
        }
        while (pos < count) {
            if (caracteristicas[pos].getNombre().equals(nombre)) {
                caracteristicas[pos].setValor(valor);
                break;
            }
            pos++;
        }
        if (pos == count) {
            caracteristicas[count] = new Caracteristica(nombre, valor);
            count++;
        }
    }

}
