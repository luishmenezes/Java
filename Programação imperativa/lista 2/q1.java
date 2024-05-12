/*
Input do programa
O primeiro número representa o elemento X, que é o objetivo da busca. Após isso, o número N, que representa o tamanho do vetor de entrada. Logo após, os N elementos do vetor.

Output do programa
Todas as posições que o elemento X é encontrado no vetor. Se nao houver elemento, imprima -1.

Input Samples	Output Samples
3
10
7
8
8
7
2
9
3
1
2
2	6
7
12
7
8
8
7
2
9
3
1
2
2
3
7	0
3
11
10
12
7
8
8
7
2
9
3
1
2
2
3
7	-1
 */



import java.util.ArrayList;
import java.util.Scanner;

public class q1 {
	public static ArrayList<Integer> buscaLiner(int [] v,int x){
		ArrayList<Integer> posicoes = new ArrayList<>();
		for(int i =0; i < v.length; i++){
			if(v[i]==x){
				posicoes.add(i);
			}
		}
		return posicoes;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();

		int vetor[] = new int[n];
		for(int i = 0; i <n ; i++){
			vetor[i] = s.nextInt();
		}

		ArrayList<Integer> posicoes = buscaLiner(vetor, x);

		
		if(posicoes.isEmpty()){
			System.out.println(-1);
		} else {
			for(int posicao: posicoes){
				System.out.println(posicao);
			}
		}
		

		
	}
}