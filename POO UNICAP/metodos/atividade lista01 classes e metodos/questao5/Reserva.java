package br.unicap.poo.atividade.questao5;

public class Reserva {
    private String hospede;
	private String tipoDeQuarto;
	private int nNoites;

	public Reserva(String hospede, String tipoDeQuarto, int nNoites){
		this.hospede = hospede;
		this.tipoDeQuarto = tipoDeQuarto;
		this.nNoites = nNoites;
    }

    public Reserva(){

    }

    public String getHospede() {
        return hospede;
    }

    public String getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public int getnNoites() {
        return nNoites;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public void setTipoDeQuarto(String tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public void setnNoites(int nNoites) {
        this.nNoites = nNoites;
    }

    public void mostrarReserva(){
        System.out.println("Nome do hospede:" + this.hospede);
        System.out.println("Tipo de quarto: " + this.tipoDeQuarto);
        System.out.println("Numero de noites: " + this.nNoites);
    }
}
