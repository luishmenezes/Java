

package com.mycompany.list1_ex6;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List1_ex6 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        a = dado.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        b = dado.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        c = dado.nextInt();
        
        if (a < b){
            if ( b < c) {
                System.out.println(a + "-" + b + "-" + c);
            } else if (a < c ){
                System.out.println(a + "-" + c + "-" + b);
            } else {
                System.out.println(c + "-" + a + "-" + b);
            }
        } else if(b < c){
            if(a < c){
                System.out.println(b + "-" + a + "-" + c);
            } else {
                 System.out.println(b + "-" + c + "-" + a);
            }
        } else {
             System.out.println(c + "-" + b + "-" + a);
        }
    }
}
