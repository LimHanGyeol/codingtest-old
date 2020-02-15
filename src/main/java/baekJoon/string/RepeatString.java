package baekJoon.string;

import java.util.Scanner;

/**
 * 2020. 02. 15.
 * 문제 : 2675번 문자열 반복
 * 문자열 s의 원소들을 r번 반복하여 새 문자열 p를 리턴하라.
 * 19년도 알고리즘 첫 공부 시기에 못풀었던 문제이다.
 * 현재 문제풀이에 걸린 시간 5분이내.
 */
public class RepeatString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = new String[n];

        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextLine();
        }

        for (String str : inputArray) {
            String[] testCase = str.split(" ");
            int repeatNum = Integer.parseInt(testCase[0]);
            String[] arrayTestCase = testCase[1].split("");
            StringBuffer returnValue = new StringBuffer();

            for (int i = 0; i < arrayTestCase.length; i++) {
                for (int j = 0; j < repeatNum; j++) {
                    returnValue.append(arrayTestCase[i]);
                }
            }
            System.out.println(returnValue.toString());
        }
    }

    public String getSumOfNumbers(String str) {
        String[] testCase = str.split(" ");
        int repeatNum = Integer.parseInt(testCase[0]);
        String[] arrayTestCase = testCase[1].split("");
        StringBuffer returnValue = new StringBuffer();

        for (int i = 0; i < arrayTestCase.length; i++) {
            for (int j = 0; j < repeatNum; j++) {
                returnValue.append(arrayTestCase[i]);
            }
        }
        return returnValue.toString();
    }
}
