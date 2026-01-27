import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] wordList = new String[n];
        for (int i = 0; i < n; i++) {
            wordList[i] = br.readLine();
        }
        // Please write your code here.
        Arrays.sort(wordList);
        for (int i = 0; i < n; i++) {
            System.out.println(wordList[i]);
        }
    }
}