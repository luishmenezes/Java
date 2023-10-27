

package com.mycompany.list1_ex3;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List1_ex3 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite um valor para A: ");
        a = dado.nextInt();
        
        System.out.println("Digite um valor para B: ");
        b = dado.nextInt();
        
        if( a == b ){
            c = a + b; 
            System.out.println("o valor vai ser uma soma: " + c);                     
        } else {
            c = a * b;
            System.out.println("o valor vai ser uma multiplicação: " + c);    
        }
        
    }
}
