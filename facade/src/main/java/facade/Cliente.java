package facade;

public class Cliente {

    public boolean emprestimo() {
        return ClienteFacade.verificarElegibilidadeEmprestimo(this);
    }
}




