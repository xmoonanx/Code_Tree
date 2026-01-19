import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        // 3 3 - 0 0 / 0 1 / 1 0 / 0 2 / 1 1 / 2 0 / 0 3 / 3 0 / 2 2 -> n+m - 2
        // 4 2 - 0 0 / 0 1 / 1 0 / 1 1 / 2 1 / 1 2 / 
        int cnt  = 0;
        int num = 0;
        while(num != n*m){
            for(int i =0; i<n; i++){
                for(int j =0 ; j<m; j++){
                    if(i+j == cnt){
                        arr[i][j] = num+1;
                        num++;
                    }
                }
            }    
            cnt++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n; i++){
            for(int j =0 ; j<m; j++){
                sb.append(arr[i][j] + " "); 
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}