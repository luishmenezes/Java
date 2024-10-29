import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("celular", 1200);
        Produto p2 = new Produto("notebook", 3000);
        Produto p3 = new Produto("relogio", 800);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(p2);
        produtos.add(p1);
        produtos.add(p3);

        System.out.println(produtos.get(0).getNome());

        System.out.println(produtos.get(0).getValor());
        System.out.println("o tamanho da ArrayList é " + produtos.size());

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Nome do produto: " + produtos.get(i).getNome());
            System.out.println("Valor do produto: " + produtos.get(i).getValor());
            System.out.println("------------------------------");
        }
    }
}
