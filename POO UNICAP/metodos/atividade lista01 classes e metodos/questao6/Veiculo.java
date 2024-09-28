package br.unicap.poo.atividade.questao6;


public class Veiculo {
    private String placa;
	private String marca;
	private int ano;

	public Veiculo(String placa, String marca, int ano){

	this.placa = placa;
	this.marca = marca;
	this.ano = ano;
    }
    public Veiculo(){

    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void mostrarCarro(){
        System.out.println("Placa do carro: " + this.placa);
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Ano do carro: " + this.ano);
    }

}
