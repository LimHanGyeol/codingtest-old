package BaekJoon.array;

import java.util.Scanner;

/**
 * 2020. 02. 08.
 * 문제 : 1546번 평균
 * n개의 성적중 최대값을 구하고,
 * 나머지 값을 점수 / 최대값 * 100을 한다.
 * 점수를 올린 값의 평균을 구한다.
 */
public class Average {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int maxValue = 0;
//        double returnValue = 0;
//        double grade;
//
//        for (int num : array) {
//            if (num > maxValue) {
//                maxValue = num;
//            }
//        }
//
//        for (double num : array) {
//            grade = num / maxValue * 100;
//            returnValue += grade;
//        }
//        System.out.println(returnValue/n);
    }

    public double getAverage(int n, int[] gradeArray) {
        int maxValue = getMaxValue(gradeArray);
        double returnValue = getAverageUpdate(maxValue, gradeArray);
        return returnValue / n;
    }

    public int getMaxValue(int[] gradeArray) {
        int maxValue = 0;
        for (int num : gradeArray) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public double getAverageUpdate(int maxValue, int[] gradeArray) {
        double returnValue = 0;
        double grade;
        for (double num : gradeArray) {
            grade = num / maxValue * 100;
            returnValue += grade;
        }
        return returnValue;
    }

}
