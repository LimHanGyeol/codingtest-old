package baekJoon.string;

import java.util.Scanner;

/**
 * 2020. 02. 16.
 * 문제 : 1316번 그룹 단어 체커
 * 단어가 연속되지 않은 상태에서 다시 나오게 되면 false.
 * true인 단어를 확인하라.
 */
public class GroupWordCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int result = 0;

        while (n--> 0) {
            String input = scanner.nextLine();
            if (getGroupWordCheck(input)) {
                result++;
            }
        }
        System.out.println(result);

    }

    public static boolean getGroupWordCheck(String input) {
        boolean[] alpabet = new boolean[26];
        int length = input.length();

        int i;
        for (i = 0; i < length; i++) {
            char stringPlaceValue = input.charAt(i);
            if (alpabet[stringPlaceValue-'a']) {
                return false;
            } else {
                if (i < length-1 && stringPlaceValue != input.charAt(i+1)) {
                    alpabet[stringPlaceValue-'a'] = true;
                }
            }
        }
        return true;
    }
}
