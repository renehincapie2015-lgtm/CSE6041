package eIlumage;

public class Configuracion {

    private static Configuracion instancia;
    private static String usuarioBD;
    private static String contrasenaBD;
    private static String conexionBD;

    private Configuracion() {
        this.usuarioBD = "root";
        this.contrasenaBD = "luza0609";
        this.conexionBD = "localhost:3306:bd_ecommerce_cse642";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUsuarioBD() {
        return usuarioBD;
    }

    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }

    public String getContrasenaBD() {
        return contrasenaBD;
    }

    public void setContrasenaBD(String contrasenaBD) {
        this.contrasenaBD = contrasenaBD;
    }

    public String getConexionBD() {
        return conexionBD;
    }

    public void setConexionBD(String conexionBD) {
        this.conexionBD = conexionBD;
    }

}
