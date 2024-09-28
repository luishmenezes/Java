package br.unicap.poo.atividade.questao20;

public class ReservaDeVoo {
    private String numeroDoVoo;
    private String nomeDoPassageiro;
    private String classe;

    public ReservaDeVoo(){

    }

    public ReservaDeVoo(String numeroDoVoo, String nomeDoPassageiro, String classe){
        this.numeroDoVoo = numeroDoVoo;
        this.nomeDoPassageiro = nomeDoPassageiro;
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }
    public String getNomeDoPassageiro() {
        return nomeDoPassageiro;
    }
    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setNomeDoPassageiro(String nomeDoPassageiro) {
        this.nomeDoPassageiro = nomeDoPassageiro;
    }
    public void setNumeroDoVoo(String numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public void alterarClasse(String novaClasse){
        this.classe = novaClasse;
        System.out.println("Classe alterada para: " + this.classe);
    }

    public void cancelarReserva(){
        this.classe = null;
        this.nomeDoPassageiro = null;
        this.numeroDoVoo = null;
        System.out.println("Reserva cancelada com sucesso! ");
    }

    public void confirmarReserva(){
        System.out.println("Reserva confirmada! ");
    }

    public void exibirDetalhes(){
        System.out.println("numero de voo: " + this.numeroDoVoo);
        System.out.println("Nome do passageiro: " + this.nomeDoPassageiro);
        System.out.println("Classe: " + this.classe);
    }



}
