import java.util.Scanner;

public class main
 {
    public static void main(String[] args) {
         int max = Integer.MIN_VALUE;
         try (Scanner scanner = new Scanner(System.in)) {
           int n = scanner.nextInt();
           int[] arr = new int[n];

           for(int i = 0; i < n; i++){
                arr[i]= scanner.nextInt(); 
           }
              // main Logic
                for(int i = 0; i < arr.length; i++){
                        if(arr[i] > max){
                            max = arr[i];
                        }
                    }
        }

        System.out.println("Max: " + max);
    }

}       
