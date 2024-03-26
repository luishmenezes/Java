import java.util.Scanner;

public class App {

  
    public static void main(String[] args) throws Exception {
        int[] elementos = new int[10];
        int[] elementosInverso = new int[10];
        Scanner ler = new Scanner(System.in);

        for( int i = 0; i < elementos.length; i++){
            elementos[i] = ler.nextInt();
        }

                
        for( int i = 9;i >= 0; i-- ){
            elementosInverso[i] = elementos[elementos.length - i -1];
            
        }

        for( int i = 0; i < 10; i++){
            System.out.println(elementos [i] + " " + elementosInverso[i]);
        }
        
    }
}
