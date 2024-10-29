import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<MidiaDigital> midiasEmprestadas;

    public Usuario(String nome) {
        this.nome = nome;
        this.midiasEmprestadas = new ArrayList<>();
    }

    public ArrayList<MidiaDigital> getMidiasEmprestadas() {
        return midiasEmprestadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void solicitarEmprestimo(MidiaDigital midia, Biblioteca biblioteca) {
        biblioteca.getAcervo().remove(midia);
        midiasEmprestadas.add(midia);
    }

    public void devolverMidia(MidiaDigital midia, Biblioteca biblioteca) {
        midiasEmprestadas.remove(midia);
        biblioteca.getAcervo().add(midia);
    }
}
