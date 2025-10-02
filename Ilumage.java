package eIlumage;

import eIlumage.Cliente;
import eIlumage.Carrito;

public class Ilumage {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("*** ILUMAGE ***");
        System.out.println("***************\n");
        
        System.out.println("***************");
        System.out.println("Conectando a la base de datos\n");
        Configuracion config = Configuracion.getInstancia();
        System.out.println("Usuario = " + config.getUsuarioBD());
        System.out.println("Contraseña = " + config.getContrasenaBD());
        System.out.println("Conexion = " + config.getConexionBD());

        System.out.println("***************");
        System.out.println("Creando el administrador\n");
        Administrador rene = new Administrador("CC", 77777777, "Hincapie", "Rene",
            "Calle 17 # 16-39", "3011111111", "renehincapie@hotmai.com");

        System.out.println("***************");
        System.out.println("Creando los clientes\n");
        Cliente alice = new Cliente("CC", 33333333, "Cooper", "Alice", "Calle 15 # 16-30", "3122222222", "alicecooper@hotmail.com");
        alice.addFormaPago("Credito");
        alice.addFormaPago("Plataforma");
        Cliente bob = new Cliente("TI", 1111111111, "Dylan", "Bob", "Calle 17 # 16-39", "3188888888", "bobdylan@gmail.com");
        bob.addFormaPago("Plataforma");
        bob.addFormaPago("Debito");
        
        System.out.println("***************");
        System.out.println("El administrador reconoce los clientes\n");
        rene.addCliente(bob);
        rene.addCliente(alice);

        System.out.println("***************");
        System.out.println("Creando las categorias\n");
        Categoria celulares = new Categoria("Celulares");
        Categoria audiolibros = new Categoria("Audiolibros");
        
        System.out.println("***************");
        System.out.println("Creando inventario físico\n");
        InventarioFisico invfis = new InventarioFisico();
        invfis.iniciar();
        StockFisico stockfis = new StockFisico();

/*        ProductoFisico oppo = new ProductoFisico("Android", 500.00f, 60.5f, "7x11", "Blanco");
        celulares.addProducto(oppo);
        stockfis.setProducto(oppo);
        stockfis.setCantidad(100);
        invfis.addStock(stockfis);*/

        ProductoFisico iphone = new ProductoFisico("iPhone", 100.00f, 54.5f, "6x11", "Negro");
        celulares.addProducto(iphone);
        stockfis.setProducto(iphone);
        stockfis.setCantidad(100);
        invfis.addStock(stockfis);
        
        System.out.println("***************");
        System.out.println("Creando inventario digital\n");
        InventarioDigital invdig = new InventarioDigital();
        invdig.iniciar();
        StockDigital stockdig = new StockDigital();

/*        ProductoDigital ayuda = new ProductoDigital("Autoayuda", 299.00f, "OGG", "50MB", "DCC2");
        audiolibros.addProducto(ayuda);
        stockdig.setProducto(ayuda);
        stockdig.setCantidad(100);
        invdig.addStock(stockdig);*/
        
        ProductoDigital novela = new ProductoDigital("Novela", 399.90f, "MP3", "500MB", "AUC1");
        audiolibros.addProducto(novela);
        stockdig.setProducto(novela);
        stockdig.setCantidad(100);
        invdig.addStock(stockdig);
        
        System.out.println("********************************");
        System.out.println("*** Alice va de compra fisica ***");
        System.out.println("********************************\n");
        alice.addCarritoFisico();
        CarritoFisico carritofis = alice.getCarritoFisico();
        carritofis.agregarObservador(invfis);
        
        carritofis.addArticulo("iPhone", 100.00f, 54.5f, "6x11", "Negro", 3);
/*        stockfis.setProducto(oppo);
        stockfis.setCantidad(2);
        Articulo articulo = new Articulo(stockfis);
        carritofis.addArticulo(articulo);*/
        
        System.out.println("********************************");
        System.out.println("*** Bob va de compra digital ***");
        System.out.println("********************************\n");
        bob.addCarritoDigital();
        CarritoDigital carritodig = bob.getCarritoDigital();
        carritodig.agregarObservador(invdig);

/*        carritodig.addArticulo("Autoayuda", 299.00f, "OGG", "50MB", "DCC2", 3);*/
        carritodig.addArticulo(new ProductoDigital("Novela", 399.90f, "MP3", "500MB", "AUC1"), 2);

        System.out.println("********************************");
        System.out.println("********   Alice paga   ********");
        System.out.println("********************************\n");
        alice.payCarritoFisico();
        System.out.println("********************************");
        System.out.println("********    Bob paga    ********");
        System.out.println("********************************\n");
        bob.payCarritoDigital();

        System.out.println("*****************************************");
        System.out.println("*** Los clientes generan pedidos ********");
        System.out.println("*****************************************\n");
        alice.addPedidoFisico("Pagado");
        bob.addPedidoDigital("Pagado");

        System.out.println("********************************");
        System.out.println("*** Se desecha los carritos ******");
        System.out.println("********************************\n");
        alice.deleteCarritoFisico();
        bob.deleteCarritoDigital();

        System.out.println("********************************");
        System.out.println("*** El administrador procesa a Alice ***");
        System.out.println("********************************\n");
        rene.getPedido(33333333, 1);
        rene.setEstadoPedido("Empacado");
        rene.setEstadoPedido("Enviado");
        rene.setEstadoPedido("En ruta");
        rene.setEstadoPedido("Entregado");
        System.out.println("********************************");
        rene.sendSMSPedido();

        System.out.println("********************************");
        System.out.println("*** El administrador procesa a Bob ***");
        System.out.println("********************************\n");
        rene.getPedido(1111111111, 2);
        rene.setEstadoPedido("Empacado");
        rene.setEstadoPedido("Enviado");
        rene.setEstadoPedido("En ruta");
        rene.setEstadoPedido("Entregado");
        System.out.println("********************************");
        rene.sendSMSPedido();

    }
}
