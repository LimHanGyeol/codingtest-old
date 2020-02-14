package baekJoon.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 2020. 02. 14.
 * 문제 : 10828qjs Stack
 * 명령어로 작동하는 스택 프로그램 작성.
 */
public class StackMatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String question = scanner.nextLine();
            String[] array = question.split(" ");
            switch (array[0]) {
                case "push":
                    int testNumber = Integer.parseInt(array[1]);
                    stack.push(testNumber);
                    break;
                case "top":
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "pop":
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;
            }
        }
    }

}
