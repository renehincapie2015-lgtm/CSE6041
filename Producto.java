package eIlumage;

/**
 * Modela la informaci�n del Producto
 */
public abstract class Producto {

    private int codigo;
    protected String nombre;
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
        this.nombre = nombre;
        this.caracteristicas = new Caracteristica[5];
        caracteristicas[this.count] = new Caracteristica("Valor", Float.toString(valor));
        this.count++;
    }

    public int getCodigo() {
        return codigo;
    }

    public abstract String getNombre();

    public abstract String getFullNombre();

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public Caracteristica getCaracteristica(String nombre) {
        int pos = 0;

        while (true) {
            if (caracteristicas[pos].getNombre().equals(nombre)) {
                return caracteristicas[pos];
            }
            pos++;
            if (pos == count) {
                System.out.println("Característica llamada " + nombre + " no existe o no pertenece a esta Categoría");
                return null;
            }
        }
    }

    /**
     *
     * @param nombre
     * @param valor
     */
    public void addCaracteristica(String nombre, String valor) {
        caracteristicas[count] = new Caracteristica(nombre, valor);
        count++;
    }

}
