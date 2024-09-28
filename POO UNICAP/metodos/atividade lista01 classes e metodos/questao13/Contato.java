package br.unicap.poo.atividade.questao13;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(){

    }

    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void alterarTelefone(String novoTelefone){
        this.telefone = novoTelefone;
        System.out.println("Numero de telefone alterado com sucesso");
        System.out.println("Seu novo telefone é: " + this.telefone);
    }

    public void alterarEmail(String novoEmail){
        this.email = novoEmail;
        System.out.println("Email alterado com sucesso! ");
        System.out.println("Seu novo email é: " + this.email);
    }

    public void exibirContato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
    }

    public void validarEmail(){
        if(this.email.contains("@")){
        System.out.println("Email valido!");
        } else {
            System.out.println("Email invalido!");
        }
    }
}
