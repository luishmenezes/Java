public class Main {
    public static void main(String[] args) {
        Consessionaria c1 = new Consessionaria("Auto Parvi", "Afogados");

        Carro car1 = new Carro("Golf", 10000);
        Carro car2 = new Carro("Polo", 5000);
        Moto m1 = new Moto("honda", 2000);
        Moto m2 = new Moto("suzuki", 4000);

        c1.adicionarVeiculo(car1);
        c1.adicionarVeiculo(car2);
        c1.adicionarVeiculo(m1);
        c1.adicionarVeiculo(m2);

        c1.listarVeiculos();

    }
}
