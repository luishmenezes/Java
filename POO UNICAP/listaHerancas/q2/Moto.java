
public class Moto extends Veiculo {

    public Moto(String modelo, double kilometragem) {
        super(modelo, kilometragem);
    }

    @Override
    public double calcularCustoServico() {
        return getKilometragem() * 0.03;
    }
}
