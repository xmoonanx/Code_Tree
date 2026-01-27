import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        // Please write your code here.
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedS = new String(chars);
        System.out.print(sortedS);
    }
}