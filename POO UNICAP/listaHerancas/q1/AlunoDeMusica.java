package q1;

public class AlunoDeMusica extends Aluno {
    private String instrumento;

    public AlunoDeMusica(String nome, int idade, String matricula, String instrumento) {
        super(nome, idade, matricula);
        this.instrumento = instrumento;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public void estudar() {
        System.out.println(getNome() + " está praticando " + this.instrumento);
    }

    public void praticar() {
        System.out.println(getNome() + " está praticando " + this.instrumento);
    }
}
