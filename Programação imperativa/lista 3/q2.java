/*Uma livraria está organizando seu inventário e precisa classificar os livros em ordem crescente de acordo com seus preços. Você foi encarregado de escrever um programa que leia os preços dos livros, ordene esses preços usando o algoritmo de ordenação por seleção (selection sort) e exiba os preços ordenados. Além disso, a livraria também deseja identificar os livros mais caros e mais baratos em cada seção.

Implemente um programa em Java que leia os preços dos livros em várias seções da livraria, ordene esses preços usando o algoritmo de ordenação por seleção, e exiba os preços ordenados, o preço mais barato e o preço mais caro em cada seção.

Input do programa
A entrada consiste em um número inteiro s (1 <= s <= 100) representando o número de seções na livraria.
Para cada seção, um número inteiro n (1 <= n <= 1000) representando o número de livros na seção.
Em seguida, n números decimais representando os preços dos livros.
Output do programa
Para cada seção, exibir os preços ordenados em ordem crescente, o preço mais barato e o preço mais caro.

Input Samples	Output Samples
2
5
19.99 25.50 9.99 14.75 20.00
3
30.00 22.50 25.00	Precos ordenados da secao 1: 9.99 14.75 19.99 20.00 25.50
Preco mais barato da secao 1: 9.99
Preco mais caro da secao 1: 25.50
Precos ordenados da secao 2: 22.50 25.00 30.00
Preco mais barato da secao 2: 22.50
Preco mais caro da secao 2: 30.00
*/



import java.util.Scanner;

public class q2 {

    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        
        int secoes = s.nextInt();
        double[][] precos = new double[secoes][];
        double[] maisBarato = new double[secoes];
        double[] maisCaro = new double[secoes];

        for (int i = 0; i < secoes; i++) {
            
            int n = s.nextInt();
            precos[i] = new double[n];
           
            for (int j = 0; j < n; j++) {
                precos[i][j] = s.nextDouble();
            }

            selectionSort(precos[i]);
            maisBarato[i] = precos[i][0];
            maisCaro[i] = precos[i][n - 1];
        }

        for (int i = 0; i < secoes; i++) {
            System.out.printf("Precos ordenados da secao %d: ", i + 1);
            for (double preco : precos[i]) {
                System.out.printf("%.2f ", preco);
            }
            System.out.println();
            System.out.printf("Preco mais barato da secao %d: %.2f\n", i + 1, maisBarato[i]);
            System.out.printf("Preco mais caro da secao %d: %.2f\n", i + 1, maisCaro[i]);
        }

        s.close();
    }
}