import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        // Please write your code here.

        boolean day = checkLast(y,m,d);
        if(day){
                if(3<=m&&m<=5){
                    System.out.print("Spring");
                }else if(6<=m&&m<=8){
                    System.out.print("Summer");
                }else if(9<=m&&m<=11){
                    System.out.print("Fall");
                }else if(2<=m&&m<=12) {
                    System.out.print("Winter");
                }
            }else {
                System.out.print(-1);
            }
    }

    public static boolean checkLast(int y, int m, int d){
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            return d<=31;
        }
        else if(m==2){
            if(y%4==0){
                if(y%100==0){
                    if(y%400==0){
                        return d<=29;
                    }
                    return d<=28;
                }
                return d<=29;
            }
            return d<=28;
        }
        else return d<=30;
    }

}