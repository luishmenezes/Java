package POO_06_.EX2;
import java.lang.Math;

public class TrianguloRetangulo {
    double base;
    double altura;
    double hipotenusa;
    

    TrianguloRetangulo(){

    }

    TrianguloRetangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt((base*base)+(altura*altura));
    }

    double calcularArea(){
        return (base*altura)/2;
    }

    double calcularComprimento(){
        return hipotenusa + base + altura;
    }

    void desenhaTriangulo(){
        for(int i = 0; i < base; i++){
        for(int j = 0; j < i; j ++){
            System.out.print("*");
        }
    System.out.print("\n");}
    }
}

