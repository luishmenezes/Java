package br.unicap.poo.atividade.questao2;

public class Pedido {
    private double valorTotal;

    public Pedido(){

    }

    public Pedido(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public void adicionarCliente(Cliente cliente){
        System.out.println("cliente adicionado!");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Valor total: " + this.valorTotal);

    }
}
