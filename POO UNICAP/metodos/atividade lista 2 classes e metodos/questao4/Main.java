package br.unicap.poo.atividade.questao4;

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time("Sport Club do Recife", "Recife", 1905, "Ilha do retiro", 50);
        Jogador j1 = new Jogador("Lucas Lima", "Meia atacante", 19, 8, 1.83);
        Jogador j2 = new Jogador("Ze Roberto", "Centroavante", 99, 12, 1.93);
        Jogador j3 = new Jogador("Fabricio Dominguez " ,"Volante", 8, 7, 1.78);

        
        t1.adicionarJogador(j1);
        t1.adicionarJogador(j2);
        t1.adicionarJogador(j3);
        
        t1.listarJogadores();
        
} }
