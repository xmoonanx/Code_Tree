import java.util.Scanner;
public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(maxV(n-1));
    }
    public static int maxV(int a){
        if(a==0) return arr[0];

        return Math.max(maxV(a-1), arr[a]);
    }

}