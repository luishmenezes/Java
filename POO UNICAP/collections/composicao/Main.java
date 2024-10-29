package composicao;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("O contador de histórias");

        l1.identificarAutor("George R R Martin");

        l1.exibirInfo();
    }
}
