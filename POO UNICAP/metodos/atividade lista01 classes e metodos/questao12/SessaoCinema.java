package br.unicap.poo.atividade.questao12;

public class SessaoCinema {
    private String filme;
    private String horario;
    private int capacidadeTotal;
    private int lugaresDisponiveis;
    private int ingressosVendidos;

    public SessaoCinema(){

    }

    public SessaoCinema(String filme,String horario,int capacidadeTotal,  int ingressosVendidos){
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = capacidadeTotal;
        this.lugaresDisponiveis = capacidadeTotal - ingressosVendidos;
        this.ingressosVendidos = ingressosVendidos;
    }
    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }
    public void setLugaresDisponiveis(int lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public String getFilme() {
        return filme;
    }

    public String getHorario() {
        return horario;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public void venderIngresso(int nIngressosVendidos){
        if(nIngressosVendidos > this.capacidadeTotal){
            System.out.println("Não há ingressos disponiveis");
        } else {
            this.ingressosVendidos = this.ingressosVendidos + nIngressosVendidos;
            this.lugaresDisponiveis = this.capacidadeTotal - this.ingressosVendidos;
            System.out.println("Nova capacidade disponivel: " + this.capacidadeTotal);
            System.out.println("Numero de ingressos vendidos: " + this.ingressosVendidos);
        }
        
        
    }

    public void cancelarIngresso(int nIngressosCancelados){
        if(nIngressosCancelados > this.capacidadeTotal){
            System.out.println("Não há mais ingressos para cancelar");
        } else {
            this.ingressosVendidos = this.ingressosVendidos - nIngressosCancelados;
            this.lugaresDisponiveis = this.capacidadeTotal - this.ingressosVendidos;
            System.out.println("Nova capacidade disponivel: " + this.capacidadeTotal);
            System.out.println("Numero de ingressos vendidos: " + this.ingressosVendidos);
        }
    }

    public void exibirInfoSessao(){
        System.out.println("nome do filme: " + this.filme);
        System.out.println("Horário: " + this.horario);
        System.out.println("Capacidade total: " + this.capacidadeTotal);
        System.out.println("Ingressos vendidos: " + this.ingressosVendidos);
        System.out.println("Lugares disponiveis: " + this.lugaresDisponiveis);
    }

    public void alterarHorario(String novoHorario){
        this.horario = novoHorario;
        System.out.println("novo horario da sessão: " + this.horario);
    }
}
