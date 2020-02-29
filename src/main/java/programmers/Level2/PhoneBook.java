package programmers.level2;

import java.util.*;

/**
 * 2020. 02. 29.
 * 문제 : 전화번호 목록
 * 매개변수로 전화번호가 주어진다.
 * 어떤 번호가 다른 번호의 접두어인 경우 false, 아닌 경우 true를 리턴하라.
 * 풀이 시간 약 20분
 */
public class PhoneBook {

    public boolean getPhoneBookCheck(String[] phone_book) {
        int minLength = phone_book.length;
        String keyValue;
        List<String> keySetList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String phoneNum : phone_book) {
            int phoneNumLen = phoneNum.length();
            if (phoneNumLen < minLength) minLength = phoneNumLen;
        }

        for (String phoneNum : phone_book) {
            keyValue = phoneNum.substring(0, minLength);
            keySetList.add(keyValue);
            map.put(keyValue, map.getOrDefault(keyValue, 0) + 1);
        }

        for (String key : keySetList) if (map.get(key) > 1) return false;
        return true;
    }
}
