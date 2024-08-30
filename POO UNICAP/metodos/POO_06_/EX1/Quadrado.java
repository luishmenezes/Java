package POO_06_.EX1;
public class Quadrado {
    double lado;

    Quadrado (double lado){
        this.lado = lado;
    }

    Quadrado(){

    }

    double calcularArea(){
        return lado * lado;
        
    }

    double calcularComprimento(){
        return lado * 4;
    }

    void desenhaQuadrado(){
        for(int i = 0; i < lado;i++){
            for(int j = 0; j < lado; j++){
                System.out.print("*  ");
                
            }
            System.out.print("\n");
        }
    }
}

