
public class Carro extends Veiculo {

    public Carro(String modelo, double kilometragem) {
        super(modelo, kilometragem);
    }

    @Override
    public double calcularCustoServico() {
        return getKilometragem() * 0.05;
    }

}
