import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        int sum = 0;
        for(int i =0 ;i<2; i++){
            for(int j = 0 ; j<4; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        for(int  i =0; i<2; i++){
            int col = 0;    
            for(int j =0; j<4; j++){
                col += arr[i][j];
            }
            System.out.print(col/4.0 + " ");
        }
        System.out.println();
        for(int i = 0; i<4; i++){
            int row = 0;
            for(int j =0; j<2; j++){
                row += arr[j][i];
            }
            System.out.print(row/2.0 + " ");
        }
        System.out.println();
        System.out.print(sum/8.0);

        

    }
}