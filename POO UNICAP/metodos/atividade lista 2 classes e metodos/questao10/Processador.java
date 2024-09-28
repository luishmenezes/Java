package br.unicap.poo.atividade.questao10;

public class Processador {
    private String modelo;
    private double frequencia;
    private int numeroNucleos;
    private double cache;
    private String fabricante;

    public Processador(){

    }

    public Processador(String modelo, double frequencia, int numeroNucleos, double cache, String fabricante){
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.numeroNucleos = numeroNucleos;
        this.cache = cache;
        this.fabricante = fabricante;
    }

    public double getCache() {
        return cache;
    }
    public String getFabricante() {
        return fabricante;
    }
    public double getFrequencia() {
        return frequencia;
    }
    public String getModelo() {
        return modelo;
    }
    public int getNumeroNucleos() {
        return numeroNucleos;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }
    
}
