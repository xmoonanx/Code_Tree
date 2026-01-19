import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        int max = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++){
            for(int j = i+1 ; j<n; j++){
                int profit = arr[j] - arr[i];

                if(profit > max) max = profit;
            }
        }

        System.out.println(max);
    }
}