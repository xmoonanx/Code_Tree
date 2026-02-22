import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] student = new int[100];
        int res = -1;
        for(int i =0; i<m; i++){
            int cnt = penalizedPerson[i];
            student[cnt]++;

            if(student[cnt] >=k) {
                res =cnt; 
                break;
            } 
        }
        System.out.print(res);
    }
}