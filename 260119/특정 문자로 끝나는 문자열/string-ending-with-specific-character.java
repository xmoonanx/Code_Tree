import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = new String[10];

        for(int i =0; i<10; i++){
            st[i] = br.readLine();
        }
        String ch = br.readLine();
        int cnt = 0;
        for(int i =0; i<10; i++){

            if(st[i].charAt(st[i].length()-1) == ch.charAt(0)) {
                System.out.println(st[i]);
                cnt = 1;
            }
            
        }

        if(cnt ==0) System.out.println("None");
    }
}