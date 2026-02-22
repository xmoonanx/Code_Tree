import java.util.*;
import java.io.*;
public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_R = 200;
    public static final int[][] checkArr = new int[MAX_R][MAX_R];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken()) + OFFSET;
            y1[i] = Integer.parseInt(st.nextToken())+ OFFSET;
            x2[i] = Integer.parseInt(st.nextToken())+ OFFSET;
            y2[i] = Integer.parseInt(st.nextToken())+ OFFSET;
        }
        // Please write your code here.
        int res = 0;
        for(int i =0; i<n; i++){
            for(int j =x1[i]; j<x2[i]; j++){
                for(int k = y1[i]; k<y2[i]; k++){
                    checkArr[j][k]++;
                }
            }
        }

        for(int i =0; i<MAX_R; i++){
            for(int j =0 ;j<MAX_R; j++){
                if(checkArr[i][j]>0) res++;
            }
        }
        System.out.println(res);
    }
}