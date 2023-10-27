/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list1_ex4;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List1_ex4 {

    public static void main(String[] args) {
        int x, dobro, triplo;
        Scanner dado;
        dado = new Scanner(System.in);
        
        
        System.out.println("Digite um número: ");
        x = dado.nextInt();
        
        if(x >= 0){
            dobro = x *2;
            System.out.println("O numérico é positivo e vai ser multiplicado por 2 : " + dobro);
        } else {
            triplo = x * 3;
            System.out.println("O numérico é negativo e vai ser multiplicado por 3 : " + triplo);
        }
    }
}
