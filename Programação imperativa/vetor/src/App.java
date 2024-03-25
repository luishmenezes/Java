public class App {
    public static void main(String[] args) throws Exception {
        
        int[] arr = {1 , 0, 5, -2, -5, 7};

        int soma = arr[0] + arr[1] + arr[5];

        System.out.println(soma);

        arr[4] = 100;

       for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
       }
        

    }
}
