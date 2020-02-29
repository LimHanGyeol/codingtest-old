package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;
/**
 * 2020. 02. 29.
 * 문제 : 프린터
 * 프린터는 선입선출로 큐의 구조로 이루어져있다.
 * 하지만 우선순위를 주어 우선순위가 높은 프린트물 먼저 출력을하고, 앞에있는 출력물은 뒤로 보내려고 한다.
 * 출력할 프린트 물이 location 매개변수로 주어질 경우
 * 출력될 순서를 return 하라.
 */
public class Printer {

    public int getPrinter(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int task : priorities) priorityQueue.add(task);

        while(!priorityQueue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int) priorityQueue.peek()) {
                    if(i == location) return answer;

                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
