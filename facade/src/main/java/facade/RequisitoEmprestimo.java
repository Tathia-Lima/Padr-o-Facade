package facade;
import java.util.ArrayList;
import java.util.List;
public abstract class RequisitoEmprestimo {

    private List<Cliente> clienteInapto = new ArrayList<Cliente>();

    public void addClienteInaptoParaEmprestimo(Cliente cliente) {
        this.clienteInapto.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return this.clienteInapto.contains(cliente);
    }

}