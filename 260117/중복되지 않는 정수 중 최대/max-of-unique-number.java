import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max) max = arr[i];
        }
        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == max) cnt++;
        }

        if(cnt > 1) System.out.print(-1);
        else System.out.print(max); 

    }
}