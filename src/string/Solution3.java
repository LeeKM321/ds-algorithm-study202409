package string;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length-1;
        while (left < right) {
            if (!Character.isAlphabetic(arr[left])) left++;
            else if (!Character.isAlphabetic(arr[right])) right--;
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; right--;
            }
        }

        String newStr = String.valueOf(arr);
        System.out.println(newStr);

        sc.close();

    }
}













