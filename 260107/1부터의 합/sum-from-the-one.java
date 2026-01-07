import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        int i = 0;
        for(i = 1; i<=100; i++){
            res += i;
            if(res >= N) break;
        }
        System.out.print(i);
    }
}