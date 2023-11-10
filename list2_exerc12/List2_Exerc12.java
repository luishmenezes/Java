/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc12;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_Exerc12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nFatorial;
        int fat = 1;
        int i;        
        
        System.out.println("Digite o fatorial desejado: ");
        nFatorial = ler.nextInt();
        
        if( nFatorial >= 1){
            for(i = nFatorial; i > 1; i--){
            fat = fat *i;
        }
            System.out.println("O resultado do fatorial é: " + fat);
        } else {
            System.out.println("Número negativo");
        }
        
        
        
        
    }
}