package eIlumage;

public class ProductoFisico extends Producto {
    
    private float peso = 0.0f;
    private String dimensiones;
    private String color;

    public ProductoFisico(String nombre, float valor, float peso, String dimensiones, String color) {
        super(nombre, valor);
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getFullNombre() {
        return this.nombre + " pesa " + this.peso + " (kg), mide " + this.dimensiones + " cm2, de color " + this.color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
