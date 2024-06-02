/*Você está desenvolvendo um sistema para classificar filmes com base nas avaliações dos usuários. O sistema deve ordenar as avaliações dos filmes em ordem decrescente para exibir os filmes mais bem avaliados no topo. Para isso, você precisa implementar um programa que leia as avaliações dos filmes, ordene essas avaliações usando o algoritmo de ordenação por bolha (bubble sort) e exiba as avaliações ordenadas.

Implemente um programa em Java que leia as avaliações dos filmes, ordene essas avaliações em ordem decrescente usando o algoritmo de ordenação por bolha e exiba as avaliações ordenadas. Além disso, o programa deve identificar a melhor e a pior avaliação para cada conjunto de avaliações.

Input

Um número inteiro n (1 <= n <= 1000) representando o número de avaliações.
n números inteiros representando as avaliações dos filmes.
Output

Exibir as avaliações ordenadas em ordem decrescente.
Exibir a melhor avaliação.
Exibir a pior avaliação.
Input Samples	Output Samples
5
8 9 5 7 6	Avaliacoes ordenadas: 9 8 7 6 5
Melhor avaliacao: 9
Pior avaliacao: 5
6
1 2 1 2 1 2	Avaliacoes ordenadas: 2 2 2 1 1 1
Melhor avaliacao: 2
Pior avaliacao: 1 */

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       
        int n = s.nextInt();
        
        int[] avaliacoes = new int[n];
        
        for (int i = 0; i < n; i++) {
            avaliacoes[i] = s.nextInt();
        }
        
        bubbleSort(avaliacoes);
        
        int melhorAvaliacao = avaliacoes[0];
        int piorAvaliacao = avaliacoes[avaliacoes.length - 1];
        
        System.out.print("Avaliacoes ordenadas: ");
        for (int avaliacao : avaliacoes) {
            System.out.print(avaliacao + " ");
        }
        System.out.printf("\nMelhor avaliacao: %d", melhorAvaliacao);
        System.out.printf("\nPior avaliacao: %d\n", piorAvaliacao);
        
        s.close();
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}