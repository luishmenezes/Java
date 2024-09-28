package br.unicap.poo.atividade.questao2;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Luis Henrique");
        Pedido p1 = new Pedido(500);

        p1.adicionarCliente(c1);
    }
}
