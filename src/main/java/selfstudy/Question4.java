package selfstudy;

import java.util.Scanner;
import java.util.Stack;

public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseNum = scanner.nextInt();
        scanner.nextLine();

        int count = 0;

        while (testCaseNum != 0) {
            String testCaseInput = scanner.nextLine();
            Stack<String> stack = new Stack<>();
            String[] testCaseArray = testCaseInput.split("");

            for (int i = 0; i < testCaseArray.length; i++) {
                if (testCaseArray[i].equals("(")) stack.push(testCaseArray[i]);
                else count++;
            }

            String returnValue = (stack.size() - count == 0) ? "Yes" : "No";
            System.out.println(returnValue);
            count = 0;
            testCaseNum--;
        }
    }

    public static int[] stringToIntArray(String coinTestCase, int coinNum) {
        String[] testCaseArray = coinTestCase.split(" ");
        int[] coinArray = new int[coinNum];

        for (int i = 0; i < coinArray.length; i++) {    // 화폐 단위 int배열로 변환
            coinArray[i] = Integer.parseInt(testCaseArray[i]);
        }
        return coinArray;
    }

    public static int getMinValue(int[] coinArray, int price, int minValue) {
        for (int i = coinArray.length - 1; i >= 0; i--) {
            if (price == 0) break;
            if (price >= coinArray[i]) {
                minValue += price / coinArray[i];
                price = price % coinArray[i];
            }
        }
        return minValue;
    }

    public static void solution2() {
        Scanner scanner = new Scanner(System.in);
        int testCaseNum = scanner.nextInt();
        scanner.nextLine();

        int minValue = 0;

        while (testCaseNum != 0) {
            int coinNum = scanner.nextInt();
            scanner.nextLine();

            String coinTestCase = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.nextLine();

            int[] coinArray = stringToIntArray(coinTestCase, coinNum);

            minValue = getMinValue(coinArray, price, minValue);

            System.out.println(minValue);
            minValue = 0;
            testCaseNum--;
        }
    }

    public static String croissant1(String croissant1) {
        Stack<String> stack = new Stack<>();
        String[] testCaseArray = croissant1.split("");
        int count = 0;

        for (int i = 0; i < testCaseArray.length; i++) {
            if (testCaseArray[i].equals("(")) {
                stack.push(testCaseArray[i]);
            } else {
                count++;
            }
        }

        return (stack.size() - count == 0) ? "Yes" : "No";
    }
}
