import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i =a; i<=b; i++){
            if(threefunc(i)) cnt++;
        }
        System.out.println(cnt);

    }   
    public static boolean threefunc(int n){
        if(n%3==0) return true;
        else{
            String s = Integer.toString(n);
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '3'||s.charAt(i) == '6'||s.charAt(i) == '9'){
                    return true;
                }
            }
        }
        return false;
    }
}