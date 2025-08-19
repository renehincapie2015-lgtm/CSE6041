package eIlumage;

public class Caracteristica {

    private int codigo;
    private String nombre;
    private String valor;
    private static int consecutivo = 0;

    /**
     *
     * @param nombre
     * @param valor
     */
    public Caracteristica(String nombre, String valor) {
        this.codigo = ++Caracteristica.consecutivo;
        this.nombre = nombre;
        this.valor = valor;
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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

}
