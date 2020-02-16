package baekJoon.string;

import java.util.*;

/**
 * 2020. 02. 16.
 * 문제 : 1157번 단어 공부
 * 가장 많이 사용한 알파벳 찾기
 * getWordStudy를 main method에 선언식으로 문제를 제출했는데 실패로 나옴.
 * getWordStudy의 핵심 코드를 main method에 복붙하여 제출했더니 성공으로 나옴.
 */
public class WordStudy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String answer = "";
        int checkNum = 0;
        Map<String, Integer> map = new HashMap<>();
        String[] testCase = input.split("");

        for (int i = 0; i < testCase.length; i++) {
            String key = testCase[i].toUpperCase();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > checkNum) {
                checkNum = value;
                answer = key;
            } else if (value == checkNum) {
                answer = "?";
            }
        }
        System.out.println(answer);
    }

    public static String getWordStudy(String input) {
        String answer = "";
        int checkNum = 0;
        Map<String, Integer> map = new HashMap<>();
        String[] testCase = input.split("");

        for (int i = 0; i < testCase.length; i++) {
            String key = testCase[i].toUpperCase();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > checkNum) {
                checkNum = value;
                answer = key;
            } else if (value == checkNum) {
                return "?";
            }
        }
        return answer;
    }
}
