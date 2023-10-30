

package com.mycompany.list1_ex8;

import java.util.Scanner;

/**
 *
 * @author Luis Henrique
 */
public class List1_ex8 {

    public static void main(String[] args) {
        int valorProduto, codigo;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        valorProduto = ler.nextInt();
        
        System.out.println("Qual a forma de pagamento ?");
        codigo = ler.nextInt();
        
        if(codigo == 1){
            System.out.println("Valor de desconto é de : " + valorProduto*0.1);
            System.out.println("Valor final é de : " + valorProduto*0.9);
        } else if(codigo == 2){
            System.out.println("Valor de desconto é de : " + valorProduto*0.05);
            System.out.println("Valor final é de : " + valorProduto*0.95);
        } else if(codigo == 3){
            System.out.println("Valor de desconto é de : " + valorProduto*0.00);
            System.out.println("Valor final é de : " + valorProduto*1);
        } else if (codigo == 4){
            System.out.println("Valor de juros é de : " + valorProduto*0.05);
            System.out.println("Valor final é de : " + valorProduto*1.05);
        } else {
            System.out.println("Codigo inválido : Digite 1, 2, 3 ou 4");
        }
    }
}
