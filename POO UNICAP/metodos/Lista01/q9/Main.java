package Lista01.q9;

public class Main {
	public static void main(String[] args){
	Paciente p1 = new Paciente("luis",24,"Nada consta");
	Paciente p2 = new Paciente("marcos",21,"alzheimer");
	Paciente p3 = new Paciente("milena",29,"Nada consta");

	System.out.println(p1.nome+p1.idade+p1.diagnostico);
	System.out.println(p2.nome+p2.idade+p2.diagnostico);
	System.out.println(p3.nome+p3.idade+p3.diagnostico);
	
}

}
