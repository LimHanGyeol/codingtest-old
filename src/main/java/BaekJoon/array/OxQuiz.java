package BaekJoon.array;

import java.util.Scanner;

public class OxQuiz {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        String[] inputArray = new String[n];
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = scanner.nextLine();
//        }
//        int grade = 0;
//        int resultValue = 0;
//        int[] answer = new int[n];
//
//
//        for (int i = 0; i < inputArray.length; i++) {
//            String[] quiz = inputArray[i].split("");
//            for (int j = 0; j < quiz.length; j++) {
//                if (quiz[j].equals("O")) {
//                    grade += 1;
//                    resultValue += grade;
//                } else {
//                    grade = 0;
//                }
//            }
//            answer[i] = resultValue;
//            resultValue = 0;
//            grade = 0;
//        }
//
//        for (int num : answer) {
//            System.out.println(num);
//        }
    }

    public int[] getOxQuiz(int n, String[] array) {
        int[] answer = new int[n];
        int grade = 0;
        int resultValue = 0;


        for (int i = 0; i < array.length; i++) {
            String[] quiz = array[i].split("");
            for (int j = 0; j < quiz.length; j++) {
                if (quiz[j].equals("O")) {
                    grade += 1;
                    resultValue += grade;
                } else {
                    grade = 0;
                }
            }
            answer[i] = resultValue;
            resultValue = 0;
            grade = 0;
        }
        return answer;
    }

}
