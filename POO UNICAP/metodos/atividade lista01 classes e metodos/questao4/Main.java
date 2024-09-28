package br.unicap.poo.atividade.questao4;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Luis","Contador",2600);
        Funcionario f2 = new Funcionario("joão","Veterinario",3000);
        Funcionario f3 = new Funcionario("marta","Pediatra",4000);

        f1.mostrarFuncionario();
        f2.mostrarFuncionario();
        f3.mostrarFuncionario();
        }
}
