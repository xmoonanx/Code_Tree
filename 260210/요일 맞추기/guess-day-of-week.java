import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        // Please write your code here.
        
        String[] daysOfday = new String[]{"Sun" , "Mon", "Tue","Wed", "Thu", "Fri", "Sat"};

        int firstChange = totalDays(m1, d1);
        int lastChange = totalDays(m2, d2);

        int diff = lastChange - firstChange +1 ;

        while(diff<0){
            diff += 7;
        }
        System.out.println(daysOfday[diff%7]);

    }

    public static int totalDays(int m, int d){
        int days = 0;

        int[] daysOfMonth = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i =1; i<m; i++){
            days += daysOfMonth[i];
        }
        days += d;
        return days;
    }
}