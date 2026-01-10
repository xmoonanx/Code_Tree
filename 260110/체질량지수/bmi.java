import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int d = (10000*w) / (h*h);

        if(d>=25){
            System.out.printf("%d\n", d);
            System.out.print("Obesity");
        }
        else{
            System.out.printf("%d\n", d);
        }
    }
}