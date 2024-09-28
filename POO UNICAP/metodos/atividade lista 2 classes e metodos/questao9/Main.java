package br.unicap.poo.atividade.questao9;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Rua professor augusto lins e silva", 0, 600, "Luis henrique");
        Comodo c1 = new Comodo("Sala de estar", 20, 10, "sala", 3);
        Comodo c2 = new Comodo("cozinha",10, 15, "cozinha",2 );
        Comodo c3 = new Comodo("Suite",5,10,"Quarto",1);

        casa1.adicionarComodo(c1);
        casa1.adicionarComodo(c2);
        casa1.adicionarComodo(c3);

        casa1.calcularAreaTotal();


    }
}
