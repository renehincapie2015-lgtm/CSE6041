package eIlumage;

public class Cliente extends Usuario {

    private FormaPago[] formaPagos;
    private int countFormas = 0;
    private Pedido[] pedidos;
    private int countPedidos = 0;
    private Carrito carrito;

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
        this.carrito = new Carrito();

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

    public void addCarrito() {
        this.carrito = new Carrito();
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void payCarrito() {
        ProcesoPago pp = new ProcesoPago(formaPagos[0], carrito);
        pp.iniciarPago();
        pp.verificarPago();
        pp.confirmarPago();
    }

    public void deleteCarrito() {
        this.carrito.dumpCarrito();
        this.carrito = null;
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
    public void addPedido(String estado) {
        pedidos[countPedidos] = new Pedido(estado, carrito.getPedido());
        this.countPedidos++;
        System.out.println("Se creó el Pedido " + (pedidos[countPedidos - 1].getCodigo()) + ", está en " + estado);
    }

}
