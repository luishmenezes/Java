/*Implemente uma busca sequencial em um array de strings, simulando uma lista de livros em uma biblioteca. Ao buscar uma string qualquer, a busca deve retornar todos os livros que contém aquela string. Se não achar, retorne "Livro nao encontrado!". Além disso, a busca deve ignorar letras maiúsculas e minúsculas, ou seja, se o livro se chama "Meu Titulo" e a busca for "titulo", o livro "Meu titulo" deve ser retornado como resposta.

Input do programa
O número N de livros da biblioteca

A lista dos N livros da biblioteca

Uma string de busca que será usada para percorrer os livros

OBS.: Ao ler o primeiro inteiro N com nextInt(). Utilizar um nextLine() para capturar o \n após o número e não sobrar para a primeira leitura de string.

int n = s.nextInt();
s.nextLine();
Output do programa
Todos os livros que contém a string de busca

Input Samples	Output Samples
4
O senhor dos aneis
O Hobbit
O senhor das armas
Harry Potter
senhor	O senhor dos aneis
O senhor das armas
4
O senhor dos aneis
O Hobbit
O senhor das armas
Harry Potter
jogo	Livro nao encontrado!
4
Dom casmurro
Dom Quixote
Alto da Compadecida
Dom
dom	Dom casmurro
Dom Quixote
Dom
*/



import java.util.ArrayList;
import java.util.Scanner;

public class q2 {

	public static ArrayList<String> buscaLivro(String [] livros, String busca){
		ArrayList<String> nomesLivros = new ArrayList<>();
		for(String livro : livros){
			if(livro.toLowerCase().contains(busca)){
				nomesLivros.add(livro);
			}
		} 
		return nomesLivros;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int nLivros = s.nextInt();
		s.nextLine();

		

		String vetorLivros[] = new String[nLivros];
		for(int i = 0; i < nLivros; i++){
			vetorLivros[i] = s.nextLine();
		}
		
		String buscar = s.nextLine().toLowerCase();

		ArrayList<String> nomesLivros = buscaLivro(vetorLivros, buscar);

		if(nomesLivros.isEmpty()){
			System.out.println("Livro nao encontrado!");
		} else {
			for(String livro: nomesLivros){
				System.out.println(livro);
			}
		}
	}

}