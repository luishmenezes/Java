/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc10;

import java.util.Scanner;

/**
 *
 * DUPLA:  Luis Henrique e David Henrique
 */
public class List2_exerc10 {

    public static void main(String[] args) {
        double renda, rendaMedia, mediaFilhos, percentualHabitantesMenorQue200;
        double maiorRenda = 0;
        double somaRenda = 0;
        int somaFilhos = 0;
        int filhos, habitantes, i;
        double habitantesRendaMenorQue200 = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número de habitantes: ");
        habitantes = ler.nextInt();
        
        for(i = 1; i <= habitantes; i++){
            System.out.println("Digite a renda do habitante " + i + ": ");
            renda = ler.nextDouble();
            
            System.out.println("Digite a quantidade de filhos do habitante " + i + ": ");
            filhos = ler.nextInt();
            
            somaRenda += renda;
            somaFilhos += filhos;
            
            
            if(renda > maiorRenda ){
                maiorRenda = renda;
            } 
            if (renda < 200){
                habitantesRendaMenorQue200++;
            }
        }
        
        rendaMedia = somaRenda/habitantes;
        mediaFilhos = somaFilhos/habitantes;
        percentualHabitantesMenorQue200 = habitantesRendaMenorQue200 / habitantes * 100;
        
        System.out.println("A renda média da população é de: " + rendaMedia);
        System.out.println("A média do número de filhos é de: " + mediaFilhos);
        System.out.println("O maior salário de todos os habitantes é de: " + maiorRenda);
        System.out.println("O percentual de habitantes com renda menor que 200 é de: " + percentualHabitantesMenorQue200 + "%");
        
    }
    
}
