import java.util.*;
import java.io.*;

class Sir{
    String name;
    int score;

    public Sir(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Please write your code here.
        Sir[] sirs = new Sir[5];
        int min = 100;
        int cnt =0;
        for(int i =0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            sirs[i] = new Sir(name, score);
            if(score<min) {cnt = i; min = score;}
        }

        System.out.print(sirs[cnt].name +" "+ sirs[cnt].score);

    }
}