package po.leit;

public class Veiculo {

    private int passageiro;
    private String tipo;
    private String matricula;

    public int getPassegeiro() {
        return passageiro;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setPassageiro(int passag) {
        passageiro = passag;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    public Veiculo(int passageiro, String tipo, String matricula) {
       this.passageiro = passageiro;
        this.tipo = tipo;
        this.matricula = matricula;
    }



}
