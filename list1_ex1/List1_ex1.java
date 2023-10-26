/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list1_ex1;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List1_ex1 {

    public static void main(String[] args) {
        int x;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        x = ler.nextInt();
        
        if (x % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("é impar");
        }
    }
}
