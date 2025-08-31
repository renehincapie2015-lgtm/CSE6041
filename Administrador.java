package eIlumage;

public class Administrador extends Usuario {

    private Cliente[] clientes;
    private int count = 0;
    private Cliente cliente;
    private Pedido pedido;

    public Administrador(String tipoDocumento, int numeroDocumento, String apellidos, String nombres,
            String direccion, String celular, String correoElectronico) {
        super(tipoDocumento, numeroDocumento, apellidos, nombres, direccion, celular,
                correoElectronico);
        this.clientes = new Cliente[50];

    }

    /**
     *
     * @param numeroDocumento
     */
    public void getCliente(int numeroDocumento) {
        int pos = 0;
        boolean encontrado = false;

        while (!encontrado && pos < count) {
            if (clientes[pos].getNumeroDocumento() == numeroDocumento) {
                cliente = clientes[pos];
                encontrado = true;
                break;
            }
            pos++;
        }
        if (pos == count) {
            cliente = null;
            pedido = null;
            System.out.println("No existe el Cliente");
        }
    }

    /**
     *
     * @param cliente
     */
    public void addCliente(Cliente cliente) {
        clientes[count] = cliente;
        this.count++;
    }

    /**
     *
     * @param numeroDocumento
     * @param codigo
     */
    public void getPedido(int numeroDocumento, int codigo) {
        int pos = 0;
        boolean encontrado = false;

        while (!encontrado && pos < count) {
            if (clientes[pos].getNumeroDocumento() == numeroDocumento) {
                cliente = clientes[pos];
                pedido = cliente.getPedido(codigo);
                encontrado = true;
                break;
            }
            pos++;
        }
        if (pos == count) {
            cliente = null;
            pedido = null;
            System.out.println("No existe el Cliente");
        }
    }

    /**
     *
     * @param estado
     */
    public void setEstadoPedido(String estado) {
        if (pedido != null) {
            pedido.setEstado(estado);
            System.out.println("El pedido " + Integer.toString(pedido.getCodigo()) + " está " + pedido.getEstado());
        } else {
            System.out.println("No ha consultado un Pedido");
        }
    }

    /**
     *
     * @param texto
     */
    public void setTextoPedido(String texto) {
        if (pedido != null) {
            pedido.setTexto(texto);
        } else {
            System.out.println("No ha consultado un Pedido");
        }
    }

    public void sendMailPedido() {
        String email;
        String texto;

        if (pedido != null) {
            email = cliente.getCorreoElectronico();
            texto = pedido.getTexto();
            System.out.println("Correo para " + email + ": \n\n" + texto);
        }
    }

    public void sendSMSPedido() {
        String celular;
        String texto;

        if (pedido != null) {
            celular = cliente.getCelular();
            texto = pedido.getTexto();
            System.out.println("SMS para " + celular + ": \n\n" + texto);
        }
    }

}
