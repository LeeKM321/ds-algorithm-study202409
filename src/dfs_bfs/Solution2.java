package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution2 {
    static int answer = 0; // 점프 횟수
    static int[] dis = {1, -1, 5}; // 이동할 수 있는 거리
    static int[] check; // 방문 체크
    static Queue<Integer> queue = new LinkedList<>();

    static void BFS(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        queue.offer(s);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int curr = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int next = curr + dis[j];
                    if (next == e) {
                        System.out.println(L + 1);
                        return;
                    }
                    // check 배열을 사용해서 이미 확인했던 경로는 다시 체크하지 않도록 제어.
                    if (next >= 1 && next <= 10000 && check[next] == 0) {
                        check[next] = 1;
                        queue.offer(next);
                    }
                }
            }
            L++;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        BFS(S, E);

    }


}














