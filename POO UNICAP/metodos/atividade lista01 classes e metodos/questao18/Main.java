package br.unicap.poo.atividade.questao18;

public class Main {
    public static void main(String[] args) {
        AtividadeFisica a1 = new AtividadeFisica("Cardio" , 20, 30);
        AtividadeFisica a2 = new AtividadeFisica("Bike", 30, 40);

        a1.registrarAtividade(60);
        a1.alterarTipoDeAtividade("Malhação");
        a1.exibirAtividade();
        a1.compararCalorias(a2);
    }
   
}
