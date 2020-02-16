package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMin {

    public String getMaxAndMin(String s) {
        String[] array = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(Integer.parseInt(array[i]));
        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        return min + " " + max;
    }

    public String getMaxMin(String s) {
        String[] array = s.split(" ");
        int max, min, n;
        max = Integer.parseInt(array[0]);
        min = Integer.parseInt(array[0]);

        for (int i = 1; i < array.length; i++) {
            n = Integer.parseInt(array[i]);
            if (max < n) max = n;
            if (min > n) min = n;
        }
        return min + " " + max;
    }
}
