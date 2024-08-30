package POO_06_.EX1;
public class Main{

    public static void main(String[] args){
        Quadrado q1 = new Quadrado(8);

        System.out.println("A area do quadrado q1 é: " + q1.calcularArea());
        System.out.println("O comprimento do quadrado q1 é: " +  q1.calcularComprimento());
        q1.desenhaQuadrado();

        Quadrado q2 = new Quadrado();
        q2.lado = 6;

        System.out.println("A area do quadrado q2 é: " + q2.calcularArea());
        System.out.println("O comprimento do quadrado q2 é: " +  q2.calcularComprimento());
        q2.desenhaQuadrado();
    }
}
