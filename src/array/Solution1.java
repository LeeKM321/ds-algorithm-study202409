package array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

//        System.out.print(arr[0] + " ");
        bw.write(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
//                System.out.print(arr[i] + " ");
                bw.write(arr[i] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }
}

















