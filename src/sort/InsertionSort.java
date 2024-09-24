package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {42, 32, 24, 60, 15};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
















