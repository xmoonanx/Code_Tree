import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        char o = st.nextToken().charAt(0);
        int c = Integer.parseInt(st.nextToken());
        // Please write your code here.

        if(o == '+') {
            System.out.printf("%d %c %d = %d",a,o,c,add(a,c));
        }
        else if(o == '-'){  
            System.out.printf("%d %c %d = %d",a,o,c,minus(a,c));
        } 
        else if(o == '/')
            System.out.printf("%d %c %d = %d",a,o,c,mod(a,c));
        else if(o == '*') 
            System.out.printf("%d %c %d = %d",a,o,c,multi(a,c));
        else System.out.print("False");

    }
    public static int add(int a, int c){
        int res = a +c;
        return res;
    }
    public static int minus(int a, int c){
        int res = a - c;
        return res;
    }
    public static int mod(int a, int c){
        int res = a / c;
        return res;
    }
    public static int multi(int a, int c){
        int res = a * c;
        return res;
    }
}