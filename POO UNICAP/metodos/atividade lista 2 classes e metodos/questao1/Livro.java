package br.unicap.poo.atividade.questao1;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(){

    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
