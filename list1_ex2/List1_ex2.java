
package com.mycompany.list1_ex2;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List1_ex2 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite um valor para A: ");
        a = dado.nextInt();
        
        System.out.println("Digite um valor para B: ");
        b = dado.nextInt();
        
        System.out.println("Digite um valor para C: ");
        c = dado.nextInt();
        
        if(a + b < c){
            System.out.println("O valor da soma de a + b é menor que C ");
        } else {
            System.out.println("O valor da soma de a + b é não é menor que C ");
        }
    }
}
