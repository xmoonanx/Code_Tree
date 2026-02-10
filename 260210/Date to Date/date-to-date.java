import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        // Please write your code here.
        int cnt =0;
        int[] days = new int[]{0, 31, 28, 31, 30, 31,30,31,31,30,31,30,31};
        while(true){
            if(m1 == m2 && d1 == d2+1) break;

            cnt++;
            d1++;

            if(d1 > days[m1]){
                m1++;
                d1 = 1;
            }
        }

        System.out.println(cnt);
    }
}