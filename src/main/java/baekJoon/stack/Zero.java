package baekJoon.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 2020. 02. 14.
 * 문제 : 10773번 제로
 * 기본적인 스택 관리 문제.
 */
public class Zero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Stack<Integer> stack = new Stack<>();
        int[] testCase = new int[n];
        int answer = 0;

        for (int i = 0; i < testCase.length; i++) {
            testCase[i] = scanner.nextInt();
        }

        for (int num : testCase) {
            num = (num == 0) ? stack.pop() : stack.push(num);
        }

        for (int num : stack) {
            answer += num;
        }

        System.out.println(answer);
//        System.out.println(getZeroStack(testCase));
    }

    public static int getZeroStack(int[] testCase) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int num : testCase)
            num = (num == 0) ? stack.pop() : stack.push(num);

        for (int num : stack)
            answer += num;

        return answer;
    }
}
