package br.unicap.poo.atividade.questao16;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("programação", "tecnologia", 60, 20);

        c1.exibirInformacoes();
        c1.inscreverAluno();
        c1.inscreverAluno();
        c1.cancelarInscricao();
        c1.atualizarCargaHoraria(50);
        c1.exibirInformacoes();
    }
}
