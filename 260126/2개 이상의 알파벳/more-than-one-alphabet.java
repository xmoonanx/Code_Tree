import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String A = br.readLine();

        // Please write your code here.
        cal(A);
    }

    public static void cal(String a){
        int cnt =0;
        for(int i =1; i<a.length(); i++){
            if(a.charAt(i-1) != a.charAt(i)) cnt++;
        }
        if(cnt>0) System.out.print("Yes");
        else System.out.print("No");
    }
}