import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // Please write your code here.
        int[] bi = new int[9999];
        int cnt =0;
        while(true){
            if(n < 2) {
                bi[cnt++] = n;
                break;
            }

            bi[cnt++] = n%2;
            n /=2; 
        }
        for(int i =cnt-1; i>=0; i--){
            System.out.print(bi[i]);
        }
    }
}