import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        // Please write your code here.

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray(); 
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortArr1 = new String(arr1);
        String sortArr2 = new String(arr2);

 
        if(sortArr1.equals(sortArr2)) System.out.println("Yes");
        else System.out.println("No");
    }
}