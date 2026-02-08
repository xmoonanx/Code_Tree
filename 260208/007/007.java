import java.util.*;
import java.io.*;

class Code{
    String sCode;
    char mPoint;
    int time;

    public Code(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.
        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();
        Code code1 = new Code(sCode, mPoint, time);

        System.out.println("secret code : " + code1.sCode);
        System.out.println("meeting point : " + code1.mPoint);
        System.out.println("time : " + code1.time);
    }
}