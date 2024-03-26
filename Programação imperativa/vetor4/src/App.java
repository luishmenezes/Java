import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] elementos = new int[10];
        int[] elementos2 = new int[10];
        Scanner ler = new Scanner(System.in);
        

        for(int i = 0; i < elementos.length; i++){
            elementos[i] = ler.nextInt();
        }

        for (int i = 0; i < elementos2.length;i++){
            if(i % 2 == 0){
                elementos2[i] = elementos[i]/2;
            } else{
                elementos2[i] = elementos[i]*3;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println(elementos[i] + " " + elementos2[i]);
        }
    }


}
