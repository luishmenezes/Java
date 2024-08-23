public class main{
    public static void main(String[] args) {
        Carro c1 = new Carro("Kia","Cerato",2020);


        System.out.println(c1.montadora + " " +  c1.modelo + " " +  c1.ano);

        c1.ligar();
        c1.desligar();
        c1.buzinar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
    }
}