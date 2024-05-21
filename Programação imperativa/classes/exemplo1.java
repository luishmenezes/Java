public class exemplo1{



    public static void main(String[] args) {
       Carro carro = new Carro();
       Carro carro2 = new Carro();
       Pessoa pessoa = new Pessoa();

       pessoa.nome = "Luis Henrique";
       pessoa.idade = 24;
       pessoa.cpf = "13674033503";

       carro.placa = "PDA1954";
       carro.marca = "Ford";
       carro.ano = 2018;

       carro2.placa = "PDZ1954";
       carro2.marca = "BYD";
       carro2.ano = 2023;

       System.out.println(carro.placa + " " + carro.marca + " " +  carro.ano);
       System.out.println(carro2.placa + " " + carro2.marca + " " +  carro2.ano);
       System.out.println(pessoa.nome + " " + pessoa.idade + " " + pessoa.cpf);
    
    }
}
class Pessoa{
    String nome;
    int idade;
    String cpf;
}


class Carro{
    String placa;
    String marca;
    int ano;

}