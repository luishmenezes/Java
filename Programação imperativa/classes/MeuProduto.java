import java.util.Scanner;

public class MeuProduto {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto[] produto = new Produto[3];

        for(int i = 0; i < produto.length; i++){
            System.out.println("Produto " + (i + 1));
            produto[i] = new Produto();
            System.out.println("Nome do produto: ");
            produto[i].nome = ler.next();
            System.out.println("Código do produto: ");
            produto[i].codigo = ler.nextInt();
            System.out.println("Preço do produto: ");
            produto[i].preco = ler.nextDouble();

            //System.out.println("Produto : " + produto[i].nome + " " +  produto[i].codigo + " " +  produto[i].preco);
        }

        for(int i = 0; i < produto.length;i++){
            System.out.println("Produto : " + (i + 1));
            System.out.println("Nome : " + produto[i].nome);
            System.out.println("Codigo: " + produto[i].codigo);
            System.out.println("Preço : " + produto[i].preco);
        }

    }
}
class Produto{
    String nome;
    int codigo;
    double preco;

  }