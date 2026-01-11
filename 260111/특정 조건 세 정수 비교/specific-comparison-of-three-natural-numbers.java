import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 0;

        if(a<=b && a<=c) min =a;

        if(a == min) System.out.printf(1 + " ");
        else System.out.printf(0 + " ");

        if(a==b && a==c) System.out.printf(1 + " ");
        else System.out.printf(0 + " ");
    }
}