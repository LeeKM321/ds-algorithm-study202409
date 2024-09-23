package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution2 {

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

        // 두 배열 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // 결과를 저장할 리스트 선언
        List<Integer> result = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < N && p2 < M) {
            if (arr1[p1] == arr2[p2]) {
                result.add(arr1[p1]);
                p1++; p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        for (int i : result) {
            System.out.print(i);
        }

        br.close();

    }
}

















