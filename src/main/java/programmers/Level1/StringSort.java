package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2020. 02. 04.
 * 문제 : 문자열 내 마음대로 정렬하기
 * 문자열로 구성된 배열 strings와, 정수n이 주어졌을 때,
 * 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
 * 엣지 케이스 -
 * strings : ["sun", "bed", "car"]
 * n : 1
 * return : ["car", "bed", "sun"]
 */
public class StringSort {

    public String[] getStringSortResult(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) > s2.charAt(n)) return 1;
                else if (s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if (s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
}
