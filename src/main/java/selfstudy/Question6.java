package selfstudy;

import java.util.*;

public class Question6 {

    public int soulution(int[] array) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        setCipher(array, map);
        getReverseMap(map);
        return getResultValue(map);
    }

    private Map<Integer, List<Integer>> setCipher(int[] array, Map<Integer, List<Integer>> map) {
        int keyCipher = 0;
        for (int keys : array) {
            String[] keySplitArr = String.valueOf(keys).split("");
            for (String splitKeyNumber : keySplitArr) {
                keyCipher += Integer.parseInt(splitKeyNumber);
            }

            List<Integer> valueList = map.get(keyCipher);
            if (valueList == null) {
                valueList = new ArrayList<>();
                map.put(keyCipher, valueList);
            }
            valueList.add(keys);
            keyCipher = 0;
        }
        return map;
    }

    private Map<Integer, List<Integer>> getReverseMap(Map<Integer, List<Integer>> map) {
        for (int key : map.keySet()) {
            List<Integer> valueList = map.get(key);
            Collections.sort(valueList, Comparator.reverseOrder());
        }
        return map;
    }

    private int getResultValue(Map<Integer, List<Integer>> map) {
        int answer = -1;
        for (int key : map.keySet()) {
            List<Integer> valueList = map.get(key);
            if (valueList.size() > 1) {
                int sum = valueList.get(0) + valueList.get(1);
                if (answer < sum) answer = sum;
            }
        }
        return answer;
    }

}
