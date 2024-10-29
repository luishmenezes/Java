package catalogoFilmes;

public class Filme {
    private String nome;
    private int ano;
    private String genero;
    private boolean ganhouOscar;

    public Filme() {

    }

    public Filme(String nome, int ano, String genero, boolean ganhouOscar) {
        this.nome = nome;
        this.ano = ano;
        this.genero = genero;
        this.ganhouOscar = ganhouOscar;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setGanhouOscar(boolean ganhouOscar) {
        this.ganhouOscar = ganhouOscar;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public boolean getGanhouOscar() {
        return ganhouOscar;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public void exibirFilme() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano: " + getAno());
        System.out.println("Genero: " + getGenero());
        System.out.println("Oscar: " + getGanhouOscar());

    }

}
