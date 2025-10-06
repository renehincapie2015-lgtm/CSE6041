package eIlumage;

public class InventarioDigital extends Inventario {

    @Override
    public void iniciar() {
        stocks = new StockDigital[100];
    }

}
