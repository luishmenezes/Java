package q3;

public class Main {
    public static void main(String[] args) {
        ListaFuncionarios l1 = new ListaFuncionarios("funcionarios", "Auto Parvi");

        Desenvolvedor d1 = new Desenvolvedor("Luis", "818181", 3000, "Java");
        Gerente g1 = new Gerente("Milena", "717182", 5000, "Tecnologia");

        l1.adicionarFuncionario(g1);
        l1.adicionarFuncionario(d1);

        l1.listarFuncionarios();
    }
}
