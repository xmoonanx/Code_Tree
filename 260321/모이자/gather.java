import java.util.*;
import java.io.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        // Please write your code here.
        int res = INT_MAX;
        for(int i =0; i<n; i++){
            int sumDist = 0;
            for(int j =0; j<n; j++){
                sumDist += Math.abs(j-i) * a[j]; // 절댓값
            }
            res = Math.min(res, sumDist);
        }
        System.out.println(res);
    }
}