package Lista01.q8;

public class Main {
    
    public static void main(String[] args){
        Evento e1 = new Evento("desmantelo","04/09/2025", "Recife");
        Evento e2 = new Evento("carva","04/10/2023", "Recife");
        Evento e3 = new Evento("delux","03/11/2024", "Recife");	
    
        System.out.println(e1.nome+e1.data+e1.local);
        System.out.println(e2.nome+e2.data+e2.local);
        System.out.println(e3.nome+e3.data+e3.local);
    }
    }
    
