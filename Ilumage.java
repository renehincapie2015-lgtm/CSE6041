/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eIlumage;

import eIlumage.Cliente;
import eIlumage.Carrito;

/**
 *
 * @author patri
 */
public class Ilumage {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("*** ILUMAGE ***");
        System.out.println("***************\n");
        
        System.out.println("***************");
        System.out.println("Creando las categorias\n");
        Categoria ropa = new Categoria("Ropa");
        Categoria comida = new Categoria("Comida");
        Categoria aparatos = new Categoria("Aparatos");
        
        ropa.addProducto("Camisa", 50000f);
        ropa.addProducto("Pantalon", 65000f);
        comida.addProducto("Carne", 15000f);
        comida.addProducto("Pescado", 20000f);
        aparatos.addProducto("Televisor", 2000000f);
        aparatos.addProducto("Nevera", 3000000f);

        System.out.println("***************");
        System.out.println("Creando los inventarios\n");
        Inventario inv = new Inventario();
        inv.addStock("Camisa", 50000f, 100);
        inv.addStock("Pantalon", 65000f, 100);
        inv.addStock("Carne", 15000f, 100);
        inv.addStock("Pescado", 20000f, 100);
        inv.addStock("Televisor", 2000000f, 100);
        inv.addStock("Nevera", 3000000f, 100);
        
        System.out.println("***************");
        System.out.println("Creando los clientes\n");
        Cliente patricia = new Cliente("CC", 32862435, "Batista", "Patricia", "CLL 15A # 16A - 30", "3127557062",
                                   "patriciabatistaluz@hotmail.com");
        patricia.addFormaPago("Tarjeta Credito");

        Cliente luza = new Cliente("TI", 1043138052, "Hincapie", "Luz", "CLL 17 # 16 - 39", "3183838370",
                                   "luzbatista@gmail.com");
        patricia.addFormaPago("Nequi");
        
        System.out.println("***************");
        System.out.println("Creando el administrador\n");
        Administrador rene = new Administrador("CC", 71735222, "Hincapie", "Rene",
            "CLL 17 # 16 - 39", "3015306804", "renehincapie@hotmai.com");

        System.out.println("***************");
        System.out.println("El administrador reconoce los clientes\n");
        rene.addCliente(patricia);
        rene.addCliente(luza);

        System.out.println("********************************");
        System.out.println("*** Un cliente va de compras ***");
        System.out.println("********************************\n");
        patricia.addCarrito();
        Carrito carrito= patricia.getCarrito();
        carrito.addArticulo("Carne", 15000f, 2);
        carrito.addArticulo("Camisa", 50000f, 1);

        System.out.println("********************************");
        System.out.println("*** El cliente va a pagar ******");
        System.out.println("********************************\n");
        patricia.payCarrito();
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
        rene.getPedido(32862435, 1);
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
