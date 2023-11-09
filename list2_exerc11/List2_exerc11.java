/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc11;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class List2_exerc11 {

    public static void main(String[] args) {
        int numero,i, total;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número para ver a sua tabuada: ");
        numero = ler.nextInt();
        
        System.out.println("O número escolhido foi " + numero );
        
        for(i = 1; i <= 10 ; i++){
            total = numero*i;
            System.out.println("e sua tabuada é " + numero + " x " + i + " = " + total);
        }
     
    }
}
