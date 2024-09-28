package br.unicap.poo.atividade.questao8;

public class Motor {
    private String tipo;
    private double cilindrada;
    private int potencia;
    private String fabricante;
    private double consumo;

    public Motor(){

    }

    public Motor(String tipo, double cilindrada, int potencia, String fabricante, double consumo){
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.fabricante = fabricante;
        this.consumo = consumo;

    }

    public double getCilindrada() {
        return cilindrada;
    }
    public double getConsumo() {
        return consumo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public int getPotencia() {
        return potencia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
