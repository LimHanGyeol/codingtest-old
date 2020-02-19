package sort;

/**
 * 선택 정렬
 */
public class SelectionSort {
    private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};

    public static void main(String[] args) {
//        selectionSortMin(input, input.length);
        selectionSortMax(input, input.length);
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static int[] selectionSortMin(int[] input, int length) {
        int min;
        int tmp;
        for (int i = 0; i < length - 1; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (input[j] < input[min])
                    min = j;
            }
            tmp = input[i];
            input[i] = input[min];
            input[min] = tmp;
        }
        return input;
    }

    public static int[] selectionSortMax(int[] input, int length) {
        int max;
        int tmp;
        for (int i = length - 1; i > 0; i--) {
            max = i;
            for (int j = i - 1; j >= 0; j--) {
                if (input[j] > input[max])
                    max = j;
            }
            tmp = input[i];
            input[i] = input[max];
            input[max] = tmp;
        }
        return input;
    }
}
