/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc5;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc5 {

    public static void main(String[] args) {
        double x,y;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor para x: ");
        x = ler.nextDouble();
        
        System.out.println("Digite um valor para y: ");
        y = ler.nextDouble();
        
        if(x == y){
            System.out.println("Números iguais");
        } else if(x > y) {
            System.out.println("Primeiro é maior");
        } else if(y > x){
            System.out.println("Segundo é maior");
        }
    }
}
