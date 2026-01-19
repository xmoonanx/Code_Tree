import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder res = new StringBuilder();
        char ch = s.charAt(0);
        int cnt =0;
        for(int i =0; i<s.length(); i++){
            if(ch == s.charAt(i)) cnt++;
            else{
                res.append(ch);
                res.append(cnt);
                ch = s.charAt(i);
                cnt = 1;
            }
            
        }
                res.append(ch);
                res.append(cnt);
        System.out.println(res.length());
        System.out.println(res);
    }
}