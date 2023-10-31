/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc3;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc3 {

    public static void main(String[] args) {
        double x,y,resultado;
        String operacao;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor para x: ");
        x = ler.nextDouble();
        System.out.println("Digite um valor para y: ");
        y = ler.nextDouble();
        
        System.out.println("Escolha a operação Desejada: "
                + "A: Somar os dois números"
                + "B: Calcular a diferença entre dois números"
                + "C: Calcular a multiplicação entre dois números"
                + "D: Calcular a divisão do primeiro número pelo segundo"
                + "E: Calcular o resto da divisão do primeiro número pelo segundo"
                + "F: Calcular o primeiro número elevado ao segundo"
                + "G: Calcular a raiz quadrada do segundo número");
        operacao = ler.next();
        
        if(operacao.equals("A")|| operacao.equals("a")){
            resultado = x + y;
            System.out.println("Você escolheu soma: " + resultado);
        }else if(operacao.equals("B")|| operacao.equals("b")){
            resultado = x - y;
            System.out.println("Você escolheu a diferença entre os números: " + resultado);
        }else if(operacao.equals("C")||operacao.equals("c")){
            resultado = x * y;
            System.out.println("Você escolheu multiplicação: " + resultado);
        }else if(operacao.equals("D")||operacao.equals("d")){
            resultado = x / y;
            System.out.println("Você escolheu divisão: " + resultado);
        } else if(operacao.equals("E")||operacao.equals("e")){
            if(y != 0){
                resultado = x % y;
            } else{
                System.out.println("Erro: Divisão por zero!");
            }
        }else if(operacao.equals("F")||operacao.equals("f")){
            resultado = Math.pow(x, y);
        }else if(operacao.equals("G")||operacao.equals("G")){
            resultado = Math.sqrt(y);
        } else {
            System.out.println("Código inválido");
        }
        
    }
}
