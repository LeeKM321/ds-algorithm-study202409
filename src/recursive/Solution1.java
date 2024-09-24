package recursive;

import java.util.Scanner;

public class Solution1 {

    static int N;
    static int[] check;

    static void DFS(int L) {
        if (L == N + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                if (check[i] == 1) sb.append(i + " ");
            }
            if (!sb.isEmpty()) System.out.println(sb);
        } else {
            check[L] = 1;
            DFS(L + 1); // lt

            check[L] = 0;
            DFS(L + 1); // rt
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        check = new int[N + 1];
        DFS(1);

        sc.close();

    }

}
