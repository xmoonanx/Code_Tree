import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean res = false;

        if(N%2 != 0 && N%3==0){
            res = true;    
        }
        else if(N%2 ==0 && N%5==0){
            res = true;
        }
        else res = false;

        System.out.println(res);
    }
}