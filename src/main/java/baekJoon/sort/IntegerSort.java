package baekJoon.sort;

import sort.SelectionSort;

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

        numArray = SelectionSort.selectionSortMax(numArray, numArray.length);

        for (int number : numArray) {
            System.out.println(number);
        }
    }

    // insertion sort : 삽입 정렬
    private static int[] getInsertionSort(int[] sortArray) {
        int tempNumer;
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (sortArray[j-1] > sortArray[j]) {
                    tempNumer = sortArray[j-1];
                    sortArray[j-1] = sortArray[j];
                    sortArray[j] = tempNumer;
                }
            }
        }
        return sortArray;
    }

    // buuble sort : 버블 정렬
    private static int[] getBubbleSort(int[] sortArray) {
        int tempNumber = 0;
        for (int i = sortArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortArray[j] > sortArray[j+1]) {
                    tempNumber = sortArray[j];
                    sortArray[j] = sortArray[j+1];
                    sortArray[j+1] = tempNumber;
                }
            }
        }
        return sortArray;
    }

    // selection sort : 선택 정렬
    private static int[] getSelectionSortMax(int[] sortArray) {
        int max;
        int tempNumber;
        for (int i = sortArray.length-1; i > 0; i--) {
            max = i;
            for (int j = i-1; j >= 0; j--) {
                if (sortArray[j] > sortArray[max]) {
                    max = j;
                }
                tempNumber = sortArray[i];
                sortArray[i] = sortArray[max];
                sortArray[max] = tempNumber;
            }
        }
        return sortArray;
    }

}
