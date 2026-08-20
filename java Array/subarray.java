import java.util.Scanner;
public class subarray {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt(); 
        }

        // main Logic
        
        for(int i = n-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }

        int si = 0;
        int ei = 0;

        for(si = 0; si < n; si++){
            for (ei = si; ei < n; ei++){
                System.out.println("Subarray from index " + si + " to " + ei + ":");
                for(int k = si; k <= ei; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
