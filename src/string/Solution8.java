package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution8 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String msg = br.readLine();

        //#****###**#####**#####**##**
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            //#****##
            String temp = msg.substring(i*7, (i*7)+7)
                    .replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            answer.append((char) num);

//            msg = msg.substring(7);
        }

        System.out.println(answer);

        br.close();



    }
}

















