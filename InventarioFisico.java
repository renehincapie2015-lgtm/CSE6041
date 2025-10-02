package eIlumage;

public class InventarioFisico extends Inventario {

    @Override
    public void iniciar() {
        stocks = new StockFisico[10];
    }

}
