import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] arr = new int[201];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken()) + 100;
            x2[i] = Integer.parseInt(st.nextToken()) + 100;
            for(int j = x1[i]; j<x2[i]; j++){
                arr[j] +=1;
            }
        }
        // Please write your code here.
        int max = 0;
        for(int i = 0; i<201; i++){
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(max);
    }
}