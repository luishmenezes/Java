package q3;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, String id, double salarioBase, String linguagem) {
        super(nome, id, salarioBase);
        this.linguagem = linguagem;
    }

    public void apresentar() {
        System.out.println("Sou o desenvolvedor " + nome + " especialista na linguagem " + linguagem);
    }
}
