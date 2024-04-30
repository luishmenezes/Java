import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] teatro = new int[10][10]; 
        inicializarTeatro(teatro); 

        
        int numCompras = s.nextInt();

        for (int i = 0; i < numCompras; i++) {
            
            int fila = s.nextInt();
            
            int poltrona = s.nextInt();

            if (venderIngresso(teatro, fila, poltrona)) {
                
            } else {
                System.out.println("Poltrona ja foi vendida");
            }
        }

        
       
        imprimirTeatro(teatro);

        s.close();
    }

    public static void inicializarTeatro(int[][] teatro) {
        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[i].length; j++) {
                teatro[i][j] = -1; // -1 indica que a poltrona está vazia
            }
        }
    }

    public static boolean venderIngresso(int[][] teatro, int fila, int poltrona) {
        if (teatro[fila - 1][poltrona - 1] == -1) {
            teatro[fila - 1][poltrona - 1] = 1; 
            return true;
        } else {
            return false;
        }
    }

    public static void imprimirTeatro(int[][] teatro) {
        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[i].length; j++) {
                System.out.print(teatro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
