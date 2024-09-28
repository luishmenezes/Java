package br.unicap.poo.atividade.questao2;

public class Aluno {
    private String nome;
    private int idade;
    private String serie;

    public Aluno(){
    }

    public Aluno(String nome,int idade, String serie){
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
    
    public String getSerie() {
        return serie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void mostrarAluno(){
        System.out.println("nome do aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Serie: " + this.serie);
    }
}
