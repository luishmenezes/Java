package br.unicap.poo.atividade.questao3;

public class Produto {
   
        private String nome;
        private double preco;
        private String categoria;
    
        public Produto(String nome, double preco,String categoria){
            this.nome = nome;
            this.preco = preco;
            this.categoria = categoria;
        }
    
       public Produto(){
            
        }

        public String getCategoria() {
            return categoria;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void mostrarProduto(){
            System.out.println("Nome do produto: " + this.nome);
            System.out.println("Preço: " + this.preco);
            System.out.println("Categoria: " + this.categoria);
        }
    
}
