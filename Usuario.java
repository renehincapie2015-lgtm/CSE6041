package eIlumage;

/**
 * Modela informacion personal y de credenciales
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
    String regexdir = "^(Carrera|Calle|Avenida|Transversal|Diagonal|Manzana|Vereda)\\s\\d{1,3}\\s?#\\s?\\d{1,3}-\\d{1,3}(\\s?.*)?$";
    String regexcel = "^3\\d{9}$";
    String regexemail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

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
        if (tipoDocumento == null || tipoDocumento.trim().isEmpty()) {
            System.out.println("El tipo de documento viene vacío");
        } else {
            this.tipoDocumento = tipoDocumento.trim();
        }
        if (numeroDocumento <= 0) {
            System.out.println("El número de documento debe ser positivo");
        } else {
            this.numeroDocumento = numeroDocumento;
        }
        if (apellidos == null || apellidos.trim().isEmpty()) {
            System.out.println("Los apellidos vienen vacíos");
        } else {
            this.apellidos = apellidos.trim();
        }
        if (nombres == null || nombres.trim().isEmpty()) {
            System.out.println("Los nombres vienen vacíos");
        } else {
            this.nombres = nombres.trim();
        }
        if (direccion != null && direccion.trim().matches(regexdir)) {
            this.direccion = direccion;
        } else {
            System.out.println("La dirección viene vacía o está mal formateada");
        }
        if (celular != null && celular.replaceAll("[\\s-]", "").trim().matches(regexcel)) {
            this.celular = celular.replaceAll("[\\s-]", "").trim();
        } else {
            System.out.println("El celular viene vacío o está mal formateado");
        }
        if (correoElectronico != null && correoElectronico.trim().matches(regexemail)) {
            this.correoElectronico = correoElectronico.trim();
        } else {
            System.out.println("El correo electrónico viene vacío o está mal formateado");
        }
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

    public void setTipoDocumento(String tipoDocumento) {
        if (tipoDocumento == null || tipoDocumento.trim().isEmpty()) {
            System.out.println("El tipo de documento viene vacío");
        } else {
            this.tipoDocumento = tipoDocumento.trim();
        }
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        if (numeroDocumento <= 0) {
            System.out.println("El número de documento debe ser positivo");
        } else {
            this.numeroDocumento = numeroDocumento;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.trim().isEmpty()) {
            System.out.println("Los apellidos vienen vacíos");
        } else {
            this.apellidos = apellidos.trim();
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        if (nombres == null || nombres.trim().isEmpty()) {
            System.out.println("Los nombres vienen vacíos");
        } else {
            this.nombres = nombres.trim();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null && direccion.trim().matches(regexdir)) {
            this.direccion = direccion;
        } else {
            System.out.println("La dirección viene vacía o está mal formateada");
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if (celular != null && celular.replaceAll("[\\s-]", "").trim().matches(regexcel)) {
            this.celular = celular.replaceAll("[\\s-]", "").trim();
        } else {
            System.out.println("El celular viene vacío o está mal formateado");
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null && correoElectronico.trim().matches(regexemail)) {
            this.correoElectronico = correoElectronico.trim();
        } else {
            System.out.println("El correo electrónico viene vacío o está mal formateado");
        }
    }

    /**
     *
     * @param claveAcceso
     * @return
     */
    public boolean esClaveCorrecta(String claveAcceso) {
        if (this.claveAcceso.equals(claveAcceso)) {
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

    public void setClaveAcceso(String claveAccesoVieja, String claveAccesoNueva) {
        if (esClaveCorrecta(claveAccesoVieja)) {
            this.claveAcceso = claveAccesoNueva;
            System.out.println("Clave correctamente actualizada");
        } else {
            System.out.println("Clave anterior no es correcta");
        }
    }

}
