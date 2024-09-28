package br.unicap.poo.atividade.questao8;

public class Main {

    public static void main(String[] args) {
    Motor m1 = new Motor("shell", 400, 560, "Shell", 12);
    Motor m2 = new Motor("Heliax", 250, 350, "heliax", 15);
    Carro c1 = new Carro("Creta", 2023, "preto", m2, 100);
    Carro c2 = new Carro("Audi  a4",2024,"Branco",m1,200);

    c1.mostrarDetalhes();
    c1.verificarVelocidadeMaxima();
    
    c2.mostrarDetalhes();
    c2.verificarVelocidadeMaxima();
    }
    


}
