package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution4 {

    static int n, m, answer = 0;
    static List<List<Integer>> graph;
    static int[] ch, dis;

    static void BFS(int v) {
        ch[v] = 1; // 노드 방문 체크
        dis[v] = 0; // 1번 노드로부터 특정 노드의 거리를 기억하는 배열.
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int nv : graph.get(curr)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[curr] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ch = new int[N + 1];
        dis = new int[N + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            // 노드의 개수만큼 리스트를 생성해서 추가.
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        BFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + dis[i]);
        }

        br.close();


    }
}












