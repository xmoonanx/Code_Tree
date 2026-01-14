import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<4; j++){
                arr[i] += sc.nextInt(); 
            }
            if(arr[i]/4 >=60) {
                System.out.println("pass");
                cnt++;
            }
            else System.out.println("fail");
        }
        System.out.println(cnt);
    }
}