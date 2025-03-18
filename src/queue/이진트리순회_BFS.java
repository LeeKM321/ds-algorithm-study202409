package queue;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}


public class 이진트리순회_BFS {
    static Node root; // 루트 노드를 담을 변수.

    static void BFS(Node node) {
        // BFS는 재귀를 사용하지 않습니다!
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print("level " + level + ": ");
            for (int i = 0; i < len; i++) {
                Node curr = queue.poll();
                System.out.print(curr.data + " ");
                // 자식 있니? (lt, rt) 있다면 큐에 추가, 없으면 넘어가기

                if (curr.lt != null) queue.add(curr.lt);
                if (curr.rt != null) queue.add(curr.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root); // 루트 노드를 기점으로 탐색을 시작

    }

}















