package selfstudy;

import java.util.HashMap;
import java.util.Map;

public class Question {

    public static void main(String[] args) {
        getPrint(1, 5, 5);
        //getString("limhangyeol");
    }

    public static Character getString(String str) {
        char[] charArray = str.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        char chrar;

        for (char chr : charArray) {
            map.put(String.valueOf(chr), map.getOrDefault(String.valueOf(chr), 0) + 1);
        }

        for (int i = 0; i < charArray.length; i++) {
            int numberCase = map.get(String.valueOf(charArray[i]));
            if (numberCase < 2) {
                chrar = charArray[i];
                System.out.println(chrar);
                return chrar;
            }
        }
        return null;
    }

    public static int getPrint(int checkNumber, int initailNumber, int n) {
        if (n > 1) {
            System.out.print(checkNumber);
            checkNumber++;
            return getPrint(checkNumber, initailNumber, n - 1);
        }
        if (n == 1){
            System.out.print(initailNumber);
            System.out.println();
            return getPrint(1, initailNumber-1, initailNumber-1);
        }
        return 0;
    }
}
