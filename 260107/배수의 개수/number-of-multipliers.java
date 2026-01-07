import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int f = 0;
        for(int i =0; i<10; i++){
            int tmp = sc.nextInt();
            if(tmp % 3==0 && tmp %5 ==0){
                t++;
                f++;
            }
            else if(tmp % 3==0) t++;
            else if(tmp%5==0) f++;
        }
        System.out.print(t+" "+f);
    }
}