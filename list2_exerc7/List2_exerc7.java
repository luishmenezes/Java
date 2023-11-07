/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc7;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc7 {

    public static void main(String[] args) {
        String nome;
        int quantidade;
        double valor;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o produto que vai comprar: ");
        nome = ler.next();
        
        System.out.println("Digite a quantidade de produtos: ");
        quantidade = ler.nextInt();
        
        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();
        
        if(quantidade <= 5){
            System.out.println("o valor total do produto " + " " + nome + " " + "é de: " + (quantidade * valor));
            System.out.println("O valor do desconto é de: " + (quantidade * valor)* 0.02);
            System.out.println("o valor total com desconto aplicado é de: " + ((quantidade * valor)* 0.98));
        } else if(quantidade > 5 && quantidade <= 10 ){
            System.out.println("o valor total do produto " + " "+ nome + " " + " é de: " + (quantidade * valor));
            System.out.println("O valor do desconto é de: " + (quantidade * valor)* 0.03);
            System.out.println("o valor total com desconto aplicado é de: " + ((quantidade * valor)* 0.97));
        } else {
            System.out.println("o valor total do produto " + " "+ nome + " " + "é de: " + (quantidade * valor));
            System.out.println("O valor do desconto é de: " + (quantidade * valor)* 0.05);
            System.out.println("o valor total com desconto aplicado é de: " + ((quantidade * valor)* 0.95));
        }
        
    }
}
