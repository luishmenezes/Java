package catalogoFilmes;

import java.util.ArrayList;

public class filmeRepositorio {

    private ArrayList<Filme> filmes;

    public filmeRepositorio() {
        filmes = new ArrayList<>();
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public void inserirFilme(Filme f) {
        filmes.add(f);
    }

    public void listarFilmes() {
        for (int i = 0; i < filmes.size(); i++) {
            filmes.get(i).exibirFilme();
        }
    }

}
