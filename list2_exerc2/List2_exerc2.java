/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.list2_exerc2;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List2_exerc2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação do segundo grau (ax^2 + bx + c = 0):");

        System.out.print("a: ");
        double a = input.nextDouble();

        System.out.print("b: ");
        double b = input.nextDouble();

        System.out.print("c: ");
        double c = input.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            // Duas raízes reais distintas
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("As raízes reais são: x1 = " + raiz1 + " e x2 = " + raiz2);
        } else if (discriminante == 0) {
            // Uma raiz real (raiz dupla)
            double raiz = -b / (2 * a);
            System.out.println("A raiz real é: x = " + raiz);
        } else {
            // Não há raízes reais
            System.out.println("A equação não tem solução no conjunto dos números reais.");
        }
    }
}
