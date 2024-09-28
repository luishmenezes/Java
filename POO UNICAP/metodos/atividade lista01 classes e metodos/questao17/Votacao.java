package br.unicap.poo.atividade.questao17;

public class Votacao {
    private String candidato;
    private int votosRecebidos;

    public Votacao(){

    }

    public Votacao(String candidato, int votosRecebidos){
        this.candidato = candidato;
        this.votosRecebidos = votosRecebidos;
    }

    public String getCandidato() {
        return candidato;
    }
    public int getVotosRecebidos() {
        return votosRecebidos;
    }
    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }
    public void setVotosRecebidos(int votosRecebidos) {
        this.votosRecebidos = votosRecebidos;
    }

    public void adicionarVoto(){
        this.votosRecebidos = this.votosRecebidos + 1;
        System.out.println("Voto adicionado com sucesso!");
    }

    public void zerarVotos(){
        this.votosRecebidos = 0;
        System.out.println("Votos zerados com sucesso!");
    }

    public void exibirResultado(){
        System.out.println("Nome do candidato: " + this.candidato);
        System.out.println("Votos recebidos: " + this.votosRecebidos);
    }

    public void compararVotos(Votacao outraVotacao){
        if(this.votosRecebidos > outraVotacao.votosRecebidos){
            System.out.println("Candidato vencedor foi: " + this.candidato);
        } else if(this.votosRecebidos < outraVotacao.votosRecebidos){
            System.out.println("Candidato vencedro foi: " + outraVotacao.candidato);
        } else{
            System.out.println("Empate !");
        }
    }
}
