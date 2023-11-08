/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc9;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc9 {

    public static void main(String[] args) {
        int quantidadeValores = 10;
        int contador = 1;
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int valor;
        Scanner ler = new Scanner(System.in);
        
        while(contador <= quantidadeValores){
            System.out.println("Digite um valor para " + contador + ":");
            valor = ler.nextInt();
            
            if(valor > maiorValor){
            maiorValor = valor;
        } 
            if (valor < menorValor) {
            menorValor = valor;
        } 
            contador++;
         }
        System.out.println("O maior valor foi: " + maiorValor);
        System.out.println("O menor valor foi: " + menorValor);
          
        
    }
}