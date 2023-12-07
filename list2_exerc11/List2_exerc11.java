/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc11;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_Exerc11 {

    public static void main(String[] args) {
        int numero,i,resultado;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor da tabuada desejada: ");
        numero = ler.nextInt();
        
        if(numero > 0 && numero <= 10){
            System.out.println("Tabuada de " + numero);
        
        for(i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        } else {
            System.out.println("Número não está entre 1 e 10.");
        }
    }
}
