import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // Please write your code here.
        f(n);
        
    }
    public static void f(int n){
        if(n==0) return;

        for(int i = n; i>0; i--){
            System.out.print("* ");
        }
        System.out.println();
        f(n-1);
        for(int i = n; i>0; i--){
            System.out.print("* ");
        }
        System.out.println();
    }
}