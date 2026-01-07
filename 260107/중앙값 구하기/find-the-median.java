import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int res = 0;
        if(A>B){
            if(B>C) res = B;
            else{
                if (A>C) res = C;
                else res = A;
            }            
        }
        else{ //a<b
            if(B<C) res = B;
            else{ // B>C
                if (A>C) res = A;
                else res = C;
            }
        }
        System.out.println(res);
    }
}