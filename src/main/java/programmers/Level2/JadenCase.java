package programmers.level2;

public class JadenCase {

    public String getJadenCase1(String s) {
        StringBuffer answer = new StringBuffer();
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer.append(flag ? ss.toUpperCase() : ss);
            flag = ss.equals(" ") ? true : false;
        }

        return answer.toString();
    }

    public String getJadenCase2(String s) {
        boolean isNextUpper = true;
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (i == 0 || isNextUpper) {
                answer.append(Character.toUpperCase(chr));
                isNextUpper = false;
            } else {
                answer.append(Character.toLowerCase(chr));
            }

            if (chr == ' ') {
                isNextUpper = true;
            }
        }
        return answer.toString();
    }
}
