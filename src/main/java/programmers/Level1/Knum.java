package programmers.level1;

import java.util.Arrays;

public class Knum {

    public int[] getKnumber(int[] array, int[][] commands) {
        return retrunArray(array, commands);
    }

    private int[] retrunArray(int[] array, int[][] commands) {
        int[] arr = {};
        int commandsLength = commands.length;
        int[] answer = new int[commandsLength];
        for (int i = 0; i < commandsLength; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int th = commands[i][2];

            arr = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(arr);

            answer[i] = arr[th - 1];
        }
        return answer;
    }
}
