package baekJoon.greedy;

import java.util.Scanner;

/**
 * 2020. 02. 18.
 * 문제 : 11047번 동전
 */
public class Coin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] coinArray = new int[N + 1];

        int minValue = 0;

        for (int i = 0; i < N; i++) {
            coinArray[i] = scanner.nextInt();
        }

        for (int i = coinArray.length - 1; i >= 0; i--) {
            if (K > coinArray[i] && coinArray[i] != 0) {
                minValue += K / coinArray[i];
                K %= coinArray[i];
            }
        }
        System.out.println(minValue);
    }

    public int getCoin(int k, int[] coinArray) {
        int minValue = 0;
        int price = k;

        for (int i = coinArray.length - 1; i >= 0; i--) {
            if (price == 0) break;
            if (price >= coinArray[i]) {
                minValue += price / coinArray[i];
                price = price % coinArray[i];
            }
        }
        System.out.println(minValue);
        return minValue;
    }
}
