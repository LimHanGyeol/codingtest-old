package Programmers.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameNumber {

    public int[] getHateSameNumber(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
