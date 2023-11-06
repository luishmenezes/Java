/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc6;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc6 {

    public static void main(String[] args) {
       //etanol: ate 20L desc = 3%/L
        //etanol? acima de 20L desc = 5%/L
        //gaso: até 20L desc= 4%/L
        //gaso: acima de 20L desc = 6%/L
        
        String combustivel;
        double litros, valor;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o combustivel: ");
        combustivel = ler.next();
        
        System.out.println("Digite a quantidade de litros: ");
        litros = ler.nextDouble();
        
        if (combustivel.equals("gasolina")){
            if (litros < 20){
                System.out.println("Valor do desconto é de: " + (4.02 * 0.03) + " " + "por litro");
                System.out.println("Valor total de desconto é de: " + (litros * (4.02 * 0.03)));
                System.out.println("Valor total a ser pago é de: " + (litros * (4.02 * 0.97)));
            } else {
                System.out.println("Valor do desconto é de " + (4.02 * 0.05) + " " + "por litro");
                System.out.println("Valor total de desconto é de: " + (litros * (4.02 * 0.05)));
                System.out.println("Valor total a ser pago é de: " + (litros * (4.02 * 0.95)));
            }
            
        } else if (combustivel.equals("etanol")){
            if (litros < 20){
                System.out.println("Valor do desconto é de: " + (3.24 * 0.04) + " " + "por litro");
                System.out.println("Valor total de desconto é de: " + (litros * (3.24 * 0.04)));
                System.out.println("Valor total a ser pago é de: " + (litros * (3.24 * 0.96)));
            } else {
                System.out.println("Valor do desconto é de: " + (3.24 * 0.06) + " " + "por litro");
                System.out.println("Valor total de desconto é de: " + (litros * (3.24 * 0.06)));
                System.out.println("Valor total a ser pago é de: " + (litros * (3.24 * 0.94)));
            }
        } else {
            System.out.println("Invalido. Digite gasolina ou etanol.");
        }
        
    }
}
