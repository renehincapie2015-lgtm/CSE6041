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
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre viene vacío");
        } else {
            this.nombre = nombre.trim();
        }
        if (valor <= 0.0f) {
            System.out.println("El valor debe ser positivo");
        } else {
            this.valor = valor;
        }
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
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre viene vacío");
        } else {
            this.nombre = nombre.trim();
        }
    }

    public float getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(float valor) {
        if (valor <= 0.0f) {
            System.out.println("El valor debe ser positivo");
        } else {
            this.valor = valor;
        }
    }

    /**
     *
     * @param nombre
     * @return
     */
    public Caracteristica getCaracteristica(String nombre) {
        int pos = 0;

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre de la Característica viene vacío");
            return null;
        } else {
            while (true) {
                if (caracteristicas[pos].getNombre().equals(nombre)) {
                    return caracteristicas[pos];
                }
                pos++;
                if (pos == count) {
                    System.out.println(nombre + " no ha sido asignado o no describe este Producto");
                    return null;
                }
            }
        }
    }

    /**
     *
     * @param nombre
     * @param valor
     */
    public void setCaracteristica(String nombre, String valor) {
        int pos = 0;

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre de la Característica viene vacío");
        } else {
            if (valor == null || valor.trim().isEmpty()) {
                System.out.println("El valor de la Característica viene vacío");
            } else {
                while (true) {
                    if (caracteristicas[pos].getNombre().equals(nombre)) {
                        caracteristicas[pos].setValor(valor);
                        break;
                    }
                    pos++;
                    if (pos == count) {
                        caracteristicas[count] = new Caracteristica(nombre, valor);
                        count++;
                        break;
                    }
                }
            }
        }
    }

}
