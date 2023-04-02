package po.leit;

public class MaquinaContar {

    private int numeroPessoas;


    MaquinaContar() {
        numeroPessoas = 0;
    }
    void contar() {
        numeroPessoas++;
    }

    int mostrar() {
        return numeroPessoas;
    }
}
