package programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public String getLargestNumber(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        arr = getSortArray(arr);
        if (arr[0].equals("0")) return "0";

        return getReturnValue(arr);
    }

    public String[] getSortArray(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        return arr;
    }

    private String getReturnValue(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

}
