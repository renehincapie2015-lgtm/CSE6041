package eIlumage;

public interface IObservado {
    void agregarObservador(IObservador obs);
    void borrarObservador(IObservador obs);
    void notificar(String nombre, int cantidad);
}
