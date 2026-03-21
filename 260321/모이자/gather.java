import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.
        int res = INT_MAX;
        for(int i =0; i<n; i++){
            int sumDist = 0;
            for(int j =0; j<n; j++){
                sumDist += Math.abs(j-i) * a[j];
            }
            res = Math.min(res, sumDist);
        }
        System.out.println(res);
    }
}