package selfstudy;

import java.util.*;

public class Question3 {

    public boolean cookieWriteCheck(String practiceWord, String inputWord) {
        int savedIndex = 0;
        char[] inputWords = inputWord.toCharArray();

        for (char practiceChar : practiceWord.toCharArray()) {
            for (int i = savedIndex; i < inputWord.length(); i++) {
                if (practiceChar == inputWords[i]) {
                    System.out.println(practiceChar + " " + inputWords[i]);
                    savedIndex++;
                    break;
                }
                if (inputWords[i - 1] == inputWords[i]) {
                    savedIndex++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public int lostToNumber(int[] s1, int[] s2) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int s2Num : s2) map.put(s2Num, map.getOrDefault(s2Num, 0) - 1);

        for (int s1Num : s1) {
            map.put(s1Num, map.getOrDefault(s1Num, 0) + 1);
            if (map.get(s1Num) == 1) {
                answer = s1Num;
            }

        }
        return answer;
    }


}