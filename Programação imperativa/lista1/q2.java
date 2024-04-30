import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        
        boolean quadradoMagico = verificaQuadradoMagico(matriz);
        System.out.println(quadradoMagico);

        
        s.close();
    }

    
    public static boolean verificaQuadradoMagico(int[][] matriz) {
        int somaDiagonalPrincipal = somaDiagPrincipal(matriz);
        int somaDiagonalSecundaria = somaDiagSecundaria(matriz);

       
        if (somaDiagonalPrincipal != somaDiagonalSecundaria) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            if (somaLinha(matriz[i]) != somaDiagonalPrincipal ||
                somaColuna(pegarColuna(matriz, i)) != somaDiagonalPrincipal) {
                return false;
            }
        }

        return true;
    }

    
    public static int somaLinha(int[] linha) {
        int soma = 0;
        for (int valor : linha) {
            soma += valor;
        }
        return soma;
    }

    
    public static int somaColuna(int[] coluna) {
        int soma = 0;
        for (int valor : coluna) {
            soma += valor;
        }
        return soma;
    }

    
    public static int[] pegarColuna(int[][] matriz, int coluna) {
        int[] colunaArray = new int[3];
        for (int i = 0; i < 3; i++) {
            colunaArray[i] = matriz[i][coluna];
        }
        return colunaArray;
    }

    
    public static int somaDiagPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    
    public static int somaDiagSecundaria(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][2 - i];
        }
        return soma;
    }
}
