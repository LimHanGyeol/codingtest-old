package programmers.level2;

import java.util.Stack;

/**
 * 2020. 03. 03.
 * 문제 : 쇠막대기
 * 여러 개의 쇠막대기를 레이저로 절단하려고 한다.
 * 쇠막대기의 구분은 문자열 괄호로 주어지고, 자른 쇠막대기의 개수를 리턴하는 함수를 작성하라.

 */
public class IronBar {
    public int getIronBar(String arrangement) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        String [] array = arrangement.split("");

        for(int i = 0; i < array.length; i++) {
            if(array[i].equals("(")) stack.push(array[i]);
            else {
                if (array[i-1].equals("(")){
                    stack.pop();
                    answer += stack.size();
                } else{
                    answer += 1;
                    stack.pop();
                }
            }
        }
        return answer;
    }

}
