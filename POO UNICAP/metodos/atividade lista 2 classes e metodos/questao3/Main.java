package br.unicap.poo.atividade.questao3;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("Programação", "2405 ", 8 , "Aprenda a melhor forma de programar", 60);
        Aluno a1 = new Aluno("Luis Henrique", 25, "6161", "luisfake123@hotmail.com", 7);
        Aluno a2 = new Aluno("Milena", 26, "7989", "milena@hotmail.com", 9);
        Aluno a3 = new Aluno("Carlos", 62, "8198", "carlos@gmail.com", 8);

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);
        c1.adicionarAluno(a3);

        c1.listarAlunos();
    }
}
