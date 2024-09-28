package br.unicap.poo.atividade.questao10;

public class Computador {
    private String marca;
    private int memoriaRAM;
    private int armazenamento;
    private Processador processador;
    private String placaDeVideo;

    public Computador(){

    }

    public Computador(String marca, int memoriaRAM, int armazenamento, Processador processador, String placaDeVideo){
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        processador = new Processador();
        this.placaDeVideo = placaDeVideo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }
    public String getMarca() {
        return marca;
    }
    public int getMemoriaRAM() {
        return memoriaRAM;
    }
    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    public Processador getProcessador() {
        return processador;
    }
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void trocarProcessador(Processador processador){
        this.processador = processador;
        System.out.println("Processador modificado");
    }

    public void verificarDesempenho(){
        System.out.println(processador.getModelo());
        System.out.println(processador.getFabricante());
        System.out.println(processador.getModelo() + " funcionando perfeitamente!");
    }


}
