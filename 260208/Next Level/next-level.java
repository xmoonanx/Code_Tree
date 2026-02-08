import java.util.*;
import java.io.*;

class Hero{
    String id;
    int level;

    public Hero(){
        this.id = "codetree";
        this.level = 10;
    }
    public Hero(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String id = st.nextToken();
        int level = Integer.parseInt(st.nextToken());
        // Please write your code here.
        Hero hero1 = new Hero();
        System.out.printf("user %s lv %d\n", hero1.id, hero1.level);
        hero1.id = id;
        hero1.level = level;
        System.out.printf("user %s lv %d\n", hero1.id, hero1.level);
    }
}