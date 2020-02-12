package baekJoon.array;

import java.util.Scanner;

public class AboveAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] caseArray = new String[n];

        int studentMembers = 0, gradeSum = 0, average, aboveMember = 0;
        double percentage, resultValue;
        String doubleToString;
        String[] answer = new String[n];


        for (int i = 0; i < caseArray.length; i++) {
            caseArray[i] = scanner.nextLine();
        }

        for (int i = 0; i < caseArray.length; i++) {
            String[] memberAndGrade = caseArray[i].split(" ");
            for (int j = 1; j < memberAndGrade.length; j++) {
                studentMembers = Integer.parseInt(memberAndGrade[0]);
                gradeSum += Integer.parseInt(memberAndGrade[j]);
            }
            average = gradeSum / studentMembers;

            for (String grade : memberAndGrade) {
                if (Integer.parseInt(grade) > average) {
                    aboveMember += 1;
                }
            }
            percentage = (double) 100 / studentMembers;
            resultValue = percentage * aboveMember;

            doubleToString = String.format("%.3f", resultValue) + "%";
            answer[i] = doubleToString;
            gradeSum = 0;
            aboveMember = 0;

        }

        for (String str : answer) {
            System.out.println(str);
        }

    }

    public String[] getAbobeAverage(int n, String[] array) {
        int studentMembers = 0, average = 0;
        double percentage = 0, resultValue = 0;
        String[] answer = new String[n];

        for (int i = 0; i < array.length; i++) {
            int gradeSum = 0;
            int aboveMember = 0;
            String[] memberAndGrade = array[i].split(" ");
            studentMembers = Integer.parseInt(memberAndGrade[0]);
            gradeSum = getGradeSum(gradeSum, memberAndGrade);

            average = gradeSum / studentMembers;

            aboveMember = getAboveMember(average, memberAndGrade);

            percentage = (double) 100 / studentMembers;
            resultValue = percentage * aboveMember;

            String doubleToString = String.format("%.3f", resultValue) + "%";
            answer[i] = doubleToString;
        }
        return answer;
    }

    public int getGradeSum(int gradeSum, String[] memberAndGrade) {
        for (int j = 1; j < memberAndGrade.length; j++) {
            gradeSum += Integer.parseInt(memberAndGrade[j]);
        }
        return gradeSum;
    }

    public int getAboveMember(int average, String[] memberAndGrade) {
        int aboveMember = 0;
        for (String grade : memberAndGrade) {
            if (Integer.parseInt(grade) > average) {
                aboveMember += 1;
            }
        }
        return aboveMember;
    }

}
