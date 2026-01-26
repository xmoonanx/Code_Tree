import java.util.Scanner;
public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            cal(a1, a2);
        }
    }

    public static void cal(int a1, int a2){
        int res = 0;
        for(int i=a1-1; i<a2; i++){
            res += arr[i];
        }
        System.out.println(res);
    }
}