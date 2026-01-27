import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        // Please write your code here.
        Integer[] a1 = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] b1 = Arrays.stream(b).boxed().toArray(Integer[]::new);

        Arrays.sort(a1);
        Arrays.sort(b1);
        int cnt =0;
        for(int i =0; i<n; i++){
            if(a1[i]==b1[i]) cnt++;
        }
        if(cnt == n) System.out.println("Yes");
        else System.out.println("No");

    }
}