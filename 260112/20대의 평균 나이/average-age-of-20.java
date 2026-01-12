import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int i =0;
        double sum = 0;
        while(true){
            int n = sc.nextInt();
            if(n<30){
                sum += n;
                i++;
            } 
            else {
                break;
            }
        }
        System.out.printf("%.2f", sum/i);
    }
}