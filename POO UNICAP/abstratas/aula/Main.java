import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gato g1 = new Gato("persa", "lylla");
        Cachorro c1 = new Cachorro("schnaulzer", "Johnnie");

        g1.emitirSom();
        c1.emitirSom();

        ArrayList<AnimalDomestico> listaAniDom = new ArrayList<>();

        listaAniDom.add(c1);
        listaAniDom.add(g1);
    }
}
