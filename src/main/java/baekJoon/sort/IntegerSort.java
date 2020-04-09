package baekJoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numArray = new int[n];

        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
        }

        Arrays.sort(numArray);

        for (int number : numArray) {
            System.out.println(number);
        }
    }
}
