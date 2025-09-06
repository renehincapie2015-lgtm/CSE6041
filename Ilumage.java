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
        Cliente bob = new Cliente("TI", 1111111111, "Dylan", "Bob", "CLL 17 # 16 - 39", "3188888888",
                                   "bobdylan@gmail.com");
        Cliente alice = new Cliente("CC", 33333333, "Cooper", "Alice", "CLL 15A # 16A - 30", "3122222222",
                                   "alicecooper@hotmail.com");
        alice.addFormaPago("Tarjeta Credito");
        alice.addFormaPago("Nequi");
        
        System.out.println("***************");
        System.out.println("El administrador reconoce los clientes\n");
        rene.addCliente(bob);
        rene.addCliente(alice);

        System.out.println("***************");
        System.out.println("Creando las categorias\n");
        Categoria celulares = new Categoria("Celulares");
        Categoria audiolibros = new Categoria("Audiolibros");
        
        System.out.println("***************");
        System.out.println("Creando los inventarios\n");
        Inventario inv = new Inventario();

        ProductoFisico oppo = new ProductoFisico("Android", 500.00f, 60.5f, "7x11", "Blanco");
        celulares.addProducto(oppo);
        inv.addStock(oppo, 100);

        ProductoFisico iphone = new ProductoFisico("iPhone", 100.00f, 54.5f, "6x11", "Negro");
        celulares.addProducto(iphone);
        inv.addStock(iphone, 100);
        
        ProductoDigital novela = new ProductoDigital("Novela", 399.90f, "MP3", "500MB", "AUC1");
        audiolibros.addProducto(novela);
        inv.addStock(novela, 100);
        
        ProductoDigital ayuda = new ProductoDigital("Autoayuda", 299.00f, "OGG", "50MB", "DCC2");
        audiolibros.addProducto(ayuda);
        inv.addStock(ayuda, 100);
        
        System.out.println("********************************");
        System.out.println("*** Un cliente va de compras ***");
        System.out.println("********************************\n");
        alice.addCarrito();
        Carrito carrito= alice.getCarrito();
        
        Articulo articulo = new Articulo(new Stock(oppo, 2));
        carrito.addArticulo(articulo);
        
        carrito.addArticulo(new ProductoDigital("Novela", 399.90f, "MP3", "500MB", "AUC1"), 2);
        
        carrito.addArticulo("iPhone", 100.00f, 54.5f, "6x11", "Negro", 3);

        carrito.addArticulo("Autoayuda", 299.00f, "OGG", "50MB", "DCC2", 3);

        System.out.println("********************************");
        System.out.println("*** El cliente va a pagar ******");
        System.out.println("********************************\n");
        alice.payCarrito();

        System.out.println("\n********************************");
        System.out.println("**** Actualiza Inventario ******");
        System.out.println("********************************\n");
        carrito.updateInventario(inv);

        System.out.println("********************************");
        System.out.println("*** Se genera el pedido ********");
        System.out.println("********************************\n");
        alice.addPedido("Pagado");

        System.out.println("********************************");
        System.out.println("*** Se desecha el carrito ******");
        System.out.println("********************************\n");
        alice.deleteCarrito();

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
