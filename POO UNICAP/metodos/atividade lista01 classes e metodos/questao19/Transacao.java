package br.unicap.poo.atividade.questao19;



public class Transacao {
    private String descricao;
    private double valor;
    private String tipo;

    public Transacao(){

    }

    public Transacao(String descricao, double valor, String tipo){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void registrarTransacao(){

    }

    public void alterarDescricao(String novaDescricao){
        this.descricao = novaDescricao;
        System.out.println("Descrição alterada para : " + this.descricao);
    }

    public void exibirTransacao(){
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Tipo de transação: " + this.tipo);
    }

    




}
