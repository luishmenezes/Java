package br.unicap.poo.atividade.questao13;

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Luis Henrique", "81999998055", "luishpmenezes@hotmail.com");

        c1.exibirContato();
        c1.alterarTelefone("81996320560");
        c1.alterarEmail("luisfake@hotmail.com");
        c1.validarEmail();
        c1.exibirContato();
    }
}
