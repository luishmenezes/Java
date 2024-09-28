package br.unicap.poo.atividade.questao6;

public class Professor {
    private String nome;
    private String especialidade;
    private String titulacao;
    private int idade;
    private double salario;

public Professor(){}

public Professor(String nome, String especialidade, String titulacao, int idade, double salario){
this.nome = nome;
this.especialidade = especialidade;
this.titulacao = titulacao;
this.idade = idade;
this.salario = salario;
}

public String getEspecialidade() {
    return especialidade;
}
public int getIdade() {
    return idade;
}
public String getNome() {
    return nome;
}
public double getSalario() {
    return salario;
}
public String getTitulacao() {
    return titulacao;
}
public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}

public void setIdade(int idade) {
    this.idade = idade;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setSalario(double salario) {
    this.salario = salario;
}
public void setTitulacao(String titulacao) {
    this.titulacao = titulacao;
}

}


