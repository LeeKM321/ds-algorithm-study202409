package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();
        int pieces = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('('); // 여는 괄호는 스택에 넣음.
            } else {
                stack.pop(); // 닫는 괄호일 때는 스택에서 하나를 꺼냄
                if (input.charAt(i - 1) == '(') {
                    // 바로 앞에 여는 괄호가 있으면 레이저 -> 스택의 크기만큼 조각 추가
                    pieces += stack.size();
                } else {
                    // 막대기의 끝 -> 조각 1개만 추가
                    pieces++;
                }
            }
        }

        System.out.println(pieces);

        br.close();

    }
}

















