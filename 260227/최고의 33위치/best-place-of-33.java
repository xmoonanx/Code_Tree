import java.util.Scanner;
public class Main {
    public static int n;
    public static int[][] grid = new int[20][20];

    public static int checkGold(int row, int col){
        int maxRow = row + 2;
        int maxCol = col + 2;

        int golds = 0;
        for(int i = row; i<=maxRow; i++){
            for(int j = col; j<=maxCol; j++){
                golds += grid[i][j];
            }
        }
        return golds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int maxGold = 0;
        for(int row =0; row< n; row++){
            for(int col=0; col<n; col++){
                if(row+2 >=n || col +2 >=n)
                    continue;

                int numGold = checkGold(row, col);

                maxGold = Math.max(maxGold, numGold);
            }
        }
        System.out.print(maxGold);
    }
}