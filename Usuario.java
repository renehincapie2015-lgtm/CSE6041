package eIlumage;

/**
 * Modela informaci�n personal y de credenciales
 */
public class Usuario {

    private int codigo;
    private String tipoDocumento;
    private int numeroDocumento;
    private String apellidos;
    private String nombres;
    private String direccion;
    private String celular;
    private String correoElectronico;
    private String claveAcceso;
    private int numeroIntentos = 0;
    private static int consecutivo = 0;

    /**
     *
     * @param tipoDocumento
     * @param numeroDocumento
     * @param apellidos
     * @param nombres
     * @param direccion
     * @param celular
     * @param correoElectronico
     */
    public Usuario(String tipoDocumento, int numeroDocumento, String apellidos, String nombres,
            String direccion, String celular, String correoElectronico) {
        this.codigo = ++Usuario.consecutivo;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.claveAcceso = this.nombres.substring(0, 2) + this.celular.substring(6, 9)
                + this.apellidos + Integer.toString(this.codigo);
    }

    /**
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setClaveAcceso(String claveAccesoVieja, String claveAccesoNueva) {
        if (esClaveCorrecta(claveAccesoVieja)) {
            claveAcceso = claveAccesoNueva;
        } else {
            System.out.println("Clave anterior no es correcta");
        }
    }

    /**
     *
     * @param claveAcceso
     * @return
     */
    public boolean esClaveCorrecta(String claveAcceso) {
        if (claveAcceso.equals(claveAcceso)) {
            return true;
        } else {
            numeroIntentos++;
            if (numeroIntentos >= 3) {
                System.out.println("3 intentos fallidos. Acceso denegado");
            } else {
                System.out.println("Clave equivocada");
            }
            return false;
        }
    }

}
