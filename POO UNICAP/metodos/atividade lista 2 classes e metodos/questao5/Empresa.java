package br.unicap.poo.atividade.questao5;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;
    private String cidadeSede;
    private double faturamentoAnual;

private ArrayList<Departamento> departamentos;

public Empresa(){}

public Empresa(String nome, String cnpj, int numeroFuncionarios, String cidadeSede, double faturamentoAnual){
this.nome = nome;
this.cnpj = cnpj;
this.numeroFuncionarios = numeroFuncionarios;
this.cidadeSede = cidadeSede;
this.faturamentoAnual = faturamentoAnual;
this.departamentos= new ArrayList<>();
}


public void setNome (String nome){
this.nome = nome;}

public void setCnpj( String cnpj){
this.cnpj = cnpj;}

public void setNumeroFuncionarios(int numeroFuncionarios){
this.numeroFuncionarios = numeroFuncionarios;}

public void setCidadeSede(String cidadeSede){
this.cidadeSede = cidadeSede;
}

public void setFaturamentoAnual(double faturamentoAnual){
this.faturamentoAnual = faturamentoAnual;}

public void setDepartamentos(ArrayList<Departamento>departamentos){
this.departamentos = departamentos;}

public String getNome(){
return nome;}

public String getCnpj(){
return cnpj;}

public int getNumeroFuncionarios(){
return numeroFuncionarios;}

public String getCidadeSede(){
return cidadeSede;}

public double getFaturamentoAnual(){
return faturamentoAnual;}

public ArrayList<Departamento> getDepartamentos(){
return departamentos;}

public void adicionarDepartamento(Departamento departamento){
departamentos.add(departamento);
System.out.println(departamento.getNome() + " adicionado!");
}

public void listarDepartamentos(){
System.out.println("Departamentos da empresa " + this.nome);
for  ( Departamento departamento: departamentos){
System.out.println(departamento.getNome());}
}

}
