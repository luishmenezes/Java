package br.unicap.poo.atividade.questao15;

public class Main {
    public static void main(String[] args) {
        ProdutoEstoque p1 = new ProdutoEstoque("Notebook", 20 , 3200);

        p1.exibirProduto();
        p1.adicionarEstoque(6);
        p1.removerEstoque(3);
        p1.atualizarPreco(3000);
        p1.exibirProduto();
    }
}
