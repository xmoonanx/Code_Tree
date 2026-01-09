import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int total=0;
        int[][] arr = new int[4][4];
        for(int i =0; i<4; i++){
            for(int j=0; j<4; j++){
                int n = sc.nextInt();
                arr[i][j] = n;
            }
        }
        for(int i =0; i<4; i++){
            for(int j=0; j<=i; j++){
                total += arr[i][j];
            }
        }


        System.out.print(total);
    }
}