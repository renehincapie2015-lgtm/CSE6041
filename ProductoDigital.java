package eIlumage;

public class ProductoDigital extends Producto {
    
    private String formatoArchivo;
    private String tamano;
    private String codec;

    public ProductoDigital(String nombre, float valor, String formatoArchivo, String tamano, String codec) {
        super(nombre, valor);
        this.formatoArchivo = formatoArchivo;
        this.tamano = tamano;
        this.codec = codec;
    }

    @Override
    public String getFullNombre() {
        return this.nombre + " formato " + this.formatoArchivo + ", (" + this.tamano + "), codec " + this.codec;
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }
    
}
