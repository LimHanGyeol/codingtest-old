package programmers.level1;

public class SumBetweenTwoInteger {

    public long getSumBetweenTwoInteger(int a, int b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        return sumTwoInteger(max, min);
    }

    public long sumTwoInteger(long max, long min) {
        int returnValue = 0;
        for (long i = min; i <= max; i++)
            returnValue+= i;
        return returnValue;
    }
}
