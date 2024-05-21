import java.util.Scanner;

public class exemplo2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro[] carros = new Carro[2];

        for(int i = 0; i < carros.length; i++){
            System.out.println("Carro " + i);
            carros[i] = new Carro();
            System.out.print("Placa: ");
            carros[i].placa = ler.next();
            System.out.print("Marca: ");
            carros[i].marca = ler.next();
            System.out.print("Ano: ");
            carros[i].ano = ler.nextInt();
            System.out.println("Seu carro é: " + carros[i].placa + " " + carros[i].marca + " " + carros[i].ano);
        }

        for(int i = 0; i < carros.length;i++){
            System.out.println("Carro: " + i);
            System.out.println("Placa: " + carros[i].placa);
            System.out.println("Marca: " + carros[i].marca);
            System.out.println("Ano: " + carros[i].ano);
        }
    }
    
}

class Carro{
    String placa;
    String marca;
    int ano;
}

class Pessoa{
    String nome;
    int idade;
    String cpf;
}
