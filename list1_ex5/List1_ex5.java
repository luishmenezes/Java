

package com.mycompany.list1_ex5;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List1_ex5 {

    public static void main(String[] args) {
        int x,somapar,somaimpar;
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        x = dado.nextInt();
        
        if (x%2 == 0){
            somapar = x + 5;
            System.out.println("O número é par e acrescido de 5 fica: " + somapar);
        } else {
            somaimpar = x + 8;
            System.out.println("O número é impar e acrescido de 8 fica: " + somaimpar);
        }
    }
}
