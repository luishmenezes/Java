package br.unicap.poo.atividade.questao5;

public class Main {
    public static void main(String[] args){
        Empresa e1 = new Empresa("Fabrica ltda", "1233210323012", 40, "Recife", 950000);
        Departamento d1 = new Departamento("Financeiro", "25306", 8, 300000, "Luis Henrique");
        Departamento d2 = new Departamento("Tecnologia", "24025", 10, 300000, "Milena ");
        Departamento d3 = new Departamento("Comercial", "22035", 22, 350000, "João");
        
        e1.adicionarDepartamento(d1);
        e1.adicionarDepartamento(d2);
        e1.adicionarDepartamento(d3);
        
        e1.listarDepartamentos();}}
        

