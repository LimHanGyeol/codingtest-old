package baekJoon.recursion;

import java.util.Scanner;

/**
 * 2020. 02. 17.
 * 문제 : 10870번 피보나치 수열
 * 반복문을 사용하지 않고 재귀 방식을 이용하여 피보나치 수열을 구현한다.
 */
public class FibonacciRec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFibonacciRec(n));
    }

    public static int getFibonacciRec(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return (getFibonacciRec(n - 2) + getFibonacciRec(n - 1));
    }

    // 동적 프로그래밍 기법을 활용한 방법이라고 한다.
    // 동적 프로그래밍 기법은 아직 모르므로 이런 방법이 있다고 파악하고 끝낸다.
    public static int getDynamicFibonacci(int n) {
        int x = 1, y = 0, result = 0;

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        for (int i = 1; i < n; i++) {
            result = x + y;
            y = x;
            x = result;
        }
        return result;
    }
}
