import java.util.*;
import java.io.*;
public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;
    public static final int[][] checkArr = new int[MAX_R][MAX_R];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        for(int i =0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken())+ OFFSET;
            int y2 = Integer.parseInt(st.nextToken())+ OFFSET;

            for(int x = x1; x<x2; x++){
                for(int y = y1; y<y2; y++){
                    checkArr[x][y] = i+1;
                }
            }
        }
        int res = 0;
        for(int i =0; i<MAX_R; i++){
            for(int j =0; j<MAX_R; j++){
                if(checkArr[i][j]==1 || checkArr[i][j]==2) res++;
            }
            
        }
        System.out.print(res);
    }
}