package eIlumage;

public class ProductoDigital extends Producto {
    
    private String formatoArchivo;
    private String tamano;
    private String codec;

    public ProductoDigital(String nombre, float valor, String formatoArchivo, String tamano, String codec) {
        super(nombre, valor);
        setFormatoArchivo(formatoArchivo);
        setTamano(tamano);
        setCodec(codec);
    }

    @Override
    public String getFullNombre() {
        return this.nombre + " formato " + this.formatoArchivo + ", (" + this.tamano + "), codec " + this.codec;
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        if (formatoArchivo == null || formatoArchivo.trim().isEmpty()) {
            throw new IllegalArgumentException("El formato de archivo viene vacío");
        }
        this.formatoArchivo = formatoArchivo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        if (tamano == null || tamano.trim().isEmpty()) {
            throw new IllegalArgumentException("El tamaño viene vacío");
        }
        this.tamano = tamano;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        if (codec == null || codec.trim().isEmpty()) {
            throw new IllegalArgumentException("El codec viene vacío");
        }
        this.codec = codec;
    }
    
}
