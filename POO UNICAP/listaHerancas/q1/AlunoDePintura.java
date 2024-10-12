package q1;

public class AlunoDePintura extends Aluno {
    private String estiloPintura;

    public AlunoDePintura(String nome, int idade, String matricula, String estiloPintura) {
        super(nome, idade, matricula);
        this.estiloPintura = estiloPintura;

    }

    public String getEstiloPintura() {
        return estiloPintura;
    }

    public void setEstiloPintura(String estiloPintura) {
        this.estiloPintura = estiloPintura;
    }

    @Override
    public void estudar() {
        System.out.println(getNome() + " está pintando no estilo " + this.estiloPintura);
    }

    public void pintarQuadro() {
        System.out.println(getNome() + " pintando no estilo " + this.estiloPintura);
    }
}
