package br.unicap.poo.atividade.questao7;

public class Usuario {
    private String nome;
    private String matricula;
    private String telefone;
    private String email;
    private String dataNascimento;

    public Usuario(){

    }

    public Usuario(String nome, String matricula, String telefone, String email, String dataNascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
