package facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteTest {

    @Test
    void testEmprestimoComHistoricoCreditoInapto() {
        Cliente cliente = new Cliente();
        HistoricoCredito.getInstancia().addClienteInaptoParaEmprestimo(cliente);
        assertEquals(false, cliente.emprestimo());
    }

    @Test
    public void testEmprestimoComScoreCreditoInapto() {
        Cliente cliente = new Cliente();
        HistoricoCredito.getInstancia().addClienteInaptoParaEmprestimo(cliente);
        assertEquals(false, cliente.emprestimo());
    }

    @Test
    public void testEmprestimoComRendaInapta() {
        Cliente cliente = new Cliente();
        Renda.getInstancia().addClienteInaptoParaEmprestimo(cliente);
        assertEquals(false, cliente.emprestimo());
    }

    @Test
    public void testEmprestimoComRequisitosAptos() {
        Cliente cliente = new Cliente();
        assertEquals(true, cliente.emprestimo());
    }

}