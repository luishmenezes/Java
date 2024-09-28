package br.unicap.poo.atividade.questao1;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Livro l1 = new Livro("O contador de histórias", "Luis menenciaga");
        Livro l2 = new Livro("As cronicas de gelo e fogo", "George R.R. Martin");

        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);

    }
}
