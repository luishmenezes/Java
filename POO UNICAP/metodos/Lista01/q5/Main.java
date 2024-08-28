package Lista01.q5;

public class Main {
    
    public static void main(String[] args){
        Reserva r1 = new Reserva("Luis","suite",5);
        Reserva r2 = new Reserva("luan","individual",9);
        Reserva r3 = new Reserva("marcos","premium",8);
        
        
        System.out.println(r1.hospede+r1.tipoDeQuarto+r1.nNoites);
        System.out.println(r2.hospede+r2.tipoDeQuarto+r2.nNoites);
        System.out.println(r3.hospede+r3.tipoDeQuarto+r3.nNoites);
        
            }}
    
