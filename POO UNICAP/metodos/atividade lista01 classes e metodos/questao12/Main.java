package br.unicap.poo.atividade.questao12;

public class Main {
    public static void main(String[] args) {
        SessaoCinema sessao1 = new SessaoCinema("O silencio dos inocentes", "20:50",300, 200);

        sessao1.venderIngresso(5);
        sessao1.cancelarIngresso(3);
        sessao1.alterarHorario("21:30");
        sessao1.exibirInfoSessao();
    }

}
