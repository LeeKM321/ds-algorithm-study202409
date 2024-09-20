package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution11659 {

    public static void main(String[] args) throws IOException {

        /*
        입력부터 제대로 처리하기
        for (숫자 개수만큼 반복) {
            구간합 배열 생성하기 (S[i] = S[i-1] + A[i])
        }
        for (범위 개수만큼 반복) {
            범위 입력받은 값 가져와서
            구간 합 출력하기. (S[y] - S[x-1], x가 0일 경우 S[0])
        }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[N + 1];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 1; i < N + 1; i++) {
            S[i] = S[i-1] + Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st3.nextToken());
            int y = Integer.parseInt(st3.nextToken());
            sb.append((S[y] - S[x-1]) + "\n");
        }

        System.out.println(sb);

        br.close();

    }
}

















