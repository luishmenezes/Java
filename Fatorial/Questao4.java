/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao4;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class Questao4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char continuar = 's';

        while (continuar == 's') {
            System.out.println("Digite um número inteiro positivo para calcular o fatorial:");
            int numero = ler.nextInt();

            if (numero < 0) {
                System.out.println("Por favor, digite um número inteiro positivo.");
            } else {
                long fatorial = calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            }

            System.out.println("Deseja calcular o fatorial de outro número? (s/n)");
            continuar = ler.next().charAt(0);

            if (continuar != 's' && continuar != 'n') {
                System.out.println("Opção inválida. Encerrando o programa.");
                break;
            }
        }
    }

    public static long calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
