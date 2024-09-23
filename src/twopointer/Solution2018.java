package twopointer;

import java.util.Scanner;

public class Solution2018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int start = 0, end = 0, count = 0, sum = 1;

        while (end < N) {
            if (sum == N) {
                count++;
                end++;
                if (end < N) sum += arr[end];
            } else if (sum > N) {
                sum -= arr[start];
                start++;
            } else {
                end++;
                sum += arr[end];
            }
        }

        System.out.println(count);

        sc.close();
    }

}
















