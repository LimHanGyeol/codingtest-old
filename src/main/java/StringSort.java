import java.util.Arrays;

public class StringSort {

    public String[] getStringSortResult(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings, new Comparable<>() {
            @Override
            public int compareTo(String s1, String s2 o) {
                return 0;
            }
        });



        return answer;
    }
}
