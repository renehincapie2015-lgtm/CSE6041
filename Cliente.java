package eIlumage;

public class Cliente extends Usuario {

    private FormaPago[] formaPagos;
    private int countFormas = 0;
    private Pedido[] pedidos;
    private int countPedidos = 0;
    private CarritoFisico carritofis;
    private CarritoDigital carritodig;

    /**
     *
     * @param tipoDocumento
     * @param numeroDocumento
     * @param apellidos
     * @param nombres
     * @param direccion
     * @param celular
     * @param correoElectronico
     */
    public Cliente(String tipoDocumento, int numeroDocumento, String apellidos, String nombres,
            String direccion, String celular, String correoElectronico) {
        super(tipoDocumento, numeroDocumento, apellidos, nombres, direccion, celular,
                correoElectronico);
        this.formaPagos = new FormaPago[5];
        this.pedidos = new Pedido[10];
        this.carritofis = new CarritoFisico();
        this.carritodig = new CarritoDigital();

    }

    /**
     *
     * @param nombre
     */
    public FormaPago getFormaPago(String nombre) {
        int pos = 0;

        while (true) {
            if (formaPagos[pos].getNombre().equals(nombre)) {
                return formaPagos[pos];
            }
            pos++;
            if (pos == countFormas) {
                System.out.println("Forma de Pago llamada " + nombre + " no existe o no pertenece a este Cliente");
                return null;
            }
        }
    }

    /**
     *
     * @param nombre
     */
    public void addFormaPago(String nombre) {
        formaPagos[countFormas] = new FormaPago(nombre);
        this.countFormas++;
    }

    public void addCarritoFisico() {
        this.carritofis = new CarritoFisico();
    }

    public void addCarritoDigital() {
        this.carritodig = new CarritoDigital();
    }

    public CarritoFisico getCarritoFisico() {
        return carritofis;
    }

    public CarritoDigital getCarritoDigital() {
        return carritodig;
    }

    public void payCarritoFisico() {
        IProcesoPago pp = ProcesoPagoFactory.crearPago(formaPagos[0].getNombre(), carritofis.getTotal());
        
        pp.iniciarPago();
        pp.verificarPago();
        pp.confirmarPago();
    }

    public void payCarritoDigital() {
        IProcesoPago pp = ProcesoPagoFactory.crearPago(formaPagos[0].getNombre(), carritodig.getTotal());
        
        pp.iniciarPago();
        pp.verificarPago();
        pp.confirmarPago();
    }

    public void deleteCarritoFisico() {
        this.carritofis.dumpCarrito();
        this.carritofis = null;
    }

    public void deleteCarritoDigital() {
        this.carritodig.dumpCarrito();
        this.carritodig = null;
    }

    /**
     *
     * @param codigo
     */
    public Pedido getPedido(int codigo) {
        int pos = 0;

        while (true) {
            if (pedidos[pos].getCodigo() == codigo) {
                return pedidos[pos];
            }
            pos++;
            if (pos == countPedidos) {
                System.out.println("Pedido con Código " + codigo + " no existe o no pertenece a este Cliente");
                return null;
            }
        }
    }

    /**
     *
     * @param estado
     */
    public void addPedidoFisico(String estado) {
        pedidos[countPedidos] = new Pedido(estado, carritofis.getPedido());
        this.countPedidos++;
        System.out.println("Se creó el Pedido " + (pedidos[countPedidos - 1].getCodigo()) + ", está en " + estado);
    }

    /**
     *
     * @param estado
     */
    public void addPedidoDigital(String estado) {
        pedidos[countPedidos] = new Pedido(estado, carritodig.getPedido());
        this.countPedidos++;
        System.out.println("Se creó el Pedido " + (pedidos[countPedidos - 1].getCodigo()) + ", está en " + estado);
    }

}
