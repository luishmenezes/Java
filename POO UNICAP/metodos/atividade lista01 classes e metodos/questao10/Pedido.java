package br.unicap.poo.atividade.questao10;

public class Pedido {
    private int nPedido;
	private String descricao;
	private double valorTotal;

	public Pedido(int nPedido, String descricao, double valorTotal){
	this.nPedido = nPedido;
	this.descricao = descricao;
	this.valorTotal = valorTotal;
    }
    public Pedido(){

    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getnPedido() {
        return nPedido;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setnPedido(int nPedido) {
        this.nPedido = nPedido;
    }

    public void mostrarPedido(){
        System.out.println("Numero do pedido: " + this.nPedido);
        System.out.println("Descrição dos itens: " + this.descricao);
        System.out.println("Valor total: " + this.valorTotal);
    }
}
