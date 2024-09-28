package br.unicap.poo.atividade.questao7;

public class perfilUsuario {
    private String nome;
	private String bio;
	private int nSeguidores;

	public perfilUsuario(String nome, String bio, int nSeguidores){
	this.nome = nome;
	this.bio = bio;
	this.nSeguidores = nSeguidores;
    }

    public perfilUsuario(){

    }

    public String getBio() {
        return bio;
    }

    public String getNome() {
        return nome;
    }

    public int getnSeguidores() {
        return nSeguidores;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setnSeguidores(int nSeguidores) {
        this.nSeguidores = nSeguidores;
    }

    public void mostrarPerfilUsuario(){
        System.out.println("Nome do usuário: " + this.nome);
        System.out.println("Bio: " + this.bio);
        System.out.println("Seguidores: " + this.nSeguidores);
    }
}
