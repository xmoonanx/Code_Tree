import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        for(int i=0; i<4; i++){
            int tmp = sc.nextInt();
            if(a>tmp) System.out.println(1);
            else System.out.println(0);
        }
    }
}