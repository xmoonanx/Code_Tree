import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arrA = new int[n1];
        int[] arrB = new int[n2];

        for(int i =0; i<n1; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i =0; i<n2; i++){
            arrB[i] = sc.nextInt();
        }
        String res = "";
        for(int i =1; i<n2; i++){
            for(int j =1; j<n1; j++){
                if((arrA[j-1] == arrB[i-1])&&(arrA[j] == arrB[i])){
                    res = "Yes";
                    break;
                }
                else {res="No";}
            }
        }
        System.out.println(res);
    }
}