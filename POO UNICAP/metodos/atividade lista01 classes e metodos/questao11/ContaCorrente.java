package br.unicap.poo.atividade.questao11;

public class ContaCorrente {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoTitular;

    public ContaCorrente(){

    }

    public ContaCorrente(String numeroDaConta, double saldo, String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("novo saldo da conta: " + this.saldo);
    }

    public void sacar(double valor){
        if(this.saldo < valor){
            System.out.println("saldo insuficiente");
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("novo saldo da conta: " + this.saldo);
        }
    }

    public void transferir(ContaCorrente destino, double valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("saldo atual: " + this.saldo);
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual da conta: " + this.saldo);
    }
}
