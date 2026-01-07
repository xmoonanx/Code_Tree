import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        int cnt =0;
        String[] fruit = {"apple","banana","grape","blueberry","orange"};

        for(int i =0; i<5; i++){
            String t1 = String.valueOf(fruit[i].charAt(2));
            String t2 = String.valueOf(fruit[i].charAt(3));
            if(t1.equals(t) || t2.equals(t)) {
                System.out.println(fruit[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}