package recursive;

public class RecursiveBasic {

    // 재귀 함수는 항상 종료 조건이 필요합니다.
    public static void recursive(int n) {
        if (n == 0) return;
        recursive(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        int result = n * factorial(n - 1);
        return result;
    }


    public static void main(String[] args) {
//        recursive(3);
        int fac = factorial(10);
        System.out.println(fac);
    }



}









