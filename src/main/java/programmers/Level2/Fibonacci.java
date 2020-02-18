package programmers.level2;

/**
 * 2020. 02. 18.
 * 문제 : 피보나치 수
 * 피보나치 수를 구현하고 n번째 피보나치 수를 1234567로 나눈 나머지를 리턴하는 함수를 작성하라.
 */
public class Fibonacci {

    public int getFibonacci(int n) {
        if (n == 1 || n == 2) return 1;

        int n1 = 1;
        int n2 = 1;
        int sum = 0;

        for (int i = 3; i <= n; i++) {
            sum = n1 + n2;
            sum %= 1234567;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }
}
