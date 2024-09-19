package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution6 {

    public static void main(String[] args) throws IOException {

       /* Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String str = sc.next();
        String t = sc.next();*/

        // teachermode e
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s = st.nextToken();
        char t = st.nextToken().charAt(0);

        int[] result = new int[s.length()]; // 거리 담아야지
        int p = 100; // 거리 비교를 위해서 선언한 변수 (0으로 초기화하면 안됨. 0은 찾고자 하는 문자와 같다라는 것을 의미)

        // 왼쪽에서 오른쪽으로 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0; // t 문자를 만나면 거리는 0
            } else {
                p++; // t가 아니라면 이전 t와의 거리 +1
            }
            result[i] = p; // 결과 배열에 저장
        }

        // 오른쪽에서 왼쪽으로 거리 계산
        p = 100;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            // 위에서 계산한 결과와 비교해서 더 작은 값으로 할당.
            result[i] = Math.min(result[i], p);
        }

        // 결과 출력
        for (int i : result) {
            System.out.print(i + " ");
        }

        br.close();

    }
}










