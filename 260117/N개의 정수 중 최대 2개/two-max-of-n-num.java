import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            for(int j = 1; j<n; j++){
                if(arr[j-1] <= arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
            System.out.print(arr[0] +" " + arr[1]);
    }
}