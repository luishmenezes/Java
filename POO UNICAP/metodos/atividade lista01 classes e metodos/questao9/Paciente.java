package br.unicap.poo.atividade.questao9;

public class Paciente {
    private String nome;
	private int idade;
	private String diagnostico;

	public Paciente(String nome, int idade, String diagnostico){
	this.nome = nome;
	this.idade = idade;
	this.diagnostico = diagnostico;

    }

    public Paciente(){

    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarPaciente(){
        System.out.println("Nome do paciente: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Diagnostico: " + this.diagnostico);
    }
}
