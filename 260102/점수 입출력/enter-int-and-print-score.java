public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=1 && age<=1000){
            System.out.printf("Your score is %d point", age);
        }
    }
}