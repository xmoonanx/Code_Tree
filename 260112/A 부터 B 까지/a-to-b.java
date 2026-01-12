import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.print(a+ " ");
        for(int  i = a; i<=b;){
            if(i%2!=0) {
                System.out.print(i + " ");
                i *= 2;
            }
            else if(i%2==0){
                System.out.print(i + " ");
                i += 3;
            }
            
        }
    }
}