package q3;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String id, double salarioBase, String departamento) {
        super(nome, id, salarioBase);
        this.departamento = departamento;
    }

    public void apresentar() {
        System.out.println("Sou o gerente " + nome + " responsavel pelo departamento " + departamento);
    }
}
