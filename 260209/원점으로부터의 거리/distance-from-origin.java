import java.util.*;
import java.io.*;

class Point implements Comparable<Point>{
    int x, y, distance, num;

    public Point(int x ,int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
        this.distance = calcDistance(x,y);
    }

    public int calcDistance(int x, int y) {
        return Math.abs(x-0) + Math.abs(y-0);
    }

    @Override
    public int compareTo(Point points){
        return this.distance - points.distance;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(x,y,i+1);
        }

        Arrays.sort(points);
        // Please write your code here.

        for(int i =0; i<n; i++){
            System.out.println(points[i].num);
        }
    }
}