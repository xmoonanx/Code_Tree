import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char res = 'C';
        for(int i =2; i<n; i++){
            if(n%i==0) break;
            else res = 'P';
        }
        System.out.print(res);
    }
}