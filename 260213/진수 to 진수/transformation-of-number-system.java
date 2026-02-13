import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String N = br.readLine();
        // Please write your code here.

        int tenNum = toTen(A, N);
        tenTo(B, tenNum);
    }

    public static int toTen(int A, String n){
        int res = 0;
        for(int i = 0; i<n.length(); i++){
            res = res * A + (n.charAt(i) - '0');
        }
        return res;
    }

    public static void tenTo(int B, int tenNum){
        int[] arr = new int[10];
        int cnt = 0;
        while(true){
            if(tenNum<B){
                arr[cnt++] = tenNum;
                break;
            }

            arr[cnt++] = tenNum%B;
            tenNum/=B;
        }
        for(int i = cnt-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}