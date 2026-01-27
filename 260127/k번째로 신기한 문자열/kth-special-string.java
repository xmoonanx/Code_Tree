import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        // 1. [핵심] 조건에 맞는 단어의 개수를 먼저 셉니다.
        int count = 0;
        for (int i = 0; i < n; i++) {
            // 길이가 t보다 짧으면 검사할 필요 없음
            if (words[i].length() >= t.length() && words[i].startsWith(t)) {
                count++;
            }
        }

        // 2. [핵심] 딱 맞는 크기의 배열을 생성합니다. (null 공간이 사라집니다)
        String[] filtered = new String[count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (words[i].length() >= t.length() && words[i].startsWith(t)) {
                filtered[index++] = words[i]; // 순서대로 채워넣기
            }
        }

        // 3. 배열 정렬 (null이 없으므로 에러 없음)
        Arrays.sort(filtered);

        // 4. K번째 단어 출력 (인덱스는 k-1)
        // count가 k보다 작은지 확인하는 것은 안전장치
        if (filtered.length >= k) {
            System.out.println(filtered[k - 1]);
        }
    }
}