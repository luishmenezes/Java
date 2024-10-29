package agregacao;

public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Luis Henrique");
        Livro l1 = new Livro("O contador de histórias");

        l1.identificarAutor(a1);

        l1.exibirInfo();
    }
}
