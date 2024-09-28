package br.unicap.poo.atividade.questao1;

import java.util.ArrayList;


public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("O livro foi adicionado!");
        System.out.println("titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());

    }
}
