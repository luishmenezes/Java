package br.unicap.poo.atividade.questao4;

import java.util.ArrayList;

public class Time {
    private String nome;
    private String cidade;
    private int fundacao;
    private String estadio;
    private int numeroTitulos;
    private ArrayList<Jogador> jogadores;

public Time(){}

public Time(String nome, String cidade, int fundacao, String estadio, int numeroTitulos){
this.nome = nome;
this.cidade = cidade;
this.fundacao = fundacao;
this.estadio = estadio;
this.numeroTitulos = numeroTitulos;
this.jogadores = new ArrayList<>();
}

public void setNome( String nome ){
this.nome = nome;}

public void setCidade( String cidade ){
this.cidade = cidade;}

public void setFundacao( int fundacao ){
this.fundacao = fundacao;}

public void setEstadio( String estadio ){
this.estadio = estadio;}

public void setNumeroTitulos( int numeroTitulos ){
this.numeroTitulos = numeroTitulos;}

public void setJogadores(ArrayList<Jogador> jogadores){
this.jogadores = jogadores;}

public ArrayList<Jogador> getJogadores(){
return jogadores;}

public String getNome(){
return nome;}

public String getCidade(){
return cidade;}

public int getFundacao(){
return fundacao;}

public String getEstadio(){
return estadio;}

public int getNumeroTitulos(){
return numeroTitulos;}

public void adicionarJogador(Jogador jogador){
jogadores.add(jogador);
System.out.println("Jogador " + jogador.getNome() + " adicionado!");}

public void listarJogadores(){
System.out.println("Jogadores do time: " + this.nome);
for(Jogador jogador: jogadores){
System.out.println(jogador.getNome());}}

}
