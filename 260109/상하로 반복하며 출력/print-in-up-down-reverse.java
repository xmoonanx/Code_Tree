import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for(int i =0; i<N; i++){
            int cnt =1;
            if(i%2 !=0){
                for(int j = N-1; j>=0; j--){
                    arr[j][i] = cnt;
                    cnt++;
                }
            }
            else{
                for(int j =0; j<N; j++){
                    arr[j][i] = cnt;
                    cnt++;
                }
            }
        }
        for(int i = 0; i<N;i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}