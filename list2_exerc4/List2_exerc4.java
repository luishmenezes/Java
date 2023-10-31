/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc4;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc4 {

    public static void main(String[] args) {
        double a,b,c;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor do lado A do triângulo: ");
        a = ler.nextDouble();
        
        System.out.println("Digite o valor do lado B do triângulo: ");
        b = ler.nextDouble();
        
        System.out.println("Digite o valor do lado C do triângulo: ");
        c = ler.nextDouble();
        
        if(a < (b + c ) || b < (a + c) || c < (a + b)){
            System.out.println("Os valores podem ser um triângulo");
        } else {
            System.out.println("Os valores não podem ser um triângulo");
        }
    }
}
