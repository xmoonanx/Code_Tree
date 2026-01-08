import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0; int b =0;
        for(int i = 0; i<N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            int res = 0;
            for(int j = a; j<=b; j++){
                if(j%2==0) res += j;
            }
            System.out.println(res);
        }

    }
}