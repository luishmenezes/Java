package q3;

import java.util.ArrayList;

public class ListaFuncionarios {
    private String nomeLista;
    private String empresa;
    private ArrayList<Funcionario> funcionarios;

    public ListaFuncionarios(String nomeLista, String empresa) {
        this.nomeLista = nomeLista;
        this.empresa = empresa;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
            funcionario.apresentar();
        }
    }
}
