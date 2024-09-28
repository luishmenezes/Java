package br.unicap.poo.atividade.questao3;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("caneta",20,"Material escolar");
        Produto produto2 = new Produto("pincel",40,"Material para arte");
        Produto produto3 = new Produto("chapeu",50,"Estilo");

        produto1.mostrarProduto();
        produto2.mostrarProduto();
        produto3.mostrarProduto();
    }
}
