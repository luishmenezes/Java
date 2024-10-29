package aula1;

import java.util.ArrayList;

public class Main {

    public static void exibirAreasDeFormas(ArrayList<FormaGeometrica> formas) {
        for (int i = 0; i < formas.size(); i++) {
            System.out.println(formas.get(i).calcularArea());
            System.out.println(formas.get(i).calcularPerimetro());
        }
    }

    public static void main(String[] args) {
        FormaGeometrica c1 = new Circulo(5);
        FormaGeometrica q1 = new Quadrado(7);

        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        formas.add(q1);
        formas.add(c1);

        exibirAreasDeFormas(formas);

    }
}
