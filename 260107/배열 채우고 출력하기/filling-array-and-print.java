import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i =0; i<10; i++){
            arr[i] = sc.next();
        }
        for(int j = arr.length-1; j>=0; j--){
            System.out.print(arr[j]);
        }
    }
}