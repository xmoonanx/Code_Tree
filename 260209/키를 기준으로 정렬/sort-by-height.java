import java.util.*;
import java.io.*;

class People{
    String name;
    int h, w;

    public People(String name, int h, int w){
        this.name = name;
        this.h = h;
        this.w = w;
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        // Please write your code here.
        People[] person = new People[n];
        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            person[i] = new People(name, h, w);
        }
        Arrays.sort(person, new Comparator<People>(){
            @Override
            public int compare(People a, People b){
                return a.h - b.h;
            }
        });

        for(int i =0; i<n; i++){
            System.out.println(person[i].name + " " + person[i].h + " " + person[i].w);
        }
    }
}