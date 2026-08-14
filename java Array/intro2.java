import java.util.Scanner;
public class intro2 {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           int n = scanner.nextInt();
           int[] arr = new int[n];

           for(int i = 0; i < n; i++){
                arr[i]= scanner.nextInt(); 
           }
           // main Logic

           int sum = 0;
             for(int i = 0; i < arr.length; i++){
                    sum += arr[i];
             }
           
           System.out.println("Sum: " + sum);
       }
    }

}
