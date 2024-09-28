package br.unicap.poo.atividade.questao9;

import java.util.ArrayList;

public class Casa {
    private String endereco;
    private int numeroComodos;
    private double tamanhoTerreno;
    private String proprietario;
    private ArrayList<Comodo> comodos;

    public Casa(){

    }

    public Casa(String endereco, int numeroComodos, double tamanhoTerreno, String proprietario){
        this.endereco = endereco;
        this.numeroComodos = numeroComodos;
        this.tamanhoTerreno = tamanhoTerreno;
        this.proprietario = proprietario;
        this.comodos = new ArrayList<>();
    }

    public ArrayList<Comodo> getComodos() {
        return comodos;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getNumeroComodos() {
        return numeroComodos;
    }
    public String getProprietario() {
        return proprietario;
    }
    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
    public void setComodos(ArrayList<Comodo> comodos) {
        this.comodos = comodos;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNumeroComodos(int numeroComodos) {
        this.numeroComodos = numeroComodos;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public void setTamanhoTerreno(double tamanhoTerreno) {
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public void adicionarComodo(Comodo comodo){
        comodos.add(comodo);
        System.out.println(comodo.getNome() + " adicionado!");
    }

    public void removerComodo(String nomeComodo){
        Comodo comodoARemover = null;

        for(Comodo comodo: comodos){
            if(comodo.getNome().equals(nomeComodo)){
                comodoARemover = comodo;
                break;
            }
        }

        if(comodoARemover != null){
            comodos.remove(comodoARemover);
            System.out.println("Comodo removido !");
        } else {
            System.out.println("Comodo não encontrado! ");
        }

    }

    public  void calcularAreaTotal(){
        double areaTotal = 0;

        for(Comodo comodo : comodos){
            areaTotal += comodo.calcularAreaComodo();
        }

        System.out.println("Area total: " + areaTotal);
    }

}
