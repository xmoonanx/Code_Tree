import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        int[][] res = new int[N][M];
        for(int i =0; i<N; i++){
            for(int j= 0; j<M; j++){
                int n = sc.nextInt();
                arr1[i][j] = n;
            }
        }
        for(int i =0; i<N; i++){
            for(int j= 0; j<M; j++){
                int n = sc.nextInt();
                arr2[i][j] = n;
                if(arr1[i][j]!=arr2[i][j]) res[i][j]=1;
            }
        }
        for(int i =0; i<N; i++){
            for(int j= 0; j<M; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}