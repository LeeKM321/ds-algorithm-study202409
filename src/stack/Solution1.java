package stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 괄호 문자열 입력

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c); // 여는 괄호는 스택에 넣자.
            } else {
                // stack이 비었는데 pop을 하면 예외가 발생합니다.
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                // 닫는 괄호일 때는 스택에서 여는 괄호를 꺼냄.
                stack.pop();
            }
        }

        // 모든 처리가 끝난 후 스택이 비어있지 않다면 올바른 괄호가 아니에요.
        // 올바른 괄호라면 짝이 맞기 때문에 스택이 비어야 합니다.
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();

    }
}














