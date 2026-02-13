import java.util.*;
import java.io.*;
public class Main {
    public static int[] tile = new int[200001]; 
    public static int[] visited = new int[200001];
    public static int idx = 100000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            coloringTile(x, d);
        }
        
        int bColor=0, wColor=0, gColor=0;
        for(int i = 0; i<tile.length; i++){
                if(visited[i] >= 4){
                    gColor++;
                }else{
                    if(tile[i] == 1){ //tile == 1 - black
                        bColor++;
                    }else if(tile[i] == 2){ // tile == 2 - white
                        wColor++;
                    }
                }
            }
            System.out.print(wColor + " " + bColor + " " + gColor);
    }
    public static void coloringTile(int x, char d){
        if(d == 'R'){
            for(int i = idx; i<idx+x; i++){
                visited[i]++;
                tile[i] = 1;
            }
            idx += x-1;
        }

        else { // d=='L'
            for(int i = idx-x+1; i<=idx; i++){
                visited[i]++;
                tile[i] =2;
            }
            idx -= x-1;
        }
    }
}