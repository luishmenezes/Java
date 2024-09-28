package br.unicap.poo.atividade.questao1;

public class Main{

    public static void main(String[] args) {
        Livro l1 = new Livro("O contador de histórias", "Luis Henrique", 2015);
        Livro l2 = new Livro("Moby dick", "Marcos Assunção", 2005);
        Livro l3 = new Livro("O leão", "lionel rischton", 1997);

        l1.mostrarLivro();
        l2.mostrarLivro();
        l3.mostrarLivro();
    }


}