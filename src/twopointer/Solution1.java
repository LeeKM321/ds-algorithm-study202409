package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1 {

    public static void solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
//        int[] result = new int[n + m];
        int p1 = 0, p2 = 0;
        // 이 반복문은 작은 배열이 끝나면 종료됨.
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        // 남은 배열 처리 (누가 더 클지는 모릅니다.)
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        System.out.println(answer);
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        solution(N, M, arr1, arr2);

    }
}
















