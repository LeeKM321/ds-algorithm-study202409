package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] grid = new int[N][N];

        // 입력값 처리
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxSum = Integer.MIN_VALUE;
        // 각 행, 각 열의 합을 계산
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += grid[i][j]; // i번째 행의 값
                colSum += grid[j][i]; // i번째 열의 값
            }
            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);
        }

        // 두 대각선의 합을 계산
        int diag1Sum = 0;
        int diag2Sum = 0;

        // 00 11 22 33 44
        // 04 13 22 31 40
        for (int i = 0; i < N; i++) {
            diag1Sum += grid[i][i];
            diag2Sum += grid[i][N-1-i];
        }

        maxSum = Math.max(maxSum, diag1Sum);
        maxSum = Math.max(maxSum, diag2Sum);

        System.out.println(maxSum);

        br.close();
    }
}














