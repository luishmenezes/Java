package br.unicap.poo.atividade.questao8;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private Motor motor;
    private double velocidadeAtual;

    public Carro(){

    }

    public Carro(String modelo, int ano, String cor, Motor motor, double velocidadeAtual){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
        this. velocidadeAtual = velocidadeAtual;
    }

    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void mostrarDetalhes(){
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.cor);
        System.out.println(this.velocidadeAtual);
        System.out.println(motor.getTipo());
    }

    public void verificarVelocidadeMaxima(){
        if(motor.getPotencia() >= 500){
            System.out.println("velocidade maxima é de 200km/h");
        } else{
            System.out.println("Velocidade maxima é de 150km/h");
        }
    }
}
