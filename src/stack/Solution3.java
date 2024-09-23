package stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c); // 여는 괄호를 스택에 넣음.
            } else if (c == ')') {
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    sb.append(c);
                }
            }
        }

        System.out.println(sb);

        sc.close();


    }
}


















