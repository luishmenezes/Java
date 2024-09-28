package br.unicap.poo.atividade.questao4;

public class Funcionario {
    private String nome;
	private String departamento;
	private double salario;

	public Funcionario(String nome, String departamento, double salario){
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
    }

    public Funcionario(){

    }

    public String getDepartamento() {
        return departamento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarFuncionario(){
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("departamento: " + this.departamento);
        System.out.println("salario: " + this.salario);
    }
}
