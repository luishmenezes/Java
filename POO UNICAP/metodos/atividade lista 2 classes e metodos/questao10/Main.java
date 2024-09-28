package br.unicap.poo.atividade.questao10;

public class Main {
    public static void main(String[] args) {
        Processador p1 = new Processador("Intel i7",200,8,800,"dell");
        Processador p2 = new Processador("Intel i9", 300, 10, 900, "dell" );
        Computador c1 = new Computador("Asus", 8, 300, p1, "Nvidea");

        c1.verificarDesempenho();

        c1.trocarProcessador(p2);

        c1.verificarDesempenho();
    }
}
