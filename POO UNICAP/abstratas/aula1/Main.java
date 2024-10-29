public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Livro l1 = new Livro("O contador de historias", 1999);
        Filme f1 = new Filme("Forrest Gump", 2003);

        b1.adicionarMidia(f1);
        b1.adicionarMidia(l1);

        Usuario u1 = new Usuario("luis");

        u1.solicitarEmprestimo(f1, b1);

        u1.getMidiasEmprestadas().get(0).reproduzir();

    }
}
