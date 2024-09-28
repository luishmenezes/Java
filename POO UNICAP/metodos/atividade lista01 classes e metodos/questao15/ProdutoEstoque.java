package br.unicap.poo.atividade.questao15;

public class ProdutoEstoque {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public ProdutoEstoque(){

    }

    public ProdutoEstoque(String nome, int quantidade, double precoUnitario){
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void adicionarEstoque(int quantidade){
        this.quantidade = this.quantidade + quantidade;
        System.out.println("Quantidade adicionada no estoque: " + quantidade);
        System.out.println("Nova quantidade em estoque: " + this.quantidade);
    }

    public void removerEstoque(int quantidade){
        if(quantidade >= this.quantidade){
            System.out.println("quantidade não disponivel no estoque");
        } else {
            this.quantidade = this.quantidade - quantidade;
            System.out.println("quantidade removida do estoque: " + quantidade);
            System.out.println("Nova quantidade em estoque: " + this.quantidade);
        }
    }

    public void atualizarPreco(int novoPreco){
        this.precoUnitario = novoPreco;
        System.out.println("Novo preço: " + this.precoUnitario);
    }

    public void exibirProduto(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço do produto: " + this.precoUnitario);
        System.out.println("Valor total em estoque: " + (this.quantidade * this.precoUnitario));
    }
}
