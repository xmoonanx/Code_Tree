import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // Please write your code here.

        int sum = 0;
        for(int i =a; i<=b; i++){
            if(check(i)) sum += i;
        }
        System.out.print(sum);
    }

    public static boolean check(int n){
        for(int i =2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}