package facade;

public class ScoreCredito extends RequisitoEmprestimo {

    private static ScoreCredito scoreCredito = new ScoreCredito();

    private ScoreCredito() {
    }

    ;

    public static ScoreCredito getInstancia() {
        return scoreCredito;
    }
}
