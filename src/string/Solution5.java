package string;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 일괄 소문자 변경
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        // 특수문자, 숫자, 공백 제거
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        // 정리한 문자열이 역순으로 배치한 문자열과 동일하면 YES, 그렇지 않다면 NO
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        sc.close();


    }

}










