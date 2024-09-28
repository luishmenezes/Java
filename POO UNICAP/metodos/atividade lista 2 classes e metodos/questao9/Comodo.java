package br.unicap.poo.atividade.questao9;

public class Comodo {
    private String nome;
    private double largura;
    private double comprimento;
    private String tipo;
    private int janelas;

    public Comodo(){

    }

    public Comodo(String nome, double largura, double comprimento, String tipo, int janelas){
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
        this.tipo = tipo;
        this.janelas = janelas;
    }

    public double getComprimento() {
        return comprimento;
    }
    public int getJanelas() {
        return janelas;
    }
    public double getLargura() {
        return largura;
    }
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularAreaComodo(){
        return this.largura * this.comprimento;
    }
}
