

import java.util.Scanner;



public class q1 {

	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] matriz = new int[4][4];

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

       
        imprimirMatriz(matriz);
		System.out.println();
        
        int[][] matrizTriangularInferior = transformarEmTriangularInferior(matriz);

       
        imprimirMatriz(matrizTriangularInferior);

        // Fechar o scanner
        s.close();
    }

    
    private static int[][] transformarEmTriangularInferior(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                matriz[i][j] = 0;
            }
        }
        return matriz;
    }

   
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}