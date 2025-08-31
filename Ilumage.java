package eIlumage;

import eIlumage.Cliente;
import eIlumage.Carrito;

public class Ilumage {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("*** ILUMAGE ***");
        System.out.println("***************\n");
        
        System.out.println("***************");
        System.out.println("Creando el administrador\n");
        Administrador rene = new Administrador("CC", 77777777, "Hincapie", "Rene",
            "CLL 17 # 16 - 39", "3011111111", "renehincapie@hotmai.com");

        System.out.println("***************");
        System.out.println("Creando los clientes\n");
        Cliente luza = new Cliente("TI", 1111111111, "Hincapie", "Luz", "CLL 17 # 16 - 39", "3188888888",
                                   "luzbatista@gmail.com");
        Cliente patricia = new Cliente("CC", 33333333, "Batista", "Patricia", "CLL 15A # 16A - 30", "3122222222",
                                   "patriciabatistaluz@hotmail.com");
        patricia.addFormaPago("Tarjeta Credito");
        patricia.addFormaPago("Nequi");
        
        System.out.println("***************");
        System.out.println("El administrador reconoce los clientes\n");
        rene.addCliente(luza);
        rene.addCliente(patricia);

        System.out.println("***************");
        System.out.println("Creando las categorias\n");
        Categoria celulares = new Categoria("Celulares");
        Categoria audiolibros = new Categoria("Audiolibros");
        
        System.out.println("***************");
        System.out.println("Creando los inventarios\n");
        Inventario inv = new Inventario();

        ProductoFisico pf = new ProductoFisico("Phone2", 500.00f, 60.5f, "7x11", "Blanco");
        celulares.addProducto(pf);
        inv.addStock(pf, 100);

        pf = new ProductoFisico("Phone1", 100.00f, 54.5f, "6x11", "Negro");
        celulares.addProducto(pf);
        inv.addStock(pf, 100);
        
        ProductoDigital pd = new ProductoDigital("Libro1", 399.90f, "MP3", "500MB", "AUC1");
        audiolibros.addProducto(pd);
        inv.addStock(pd, 100);
        
        pd = new ProductoDigital("Libro2", 299.00f, "OGG", "50MB", "DCC2");
        audiolibros.addProducto(pd);
        inv.addStock(pd, 100);
        
        System.out.println("********************************");
        System.out.println("*** Un cliente va de compras ***");
        System.out.println("********************************\n");
        patricia.addCarrito();
        Carrito carrito= patricia.getCarrito();
        Articulo articulo = new Articulo(new Stock(pf, 2));
        carrito.addArticulo(articulo);
        articulo = new Articulo(new Stock(pd, 3));
        carrito.addArticulo(articulo);

        System.out.println("********************************");
        System.out.println("*** El cliente va a pagar ******");
        System.out.println("********************************\n");
        patricia.payCarrito();

        System.out.println("\n********************************");
        System.out.println("**** Actualiza Inventario ******");
        System.out.println("********************************\n");
        carrito.updateInventario(inv);

        System.out.println("********************************");
        System.out.println("*** Se genera el pedido ********");
        System.out.println("********************************\n");
        patricia.addPedido("Pagado");

        System.out.println("********************************");
        System.out.println("*** Se desecha el carrito ******");
        System.out.println("********************************\n");
        patricia.deleteCarrito();

        System.out.println("********************************");
        System.out.println("*** El administrador procesa ***");
        System.out.println("********************************\n");
        rene.getPedido(33333333, 1);
        rene.setEstadoPedido("Empacado");
        rene.setEstadoPedido("Enviado");
        rene.setEstadoPedido("En ruta");
        rene.setEstadoPedido("Entregado");

        System.out.println("********************************");
        System.out.println("*** El administrador informa ***");
        System.out.println("********************************\n");
        rene.sendSMSPedido();
    }
}
