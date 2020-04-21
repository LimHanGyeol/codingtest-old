package sort;

/**
 * 버블 정렬
 */
public class BubbleSort {
    private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};

    public static void main(String[] args) {
//        bubbleSort(input, input.length);
//        for (int num : input) {
//            System.out.printf(num + " ");
//        }

        printArray(input);
        bubbleSortR(input);
        printArray(input);
    }

    private static void bubbleSortR(int[] arr) {
        bubbleSortR(arr, arr.length - 1);
    }

    private static void bubbleSortR(int[] arr, int last) {
        if (last > 0) {
            for (int i = 1; i <= last; i++) {
                if (arr[i-1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
            bubbleSortR(arr, last - 1);
        }
    }

    private static void swap(int[] arr, int source, int target) {
        int tempValue = arr[source];
        arr[source] = arr[target];
        arr[target] = tempValue;
    }

    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
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
