package selfstudy;


import java.util.Arrays;
import java.util.Comparator;

public class Question7 {

    public String solution(String t) {
        StringBuffer answer = new StringBuffer();
        String[] sizes = t.split("");
        String[] sizeOrder = {"S", "M", "L"};
        Arrays.sort(sizes, new Comparator<String>() {
            @Override
            public int compare(String size1, String size2) {
                if (size1.equals(size2)) {
                    return 0;
                }
                int size1Order = 0;
                int size2Order = 0;
                for (int i = 0; i < sizeOrder.length; i++) {
                    if (size1.equals(sizeOrder[i])) {
                        size1Order = i;
                    }

                    if (size2.equals(sizeOrder[i])) {
                        size2Order = i;
                    }
                }

                if (size1Order < size2Order) {
                    return -1;
                }
                return 1;
            }
        });
        for (String size : sizes) answer.append(size);
        return answer.toString();
    }
}
