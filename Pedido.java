package eIlumage;

/**
 * Modela el pedido
 */
public class Pedido {

    private int codigo;
    private String estado = "Empacando";
    private String texto;
    private static int consecutivo = 0;

    /**
     *
     * @param estado
     * @param texto
     */
    public Pedido(String estado, String texto) {
        this.codigo = ++Pedido.consecutivo;
        this.estado = estado;
        this.texto = texto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTexto() {
        return texto;
    }

    /**
     *
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

}
