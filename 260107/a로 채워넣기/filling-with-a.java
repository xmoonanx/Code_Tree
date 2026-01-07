import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        text = text.charAt(0)+"a"+text.substring(2, text.length()-2)+"a"+text.charAt(text.length()-1);
        System.out.print(text);
    }
}