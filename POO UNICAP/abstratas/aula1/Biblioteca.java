import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<MidiaDigital> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarMidia(MidiaDigital midia) {
        acervo.add(midia);
    }

    public ArrayList<MidiaDigital> getAcervo() {
        return acervo;
    }
}
