package programmers.level2;

import java.util.HashMap;

public class Camoflage {

    public int getSolution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        for (String keys : map.keySet()) {
            answer *= (map.get(keys) + 1);
        }
        return answer - 1;
    }

}
