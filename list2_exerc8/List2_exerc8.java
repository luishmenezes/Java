/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc8;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc8 {

    public static void main(String[] args) {
        int estudantes;
        double notas,media;
        double somaDasNotas =0;
        int contador = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número de estudantes: ");
        estudantes = ler.nextInt();
        
        
        
        while(contador < estudantes){
            System.out.println("Digite a nota do estudante" + (contador +1) + ":");
            notas = ler.nextDouble();
            if(notas <= 10){
            somaDasNotas += notas;
            contador ++;
            } else{
                System.out.println("Nota inválida");
            }
            
            
        }
        
        if(estudantes > 0){
            media = somaDasNotas/estudantes;
            System.out.println("a média das notas é de: " + media);
        } else {
            System.out.println("Não há notas para calcular");
        }
    }
}
