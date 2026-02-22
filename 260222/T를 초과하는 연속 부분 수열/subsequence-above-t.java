import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int max=0, cnt=0;

        for(int i =0; i<n; i++){
            if(i >=1 && arr[i] > 3 && arr[i-1] >3) cnt++;
            else cnt = 1;

            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}