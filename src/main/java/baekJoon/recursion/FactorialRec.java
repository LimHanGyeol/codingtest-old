package baekJoon.recursion;

import java.util.Scanner;

/**
 * 2020. 02. 16.
 * 문제 : 10872번 팩토리얼
 * 반복문을 사용하지 않고 n의 곱을 계산하는 팩토리얼 함수 구현하기.
 */
public class FactorialRec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFactorialRec(n));
    }

    public static int getFactorialRec(int n) {
        if (n == 0) {
            return 1;
        } else {
            return getFactorialRec(n-1) * n;
        }
    }
}
