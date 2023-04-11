package facade;

public class Renda extends RequisitoEmprestimo {

    private static Renda renda = new Renda();

    private Renda() {
    }

    ;

    public static Renda getInstancia() {
        return renda;
    }

}
