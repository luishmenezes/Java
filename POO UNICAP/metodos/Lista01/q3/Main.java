

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("caneta",20,"Material escolar");
        Produto produto2 = new Produto("pincel",40,"Material para arte");
        Produto produto3 = new Produto("chapeu",50,"Estilo");

        System.out.println(produto1.nome + " " + produto1.preco + " " + produto1.categoria);
        System.out.println(produto2.nome + " " + produto2.preco + " " + produto2.categoria);
        System.out.println(produto3.nome + " " + produto3.preco + " " + produto3.categoria);
    }
}

