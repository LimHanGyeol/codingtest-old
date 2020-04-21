package sort;

/**
 * 선택 정렬
 */
public class SelectionSort {
    private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};

    public static void main(String[] args) {
//        selectionSortMin(input, input.length);
//        selectionSortMax(input, input.length);
//        for (int num : input) {
//            System.out.print(num + " ");
//        }
        int[] arr = {3, 6, 1, 8, 2, 4};
        printArray(input);
        selectionSort(input);
        printArray(input);

    }

    private static void selectionSort(int[] arr) {
        selectionSort(arr, 0);
    }

    private static void selectionSort(int[] arr, int start) {
        if (start < arr.length - 1) {
            int minIndex = start;
            for (int i = start; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            swap(arr, start, minIndex);
            selectionSort(arr, start+1);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tempValue = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tempValue;
    }

    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ",");
        }
        System.out.println();
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
