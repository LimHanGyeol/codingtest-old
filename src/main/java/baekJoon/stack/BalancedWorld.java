package baekJoon.stack;


import java.util.Scanner;
import java.util.Stack;

/**
 * 2020. 02. 15.
 * 문제 : 4949번 균형잡힌 세상
 * 각 문자열의 괄호가 잘 맞춰져 있는지 판단하는 함수 작성.
 * 30분 제한시간 실패
 */
public class BalancedWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputStr = scanner.nextLine();

            Stack<Character> stack = new Stack<>();
            boolean result = true;

            if (inputStr.length() > 100)
                result = false;

            if (inputStr.equals("."))
                break;

            for (char chr : inputStr.toCharArray()) {
                if (chr == '(' || chr == '[')
                    stack.push(chr);
                else if (chr == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = false;
                        break;
                    }
                } else if (chr == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        result = false;
                        break;
                    }
                }
                if (chr == '.') {
                    break;
                }
            }

            if (!stack.isEmpty())
                result = false;

            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }


    public String getBalancedWorld(String inputstr) {
        Stack<Character> stack = new Stack<>();
        boolean result = true;

        if (inputstr.length() > 100)
            result = false;

        for (char chr : inputstr.toCharArray()) {
            if (chr == '(' || chr == '[')
                stack.push(chr);
            else if (chr == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    result = false;
                    break;
                }
            } else if (chr == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    result = false;
                    break;
                }
            }
            if (chr == '.') {
                break;
            }
        }

        if (!stack.isEmpty())
            result = false;

        return (result) ? "yes" : "no";
    }
}
