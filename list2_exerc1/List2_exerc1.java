/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc1;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc1 {

    public static void main(String[] args) {
        int idEstudante;
        double nota1, nota2, nota3, me, ma;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a identificação do estudante: ");
        idEstudante = ler.nextInt();
        
        System.out.println("Digite a primeira nota do estudante: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota do estudante: ");
        nota2 = ler.nextDouble();
        System.out.println("Digite a terceira nota do estudante: ");
        nota3 = ler.nextDouble();
        
        me = (nota1+nota2+nota3) / 3;
        ma = (nota1 + 2*nota2+3*nota3+me)/7;
        
        System.out.println("A identificação do estudante é: " + idEstudante);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 2: " + nota3);
        System.out.println("Média dos exercícios:  " + me);
        System.out.println("Média de aproveitamento: " + ma);
        
        if(ma >= 9){
            System.out.println("A : Aprovado");
        } else if(ma < 9 && ma >= 7.5){
            System.out.println("B : Aprovado");
        } else if(ma < 7.5 && ma >= 6){
            System.out.println("C : Aprovado");
        }else if(ma < 6 && ma >= 4){
            System.out.println("D : Recuperação");
        } else{
            System.out.println("E : Reprovado");
        }
        
        
        
    }
}
