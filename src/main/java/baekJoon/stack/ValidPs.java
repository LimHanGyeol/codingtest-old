package baekJoon.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 2020. 02. 14.
 * 문제 : 9012번 괄호
 * 올바른 괄호 문자열을 판단하는 문제.
 */
public class ValidPs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] testArray = new String[n];
        Stack<String> stack = new Stack<>();
        int resultValue;
        int checkNum = 0;

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < testArray.length; i++) {
            String[] splitArray = testArray[i].split("");

            for (int j = 0; j < splitArray.length; j++) {
                if (splitArray[j].equals("(")) {
                    stack.push(splitArray[j]);
                } else {
                    checkNum++;
                }
            }
            resultValue = (stack.size() - checkNum);
            System.out.println((resultValue == 0) ? "YES" : "NO");
            checkNum = 0;
            resultValue = 0;
            stack.clear();
        }
    }

    public String getValidPs(String[] psArray) {
        Stack<String> stack = new Stack<>();
        int resultValue = 0;

        for (int i = 0; i < psArray.length; i++) {
            String[] splitArray = psArray[i].split("");
            resultValue = getPsCheck(splitArray, stack);
        }
        return (resultValue == 0) ? "YES" : "NO";
    }

    public static int getPsCheck(String[] splitArray, Stack<String> stack) {
        int checkNum = 0;
        for (int j = 0; j < splitArray.length; j++) {
            if (splitArray[j].equals("(")) {
                stack.push(splitArray[j]);
            } else {
                checkNum++;
            }
        }
        return (stack.size() - checkNum);
    }
}
