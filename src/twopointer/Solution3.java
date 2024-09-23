package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] sales = new int[N];
        for (int i = 0; i < N; i++) {
            sales[i] = Integer.parseInt(st.nextToken());
        }

        // 첫 번째 K일의 매출 합 계산.
        int maxSum = 0;
        for (int i = 0; i < K; i++) {
            maxSum += sales[i];
        }

        // 슬라이딩 윈도우로 최대 매출 계산
        // 12 15 11 20 25 10 20 19 13 15
        // 12 15 11  -> 15 11 20 -> 11 20 25
        int currentSum = maxSum;
        for (int i = K; i < N; i++) {
            currentSum += sales[i] - sales[i - K]; // 새로운 값 더하고 이전값 빼기
            maxSum = Math.max(maxSum, currentSum); // 최대값 비교 갱신
        }

        System.out.println(maxSum);

        br.close();
    }
}

















