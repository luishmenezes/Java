public class Livro extends MidiaDigital {

    public Livro(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void reproduzir() {
        System.out.println("o livro está sendo lido.");
    }

    public void abrir() {
        System.out.println("O livro foi aberto");
    }
}
