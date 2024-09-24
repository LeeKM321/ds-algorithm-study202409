package recursive;

import java.util.Arrays;

public class Fibonacci {

    static long[] fibo;

    public static long fibonacci(int n) {
        if (fibo[n] > 0) return fibo[n];

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void conversionToBinary(int n) {
        if (n == 0) return;
        // 10진수 n을 2진수로 변환하여 출력하는 로직을 작성하세요. (재귀)
        // 1 <= n <= 1000
        conversionToBinary(n / 2);
        System.out.print(n % 2);
    }


    public static void main(String[] args) {

        // 10 -> 1 1 2 3 5 8 13 21 34 55.....
//        int n = 100;
//        fibo = new long[n + 1];
//        long result = fibonacci(n);
//        System.out.println("result = " + result);
//
//        System.out.println(Arrays.toString(fibo));

        conversionToBinary(1000);

    }

}









