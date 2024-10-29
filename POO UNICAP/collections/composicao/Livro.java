package composicao;

public class Livro {
    private String nome;
    private Autor autor;

    public Livro(String nome) {
        this.nome = nome;
    }

    public void identificarAutor(String nome) {
        this.autor = new Autor(nome);
        System.out.println("Autor identificado!");
    }

    public void exibirInfo() {
        System.out.println(this.nome + " foi escrito pelo autor: " + this.autor.getNome());
    }
}
