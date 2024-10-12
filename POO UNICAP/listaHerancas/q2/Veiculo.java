
public class Veiculo {
    private String modelo;
    private double kilometragem;

    public Veiculo(String modelo, double kilometragem) {
        this.modelo = modelo;
        this.kilometragem = kilometragem;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double calcularCustoServico() {
        return 0;

    }

}
