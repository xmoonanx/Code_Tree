import java.util.*;
import java.io.*;
public class Main {
    public static int[] tile = new int[200001]; 
    public static int[] blackCount = new int[200001];
    public static int[] whiteCount = new int[200001];
    public static int idx = 100001;
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
                if(blackCount[i] >= 2 && whiteCount[i] >= 2){
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
                blackCount[i]++;
                tile[i] = 1;
            }
            if(x>1)
                idx += x-1;
        }

        else { // d=='L'
            for(int i = idx; i>idx-x; i--){
                whiteCount[i]++;
                tile[i] =2;
            }
            if(x>1)
                idx -= x-1;
        }
    }
}