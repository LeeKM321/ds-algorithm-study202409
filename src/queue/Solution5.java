package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 왕자 수
        int K = Integer.parseInt(st.nextToken()); // K번째 왕자는 나가야 한다.
        Queue<Integer> queue = new LinkedList<>();

        // 큐에다가 왕자 번호를 삽입
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            // K번째 이전 왕자들은 큐의 맨 뒤로 보내자.
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }
            queue.poll(); // K번째는 나가!
        }

        // 최종 왕자 출력.
        System.out.println(queue.poll());

        br.close();


    }
}











