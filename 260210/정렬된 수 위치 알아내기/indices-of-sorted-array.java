import java.util.*;
import java.io.*;

class Number implements Comparable<Number>{
    int num;     
    int index;   

    public Number(int num, int index){
        this.num = num;
        this.index = index;
    }

    @Override
    public int compareTo(Number number){
        return this.num - number.num;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        Number[] number = new Number[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            // 원래 순서(i)를 함께 저장해줍니다.
            number[i] = new Number(num, i);
        }

        Arrays.sort(number);


        int[] answer = new int[n];
        
        // 2. 순위 매기기
        // 정렬된 배열을 순회하며 순위(Rank)를 부여합니다.
        for(int i = 0; i < n; i++){
            Number current = number[i];
            
            // 현재 원소의 '원래 위치(index)'에 '정렬된 위치(i+1)'를 저장
            // 문제에서 위치는 1부터 시작한다고 하였으므로 i + 1
            answer[current.index] = i + 1;
        }

        // 3. 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(answer[i]);
            if(i < n - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}