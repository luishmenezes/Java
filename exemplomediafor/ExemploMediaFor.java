/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplomediafor;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExemploMediaFor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qn;
        double soma = 0;
        double media;
        
        System.out.println("Digite a quantidade de números: ");
        qn = ler.nextInt();
        
        for(int i = 1; i <= qn; i++){
            System.out.println("Digite um número: " + i);
            double n = ler.nextDouble();
            soma = soma + n;
        }
            System.out.println("A soma dos " + qn + " números é de: " + soma);
            media = soma/qn;
            System.out.println("A média é de: " + media);
    }
}
