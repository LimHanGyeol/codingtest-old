package programmers.level2;

import java.util.*;
/**
 * 2020. 02. 26.
 * 문제 : 탑
 * 송신탑이 주어질때, 수신할 수 있는 탑을 구하고 해당 탑의 위치를 담은 배열 리턴.
 */
public class Tower {

    public int[] getTower(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int size = heights.length;
        int[] answer = new int[size];

        for (int tower : heights) {
            stack.push(tower);
        }

        int checkTower, towerNum;
        for (int i = size-1; i >= 0; i--) {
            checkTower = stack.pop();
            int stackNum = 0; // 앞의 스택이 checkTower보다 작으면 해당 값을 pop하고 다음 값을 탐색함. 이후 pop한 값을 다시 추가해줌.
            while (!stack.empty()) {
                towerNum = stack.pop();
                stackNum++;
                if (towerNum > checkTower) {
                    answer[i] = (i-stackNum)+1;
                    break;
                }
            }
            for (int j = i-stackNum; j < i; j++) {
                stack.push(heights[j]);
            }
        }
        return answer;
    }
}
