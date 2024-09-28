package br.unicap.poo.atividade.questao17;

public class Main {
    public static void main(String[] args) {
        Votacao v1 = new Votacao("Luis Henrique", 150);
        Votacao v2 = new Votacao("Milena", 160);

        v1.exibirResultado();
        v2.exibirResultado();
        v1.adicionarVoto();
        v2.zerarVotos();
        v1.compararVotos(v2);
    }
}
