import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[2 * n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        // Please write your code here.
        Arrays.sort(nums);
        int max = 0;
        for(int i =0; i<2*n; i++){

            if(max < nums[i] + nums[2*n-1-i]) max = nums[i] + nums[2*n-1-i];
        }
        System.out.print(max);
    }
}