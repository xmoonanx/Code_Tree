import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%2!=0) {
            a+=3;
            if(a%3==0) System.out.println(a/3);
            else System.out.println(a);
        }
        else System.out.println(a/3);
    }
}