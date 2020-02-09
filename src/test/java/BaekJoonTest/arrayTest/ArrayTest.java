package BaekJoonTest.arrayTest;

import BaekJoon.array.Average;
import BaekJoon.array.Divide;
import BaekJoon.array.OxQuiz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayTest {

    private Divide divide;
    private Average average;
    private OxQuiz oxQuiz;

    @BeforeEach
    void setUp() {
        divide = new Divide();
        average = new Average();
        oxQuiz = new OxQuiz();
    }

    @Test
    public void getDivide() {
        assertNotNull(divide.getHashSet(new int[]{1, 2, 3}, new HashSet<>()));
        assertThat(divide.getDivide(new int[]{39, 40, 41, 42, 43, 44, 82, 83, 84, 85}), is(6));
    }

    @Test
    public void getAverage() {
        assertThat(average.getMaxValue(new int[]{1, 2, 3}), is(3));
        assertThat(average.getAverageUpdate(80, new int[]{40, 80, 60}), is(225.0));
        assertNotNull(average.getAverageUpdate(1, new int[]{1, 2}));


        assertThat(average.getAverage(3, new int[]{40, 80, 60}), is(75.00));
        assertThat(average.getAverage(4, new int[]{1, 100, 100, 100}), is(75.25));
        assertThat(average.getAverage(5, new int[]{1, 2, 4, 8, 16}), is(38.75));
        assertThat(average.getAverage(2, new int[]{3, 10}), is(65.00));
    }

    @Test
    public void getOxQuiz() {
        assertThat(oxQuiz.getOxQuiz(5
                , new String[]{"OOXXOXXOOO", "OOXXOOXXOO", "OXOXOXOXOXOXOX", "OOOOOOOOOO", "OOOOXOOOOXOOOOX"})
                , is(new int[]{10, 9, 7, 55, 30}));
    }
}
