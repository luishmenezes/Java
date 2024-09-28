package br.unicap.poo.atividade.questao14;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;

    public Tarefa(){

    }

    public Tarefa(String descricao, boolean concluida, int prioridade){
        this.descricao = descricao;
        this.concluida = concluida;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean getConcluida(){
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void concluirTarefa(){
        this.concluida = true;
        System.out.println("Tarefa concluida!");
    }

    public void mudarPrioridade(int novaPrioridade){
        this.prioridade = novaPrioridade;
        System.out.println("Prioridade atualizada com sucesso!");
        System.out.println("Nova prioridade: " + this.prioridade);
    }

    public void exibirTarefa(){
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Está concluida: " + this.concluida);
        System.out.println("Prioridade: " + this.prioridade);
    }

    public void resetarTarefa(){
        this.concluida = false;
        System.out.println("Tarefa resetada!");
    }
    
}
