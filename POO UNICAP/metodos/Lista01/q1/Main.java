package Lista01.q1;



public class Main {
    public static void main (String[] args) {
    Livro livro1 = new Livro("Magico de oz","Luis Henrique",2001);
    Livro livro2 = new Livro("Padrinhos mágicos", "Stephen Spielberg", 2005);
    Livro livro3 = new Livro("Diario de um banana", "Luluzinha", 2010);

    

    System.out.println(livro1.titulo + " " + livro1.autor + " " + livro1.ano);
    System.out.println(livro2.titulo + " " + livro2.autor + " " + livro2.ano);
    System.out.println(livro3.titulo + " " + livro3.autor + " " + livro3.ano);


    }
}

