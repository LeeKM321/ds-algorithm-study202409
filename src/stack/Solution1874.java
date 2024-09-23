package stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution1874 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 입력받을 수열의 개수
        int[] seq = new int[N];

        for (int i = 0; i < N; i++) {
            seq[i] = sc.nextInt(); // 입력 받아서 배열 채우기
        }

        Stack<Integer> stack = new Stack<>(); // 스택 초기화
        int current = 1; // 스택에 넣을 값
        StringBuilder sb = new StringBuilder();

        boolean flag = true; // 수열을 표현할 수 있는가?

        for (int i = 0; i < N; i++) {
            int num = seq[i]; // 현재 수열의 값

            // 주어진 수열 값까지 스택에 값을 push
            while (current <= num) {
                stack.push(current);
                sb.append("+\n");
                current++;
            }

            // 스택에 마지막으로 넣은 값이 수열 값과 같으면 pop
            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                flag = false;
                break;
            }

        }

        // 결과 출력
        if (flag) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }


        sc.close();


    }
}

















