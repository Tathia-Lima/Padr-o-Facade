package facade;

public class HistoricoCredito extends RequisitoEmprestimo {

    private static HistoricoCredito historicoCredito = new HistoricoCredito();

    private HistoricoCredito() {
    }

    ;

    public static HistoricoCredito getInstancia() {
        return historicoCredito;
    }
}
