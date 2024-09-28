package br.unicap.poo.atividade.questao6;

public class Main {
    public static void main(String[] args){
        Disciplina d1 = new Disciplina("Programação", "7890", 60, "Graduação", "Aprenda da sua melhor forma");
        Professor p1 = new Professor("Luis Henrique", "Programação", "Doutor", 45, 7500);
        Professor p2 = new Professor("Marcos", "Logica", "Mestre", 30, 9500);
        Professor p3 = new Professor("muriel", "Pensamento critico", "Graduado", 25,4000);
        
        d1.adicionarProfessor(p1);
        d1.adicionarProfessor(p2);
        d1.adicionarProfessor(p3);
        
        d1.listarProfessores();
        
        d1.obterProfessorComMaiorSalario();
        
        
} }
