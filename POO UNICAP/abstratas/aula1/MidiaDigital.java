public abstract class MidiaDigital {
    protected String titulo;
    protected int ano;

    public MidiaDigital(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void reproduzir();

}
