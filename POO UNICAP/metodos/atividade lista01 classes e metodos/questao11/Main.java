package br.unicap.poo.atividade.questao11;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("123", 200, "Luis henrique");
        ContaCorrente c2 = new ContaCorrente("321", 300,"Milena");
        

        c1.exibirSaldo();
        c1.depositar(400);
        c1.sacar(900);
        c1.transferir(c2, 200);
        c2.exibirSaldo();
        
    }
}
