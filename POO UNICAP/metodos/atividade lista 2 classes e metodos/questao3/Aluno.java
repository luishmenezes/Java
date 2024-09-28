package br.unicap.poo.atividade.questao3;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private String email;
    private double mediaFinal;

    public Aluno(){

    };

    public Aluno(String nome,int idade,String matricula,String email,double mediaFinal ){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.email = email;
        this.mediaFinal = mediaFinal;
    }

    public String getEmail() {
        return email;
    }
    public int getIdade() {
        return idade;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getMediaFinal() {
        return mediaFinal;
    }
    public String getNome() {
        return nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
