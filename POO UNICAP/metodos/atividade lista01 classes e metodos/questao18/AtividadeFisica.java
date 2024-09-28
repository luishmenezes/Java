package br.unicap.poo.atividade.questao18;

public class AtividadeFisica {
    private String tipoDeAtividade;
    private int duracao;
    private int caloriasQueimadas;

    public AtividadeFisica(){

    }

    public AtividadeFisica(String tipoDeAtividade, int duracao, int caloriasQueimadas){
        this.tipoDeAtividade = tipoDeAtividade;
        this.duracao = duracao;
        this.caloriasQueimadas = caloriasQueimadas;
    }

    public int getCaloriasQueimadas() {
        return caloriasQueimadas;
    }
    public int getDuracao() {
        return duracao;
    }
    public String getTipoDeAtividade() {
        return tipoDeAtividade;
    }
    public void setCaloriasQueimadas(int caloriasQueimadas) {
        this.caloriasQueimadas = caloriasQueimadas;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void setTipoDeAtividade(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
    }

    public void registrarAtividade(int duracao){
        System.out.println("Calorias queimadas: " + (duracao*this.caloriasQueimadas));

    }

    public void alterarTipoDeAtividade(String novoTipo){
        this.tipoDeAtividade = novoTipo;
        System.out.println("Atividade mudada!");
        System.out.println("Nova atividade: " + this.tipoDeAtividade);
    }

    public void exibirAtividade(){
        System.out.println("tipo de atividade: " + this.tipoDeAtividade);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Calorias queimadas: " + this.caloriasQueimadas);
    }

    public void compararCalorias(AtividadeFisica outraAtividade){
        System.out.println("Calorias queimadas nessa atividade: " + this.caloriasQueimadas);
        System.out.println("Calorias queimadas da atividade " + outraAtividade.tipoDeAtividade + " : " + outraAtividade.caloriasQueimadas);
        System.out.println("Diferença de calorias queimadas: " + (this.caloriasQueimadas - outraAtividade.caloriasQueimadas));
    }
    
}
