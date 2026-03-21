import java.util.*;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100;

    public static final int[] x  = new int[MAX_N];
    public static final int[] y  = new int[MAX_N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        for(int i =0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = MAX_N;
        for(int i =1; i<n-1; i++){
            int dist = 0;
            int pre = 0;
            for(int j = 1; j<n; j++){
                if(i==j) continue;
                dist += Math.abs(x[pre] - x[j]) + Math.abs(y[pre] - y[j]);
                pre = j;
            }
            ans = Math.min(ans, dist);
        }
        System.out.println(ans);
    }
}