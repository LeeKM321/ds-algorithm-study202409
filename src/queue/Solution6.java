package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String need = br.readLine();
        String plan = br.readLine();

        // 필수 과목을 위한 큐를 생성
        Queue<Character> queue = new LinkedList<>();
        for (char c : need.toCharArray()) {
            queue.add(c);
        }

        for (char c : plan.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.poll() != c) {
                    // 필수과목 순서가 잘못됨.
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (!queue.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }


        br.close();


    }
}

















