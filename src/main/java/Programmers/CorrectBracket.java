package Programmers;

/**
 * 2020. 02. 04.
 * 문제 : 올바른 괄호
 * 올바른 괄호는 '('로 열리면 반드시 ')'로 닫혀야 한다.
 * 올바른 괄호이면 true, 아니면 false를 리턴하라
 * s : "()()"
 * answer : true
 */
public class CorrectBracket {
    public boolean getCorrectBracket(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(0).equals(")")) return false;
            num = (s.substring(i, i+1).equals("(")) ? num + 1 : num-1;
            if (num < 0) return false;
        }
        return num == 0;
    }
}
