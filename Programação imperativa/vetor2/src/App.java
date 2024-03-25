import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < arr1.length; i++){
            System.out.println("Digite o proximo valor: " + i);

            arr1[i] = ler.nextInt();
            arr2[i] = arr1[i]* arr1[i];

    }   

    System.out.println("Esses foram os valores digitados e suas raízes : ");
    
    for(int i = 0; i < arr1.length; i++){
        System.out.println(i + " " + arr1[i] + " " + arr2[i]);
        
    }
    
        
}}
