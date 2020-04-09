package selfstudy;

public class Question8 {

    public int solution(int start, int end) {
        int maxCount = 0;
        for (int i = start; i <= end; i++) {
            int count = countSquareRoot(i, 0);
            if (maxCount < count) maxCount = count;
        }
        return maxCount;
    }

    private int countSquareRoot(int number, int count) {
        double sqrt = Math.sqrt(number);
        if (isIntegerCheck(sqrt)) {
            return countSquareRoot((int) sqrt, count + 1);
        }
        return count;
    }

    private boolean isIntegerCheck(double number) {
        return number - (int) number == 0;
    }

    public static boolean isPalindrome(String arg) {
        int length = arg.length() - 1;
        for (int i = 0; i < arg.length()/2; i++, length--) {
            if (arg.charAt(i) != arg.charAt(length)) {
                return false;
            }
            break;
        }
        return true;
    }
}
