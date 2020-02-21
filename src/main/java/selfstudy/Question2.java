package selfstudy;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public static int solution(int D, String S) {
        char c = 'w' % 32;
        // o = 111 , t = 116, w = 119
        System.out.println((int) c);
        return (D * getStringToInt(S));
    }

    public static int getStringToInt(String S) {
        switch (S) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
        }
        return 0;
    }

    public static int solution3(int N) {
        String number = String.valueOf(N);
        int testNumber = 0, fiveValue = 5;
        boolean flag = false, resultFlag = false;
        List<Integer> list = new ArrayList<>();
        StringBuffer answer = new StringBuffer();


        if (number.substring(0,1).equals("-")) {    // Input이 정수인지 음수인지 체크
            testNumber = Integer.parseInt(number.substring(1, number.length()));
            flag = true;
            resultFlag = true;
        } else {
            testNumber = Integer.parseInt(number);
        }

        String[] array = String.valueOf(testNumber).split("");

        for (String num : array) { // input을 각각의 원소로 list에 추가
            list.add(Integer.valueOf(num));
        }

        for (int i = 0; i< list.size(); i++) {
            int num = list.get(i);
            if (flag) {
                num = -num;
                flag = false;
            }

            if (num > fiveValue) {
                answer.append(num);
            } else{
                answer.append(fiveValue);
                answer.append(Math.abs(num));
            }

        }
        int returnValue = Integer.parseInt(answer.toString());

        return (resultFlag) ? -returnValue : returnValue;
    }
}
