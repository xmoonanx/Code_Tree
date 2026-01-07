import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int bln = text.indexOf(" ");

        String a = text.substring(0, bln);
        String b = text.substring(bln+1);

        if(a.length() > b.length()) System.out.print(a + " " + a.length());
        else if (a.length() < b.length()) System.out.print(b + " " + b.length());
        else System.out.print("same");
    }
}