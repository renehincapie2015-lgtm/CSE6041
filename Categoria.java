package eIlumage;

public class Categoria {

    private int codigo;
    private String nombre;
    private static int consecutivo = 0;
    private Producto[] productos;
    private int count = 0;

    /**
     *
     * @param nombre
     */
    public Categoria(String nombre) {
        this.codigo = ++Categoria.consecutivo;
        this.nombre = nombre;
        this.productos = new Producto[5];
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

    /**
     *
     * @param nombre
     * @return
     */
    public Producto getProducto(String nombre) {
        int pos = 0;

        while (true) {
            if (productos[pos].getNombre().equals(nombre)) {
                return productos[pos];
            }
            pos++;
            if (pos == this.count) {
                System.out.println("Producto llamado " + nombre + " no existe o no pertenece a esta Categoría");
                return null;
            }
        }
    }

    /**
     *
     * @param nombre
     * @param valor
     */
    public void addProducto(Producto producto) {
        productos[count] = producto;
        count++;
    }

}
