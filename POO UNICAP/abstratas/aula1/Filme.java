public class Filme extends MidiaDigital {

    public Filme(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public void reproduzir() {
        System.out.println("o filme " + titulo + " está sendo exibido.");
    }

    public void assistir() {
        System.out.println("o filme começou a ser assistido.");
    }
}
