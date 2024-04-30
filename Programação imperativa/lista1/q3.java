import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Question03 {

	

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		
        int nAlunos = s.nextInt();
        s.nextLine(); 

        List<String> nomesAlunos = new ArrayList<>();
        List<List<String>> presencas = new ArrayList<>();

        for (int i = 0; i < nAlunos; i++) {
            String nome = s.nextLine();
            nomesAlunos.add(nome);

            List<String> presencaAluno = new ArrayList<>();
            for (int j = 0; j < 30; j++) {
                presencaAluno.add(s.nextLine());
            }
            presencas.add(presencaAluno);
        }

        for (int i = 0; i < nAlunos; i++) {
            int faltas = 0;
            StringBuilder diasFalta = new StringBuilder();

            for (int dia = 0; dia < presencas.get(i).size(); dia++) {
                String presenca = presencas.get(i).get(dia);
                if (presenca.equals("F")) {
                    faltas++;
                    diasFalta.append((dia + 1) + " ");
                }
            }

            if (faltas > 10) {
                System.out.print(nomesAlunos.get(i) + " - dias: ");
                System.out.println(diasFalta.toString());
            }
        }
    }
}
