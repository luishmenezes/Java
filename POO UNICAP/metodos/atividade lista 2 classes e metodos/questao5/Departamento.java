package br.unicap.poo.atividade.questao5;

public class Departamento {
    private String nome;
    private String codigo;
    private int numeroFuncionarios;
    private double orcamentoAnual;
    private String gerenteResponsavel;

public Departamento(){}

public Departamento(String nome, String codigo, int numeroFuncionarios, double orcamentoAnual, String gerenteResponsavel){
this.nome = nome;
this.codigo = codigo;
this.numeroFuncionarios = numeroFuncionarios;
this.orcamentoAnual = orcamentoAnual;
this.gerenteResponsavel = gerenteResponsavel;}

public void setNome(String nome){
this.nome = nome;}

public void setCodigo(String codigo){
this.codigo = codigo;}

public void setNumeroFuncionarios(int numeroFuncionarios){
this.numeroFuncionarios = numeroFuncionarios;}

public void setOrcamentoAnual(double orcamentoAnual){
this.orcamentoAnual = orcamentoAnual;}

public void setGerenteResponsavel(String gerenteResponsavel){
this.gerenteResponsavel = gerenteResponsavel;}

public String getNome(){
return nome;}

public String getCodigo(){
return codigo;}

public int getNumeroFuncionarios(){
return numeroFuncionarios;}

public double getOrcamentoAnual(){
return orcamentoAnual;}

public String getGerenteResponsavel(){
return gerenteResponsavel;}
}

