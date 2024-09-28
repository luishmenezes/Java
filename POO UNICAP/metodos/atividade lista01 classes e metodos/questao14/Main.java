package br.unicap.poo.atividade.questao14;

public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa("fazer a mala",false, 2);

        t1.exibirTarefa();
        t1.concluirTarefa();
        t1.mudarPrioridade(1);
        t1.resetarTarefa();
        t1.exibirTarefa();
    }
}
