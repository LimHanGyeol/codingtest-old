package Programmers.Level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 2020. 02. 04.
 * 문제 : 체육복
 * 일부 학생이 체육복을 도난 당했다. 여벌 체육복이 있는 학생이 잃어버린 학생에게 체육복을 빌려주려고 한다.
 * 체육복은 앞번호, 뒷번호의 학생에게만 빌려줄 수 있다. 최대한 많은 학생이 수업을 들어야 한다.
 * 엣지 케이스 :
 * n : 1
 * lost : [2, 4]
 * reserve : [1, 3, 5]
 * return : 5
 */
public class GymClothes {
    public int getGymClothes(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) lostList.add(i);
        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) reserveList.add(i);

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (lostList.get(i) == reserveList.get(j)) {
                    lostList.remove(i);
                    reserveList.remove(j);
                    i--;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < lostList.size(); i++) {
            int lostNum = lostList.get(i);
            for (int j = 0; j < reserveList.size(); j++) {
                int reserveNum = reserveList.get(j);
                if (lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
                    reserveList.remove(j);
                    answer++;
                    break;
                }
            }
        }


        return answer;
    }
}
