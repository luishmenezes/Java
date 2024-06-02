/*
Uma empresa deseja analisar as vendas anuais de seus produtos para identificar tendências de crescimento ou declínio. Para isso, você precisa escrever um programa que ordene as vendas anuais de cada produto em ordem crescente, usando o algoritmo de ordenação por inserção (insertion sort). Além disso, você deve calcular e exibir a mediana das vendas de cada produto após a ordenação.

Input do programa
Leia os dados de vendas anuais de vários produtos, ordene os dados de cada produto usando o algoritmo de ordenação por inserção (insertion sort) e calcule a mediana (https://brasilescola.uol.com.br/matematica/mediana.htm) das vendas anuais de cada produto. A entrada consiste em:

Um número inteiro p (1 <= p <= 100) representando o número de produtos.
Para cada produto, um número inteiro n (1 <= n <= 1000) representando o número de anos que vendas foram registradas.
Em seguida, n números inteiros representando as vendas anuais do produto.
Output do programa
Para cada produto, exibir as vendas ordenadas em ordem crescente e a mediana das vendas.

Input Samples	Output Samples
2
5
500 400 300 200 100
4
1000 2000 1500 1200	Vendas ordenadas do produto 1: 100 200 300 400 500
Mediana das vendas do produto 1: 300.0
Vendas ordenadas do produto 2: 1000 1200 1500 2000
Mediana das vendas do produto 2: 1350.0
 */



 import java.util.Scanner;


 public class q1 {
 
	 
	 public static void insertionSort(int[] arr) {
		 for (int i = 1; i < arr.length; i++) {
			 int key = arr[i];
			 int j = i - 1;
			 while (j >= 0 && arr[j] > key) {
				 arr[j + 1] = arr[j];
				 j = j - 1;
			 }
			 arr[j + 1] = key;
		 }
	 }
 
	
	 public static double calculateMediana(int[] arr) {
		 int n = arr.length;
		 if (n % 2 == 1) {
			 return arr[n / 2];
		 } else {
			 return (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
		 }
	 }
 
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
 
		 
		 int p = s.nextInt();
		 int[][] vendas = new int[p][];
		 double[] medianas = new double[p];
 
		 for (int i = 0; i < p; i++) {
			
			 int n = s.nextInt();
			 vendas[i] = new int[n];
			 
			 for (int j = 0; j < n; j++) {
				 vendas[i][j] = s.nextInt();
			 }
 
			 insertionSort(vendas[i]);
			 medianas[i] = calculateMediana(vendas[i]);
		 }
 
		 for (int i = 0; i < p; i++) {
			 System.out.printf("Vendas ordenadas do produto %d: ", i + 1);
			 for (int j = 0; j < vendas[i].length; j++) {
				 System.out.print(vendas[i][j] + " ");
			 }
			 System.out.println();
			 System.out.printf("Mediana das vendas do produto %d: %.1f\n", i + 1, medianas[i]);
		 }
 
		 s.close();
	 }
 }