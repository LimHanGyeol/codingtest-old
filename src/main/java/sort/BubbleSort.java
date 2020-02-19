package sort;

/**
 * 버블 정렬
 */
public class BubbleSort {
    private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};

    public static void main(String[] args) {
        bubbleSort(input, input.length);
        for (int num : input) {
            System.out.printf(num + " ");
        }

    }

    private static void bubbleSort(int[] input, int length) {
        int tmp;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (input[j] > input[j + 1]) {
                    tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
    }
}
