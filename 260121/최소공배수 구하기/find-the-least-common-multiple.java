import java.util.*;
import java.io.*;

public class Main {
    public static void min(int n, int m){
        int num = m;

        while(num % n != 0 || num % m != 0){
            num +=1;
        }

        System.out.print(num);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // Please write your code here.

        min(n,m);
    }
}