/*Suponha que você tem um array de inteiros ordenado em ordem crescente. Escreva um código em Java que lê o vetor ordenado e um número inteiro a ser buscado. O código deve imprimir a posição do número no vetor, se ele estiver presente, caso contrário, imprima -1. Utilize o algoritmo de busca binária para implementar esse programa e imprima também quantos passos foram necessários para achar o número.

Input

Um tamanho N do vetor

O número que será buscado

O vetor ordenado com N inteiros

Output

A posição do elemento buscado e a quantidade de passos para achar o número

Input Samples	Output Samples
30
9
4
9
14
14
21
24
27
30
34
37
42
44
52
52
54
56
57
64
65
66
71
81
83
84
85
85
89
96
97
98	1 5
30
100
4
9
14
14
21
24
27
30
34
37
42
44
52
52
54
56
57
64
65
66
71
81
83
84
85
85
89
96
97
98	-1 5 */

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        int N = s.nextInt();
        
        
        int numeroBuscado = s.nextInt();
        
        
        int[] vetor = new int[N];
        for (int i = 0; i < N; i++) {
            vetor[i] = s.nextInt();
        }
        
        
        int[] resultado = buscaBinaria(vetor, numeroBuscado);
        int posicao = resultado[0];
        int passos = resultado[1];
        
        // Imprimindo o resultado
        if (posicao != -1) {
            System.out.println((posicao) + " " + passos);
        } else {
            System.out.println("-1 " + passos);
        }
    }
    
    // Função para busca binária
    public static int[] buscaBinaria(int[] vetor, int alvo) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int passos = 0;
        
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            
            if (vetor[meio] == alvo) {
                passos++;
                return new int[] {meio, passos};
            }
            
            if (vetor[meio] < alvo) {
                passos++;
                inicio = meio + 1;
            } else {
                passos++;
                inicio = meio - 1;
            }
        }
        
        return new int[] {-1, passos};
    }
}
