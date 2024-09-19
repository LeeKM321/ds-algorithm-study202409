package string;

import java.util.Scanner;

public class Solution2 {

    public static void solution(String[] arr) {
        for (String s : arr) {
            String newStr = new StringBuilder(s).reverse().toString();
            System.out.println(newStr);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        solution(arr);

    }


}













