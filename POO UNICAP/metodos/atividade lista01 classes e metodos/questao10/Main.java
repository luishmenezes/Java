package br.unicap.poo.atividade.questao10;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(33,"Estrogonoff", 39.90);
        Pedido p2 = new Pedido(45,"Asinha de frango",45.99);
        Pedido p3 = new Pedido(12,"Refrigerante coca-cola", 6.99);

        p1.mostrarPedido();
        p2.mostrarPedido();
        p3.mostrarPedido();
    }
}
