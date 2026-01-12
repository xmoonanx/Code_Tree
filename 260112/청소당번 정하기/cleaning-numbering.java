import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cls = 0;
        int road = 0;
        int bath = 0;

        for(int i =0; i<n; i++){
            if(i==0) continue;

            if(i%12==0) bath++;
            else if(i%3==0) road++;
            else if(i%2==0) cls++;
        }
        System.out.print(cls + " " + road + " " + bath);
    }
}