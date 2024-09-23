package stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //352+*9-

        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            // 만약 c가 숫자로 이루어져 있다면
            if (Character.isDigit(c)) {
                // 스택에 넣자
                stack.push(c - '0');
            } else { // 숫자가 아니라면 (연산 기호)
                int b = stack.pop(); // 두 번째 피연산자
                int a = stack.pop(); // 첫 번째 피연산자

                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        // 최종 결과 출력.
        System.out.println(stack.pop());

        sc.close();
    }
}
















