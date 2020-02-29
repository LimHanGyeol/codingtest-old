package programmers.level2;
/**
 * 2020. 02. 29.
 * 문제 : 숫자의 표현
 * 자연수 n을 연속한 자연수로 푸는 방법은 여러개이다.
 * 자연수 n이 매개변수로 주어질 때 연속된 자연수들로 n을 표현하는 방법의 수를 구하라.
 */
public class ExpressOfNumber {

    public int getExpressOfNumber(int n) {
        int count = 0, sum = 0, intValue = 0;
        System.out.println(n/2);
        for (int i = 1; i < n/2 + 1; i++) {
            sum = 0;
            intValue = i;
            while (sum < n) sum += intValue ++;
            if (sum == n) count++;
        }
        return count+1;
    }
}
