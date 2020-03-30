package selfstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5 {

    public int solution(int[] array) {
        int returnVlue = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        map = setArrayToMap(array);

        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                list.add(map.get(key));
            } else {
                returnVlue = 0;
            }
        }
        return getResultValue(list, returnVlue);
    }

    private Map<Integer, Integer> setArrayToMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int keys : array) map.put(keys, map.getOrDefault(keys, 0) + 1);
        return map;
    }

    private int getResultValue(List<Integer> list, int returnVlue) {
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (returnVlue < num) returnVlue = num;
        }
        return returnVlue;
    }
}
