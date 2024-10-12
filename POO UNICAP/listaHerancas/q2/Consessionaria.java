
import java.util.ArrayList;

public class Consessionaria {
    private String nome;
    private String local;
    private ArrayList<Veiculo> veiculos;

    public Consessionaria(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.getModelo());
            System.out.println(veiculo.calcularCustoServico());
        }
    }

}
