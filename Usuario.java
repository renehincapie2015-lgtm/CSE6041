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
        setTipoDocumento(tipoDocumento);
        setNumeroDocumento(numeroDocumento);
        setApellidos(apellidos);
        setNombres(nombres);
        setDireccion(direccion);
        setCelular(celular);
        setCorreoElectronico(correoElectronico);
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

    public void setTipoDocumento(String tipoDocumento) throws IllegalArgumentException {
        if (tipoDocumento == null || tipoDocumento.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de documento viene vacío");
        }
        this.tipoDocumento = tipoDocumento.trim();
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) throws IllegalArgumentException {
        if (numeroDocumento <= 0) {
            throw new IllegalArgumentException("El número de documento debe ser positivo");
        }
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) throws IllegalArgumentException {
        if (apellidos == null || apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("Los apellidos vienen vacíos");
        }
        this.apellidos = apellidos.trim();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) throws IllegalArgumentException {
        if (nombres == null || nombres.trim().isEmpty()) {
            throw new IllegalArgumentException("Los nombres vienen vacíos");
        }
        this.nombres = nombres.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws IllegalArgumentException {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección viene vacía");
        }
        if (!direccion.trim().matches(regexdir)) {
            throw new IllegalArgumentException("La dirección está mal formateada");
        }
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) throws IllegalArgumentException {
        if (celular == null || celular.trim().isEmpty()) {
            throw new IllegalArgumentException("El celular viene vacío");
        }
        if (!celular.replaceAll("[\\s-]", "").trim().matches(regexcel)) {
            throw new IllegalArgumentException("El celular está mal formateado");
        }
        this.celular = celular.replaceAll("[\\s-]", "").trim();
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) throws IllegalArgumentException {
        if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
            throw new IllegalArgumentException("El correo electrónico viene vacío");
        }
        if (!correoElectronico.trim().matches(regexemail)) {
            throw new IllegalArgumentException("El correo electrónico está mal formateado");
        }
        this.correoElectronico = correoElectronico.trim();
    }

    /**
     *
     * @param claveAcceso
     * @return
     */
    public boolean esClaveCorrecta(String claveAcceso) {
        if (claveAcceso == null || claveAcceso.trim().isEmpty()) {
            throw new IllegalArgumentException("La clave viene vacía");
        }
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
        if (claveAccesoVieja == null || claveAccesoVieja.trim().isEmpty()) {
            throw new IllegalArgumentException("La clave anterior viene vacía");
        }
        if (claveAccesoNueva == null || claveAccesoNueva.trim().isEmpty()) {
            throw new IllegalArgumentException("La clave nueva viene vacía");
        }
        if (esClaveCorrecta(claveAccesoVieja)) {
            this.claveAcceso = claveAccesoNueva;
            System.out.println("Clave correctamente actualizada");
        } else {
            System.out.println("Clave anterior no es correcta");
        }
    }

}
