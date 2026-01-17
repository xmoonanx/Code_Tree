import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<q; i++){
            int qus = sc.nextInt();
            int num = 0;
            int cnt = 0;
            if(qus == 1) {
                num = sc.nextInt();
                System.out.println(arr[num-1]);
            }

            else if(qus == 2){
                num = sc.nextInt();
                for(int j =0 ;j<n; j++){
                    if(arr[j] == num){
                        cnt = j+1;
                        break;
                    }
                    else cnt = 0;
                }
                System.out.println(cnt);
            }

            else if(qus ==3){
                int st = sc.nextInt();
                int ed = sc.nextInt();
                for(int j = st; j<=ed; j++){
                    System.out.print(arr[j-1] + " ");
                }
                System.out.println();
            }
        }
    }
}