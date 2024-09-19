package string;

import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                answer += str.charAt(i);
                if (cnt > 1) answer += cnt;
                cnt = 1;
            }

        }

        System.out.println(answer);

        sc.close();


    }

}












