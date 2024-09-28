package br.unicap.poo.atividade.questao4;

public class Jogador{
    private String nome;
    private String posicao;
    private int numeroCamisa;
    private int golsMarcados;
    private double altura;

public Jogador(){}

public Jogador(String nome, String posicao, int numeroCamisa, int golsMarcados, double altura){
this.nome = nome;
this.posicao = posicao;
this.numeroCamisa = numeroCamisa;
this.golsMarcados = golsMarcados;
this.altura = altura;
}

public void setNome( String nome) {
this.nome = nome; }

public void setPosicao( String posicao ){
this.posicao = posicao;}

public void setNumeroCamisa( int numeroCamisa ) {
this.numeroCamisa = numeroCamisa;
}

public void setGolsMarcados( int golsMarcados ) {
this.golsMarcados = golsMarcados;
}

public void setAltura( double altura ) {
this.altura = altura;
}

public String getNome(){
return nome;}

public String getPosicao(){
return posicao;}

public int getNumeroCamisa(){
return numeroCamisa;}

public int getGolsMarcados(){
return golsMarcados;}

public double getAltura(){
return altura;}
}

