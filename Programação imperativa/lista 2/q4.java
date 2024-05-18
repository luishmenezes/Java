/*Você é um bibliotecário e deseja implementar um sistema em Java para buscar rapidamente títulos de livros em sua biblioteca. Você recebeu uma matriz onde cada linha representa os títulos de livros, em ordem alfabética, e cada linha é um gênero de filme diferente.

Escreva uma função em Java chamada buscarTitulo que recebe como parâmetros uma matriz de strings de títulos, onde cada linha representa os títulos em ordem alfabética, e a string de busca. A função deve realizar uma busca binária em cada linha da matriz para encontrar um título específico e retornar o gênero no qual o título procurado se adequa. Caso não seja encontrado, imprima "Nao encontrado".

Input do programa
A quantidade l e colunas c das linhas da matriz M

Os gêneros de cada grupo de filmes

Os elementos da matriz M

A string de busca (Será sempre igual ao nome do livro buscado)

OBS.: Ao ler o último inteiro N com nextInt(). Utilizar um nextLine() para capturar o \n após o número e não sobrar para a primeira leitura de string.

int n = s.nextInt();
s.nextLine();
Output do programa
O genero do filme, se o título foi encontrado. A frase "Nao encontrado", caso contrário.

Imput Samples	Output Samples
3
4
Fantasia
Classicos
Terror
Harry Potter
O Hobbit
O Senhor dos Aneis
Percy Jackson
Alto da Compadecida
Dom casmurro
Iracema
Morte e vida severina
Cemiterio Maldito
Frankenstein
It: a coisa
O Exorcista
O Hobbit	Fantasia
3
4
Fantasia
Classicos
Terror
Harry Potter
O Hobbit
O Senhor dos Aneis
Percy Jackson
Alto da Compadecida
Dom casmurro
Iracema
Morte e vida severina
Cemiterio Maldito
Frankenstein
It: a coisa
O Exorcista
Vampiro	Nao encontrado */

import java.util.Scanner;

public class q4 {

    public static String buscarTitulo(String[][] titulos, String[] generos, String busca) {
        for (int i = 0; i < titulos.length; i++) {
            int resultadoBusca = buscaBinaria(titulos[i], busca);
            if (resultadoBusca != -1) {
                return generos[i];
            }
        }
        return null;
    }
    
    // Função de busca binária em um array de strings
    public static int buscaBinaria(String[] array, String alvo) {
        int esquerda = 0;
        int direita = array.length - 1;
        
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            
            int comparacao = alvo.compareTo(array[meio]);
            
            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                direita = meio - 1;
            } else {
                esquerda = meio + 1;
            }
        }
        
        return -1;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int c = s.nextInt();
        s.nextLine();

        String[] generos = new String[l];
        for(int i =0; i< l;i++){
            generos[i] = s.nextLine();
        }

        String[][] titulos = new String[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                titulos[i][j] = s.nextLine();
            }
        }

        String busca = s.nextLine();
        
        // Chamando a função buscarTitulo
        String generoEncontrado = buscarTitulo(titulos, generos, busca);
        
        // Imprimindo o resultado
        System.out.println(generoEncontrado != null ? generoEncontrado : "Nao encontrado");
        
    }
}
