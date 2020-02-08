package BaekJoon.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 2020. 02. 08.
 * 문제 : 나머지
 * 수 10개를 42로 나눈 나머지를 구한다.
 * 그리고 서로 다른 값의 개수를 출력한다.
 */
public class Divide {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] intArray = new int[10];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = scanner.nextInt();
//        }
//        int B = 42;
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : intArray) {
//            int result = num % B;
//            set.add(result);
//        }
//        System.out.println(set.size());
    }

    public int getDivide(int[] array) {
        int B = 42;
        Set<Integer> set = new HashSet<>();

        for (int num : array) {
            int result = num % B;
            set.add(result);
        }
        return set.size();
    }
}
