package facade;

public class ClienteFacade {

    public static boolean verificarElegibilidadeEmprestimo(Cliente cliente) {
        if (HistoricoCredito.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ScoreCredito.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Renda.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
