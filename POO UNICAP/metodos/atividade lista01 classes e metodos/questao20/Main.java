package br.unicap.poo.atividade.questao20;

public class Main {
    public static void main(String[] args) {
        ReservaDeVoo r1 = new ReservaDeVoo("2909", "Luis", "Primeira classe");

    r1.exibirDetalhes();
    r1.alterarClasse("Economica");
    r1.confirmarReserva();
    r1.cancelarReserva();
    r1.exibirDetalhes();
    }
    
}
