package POO_06_.EX2;

public class Main {
    public static void main(String[] args){
        TrianguloRetangulo t1 = new TrianguloRetangulo(8,7);

        System.out.println("A hipotenusa é: " + t1.hipotenusa);
        System.out.println("A area do triangulo t1 é: " + t1.calcularArea());
        System.out.println("O comprimento do triangulo t1 é: " + t1.calcularComprimento());
        t1.desenhaTriangulo();
    }
}
