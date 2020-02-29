package programmerstest.level2test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level2.Fibonacci;
import programmers.level2.ExpressOfNumber;
import programmers.level2.MaxAndMin;
import programmers.level2.Tower;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Level2Test {

    private MaxAndMin maxAndMin;
    private Tower tower;
    private ExpressOfNumber expressOfNumber;
    private Fibonacci fibonacci;


    @BeforeEach
    void setUp() {
        maxAndMin = new MaxAndMin();
        tower = new Tower();
        expressOfNumber = new ExpressOfNumber();
        fibonacci = new Fibonacci();
    }

    @Test
    public void getMaxAndMin() {
        assertThat(maxAndMin.getMaxMin("1 2 3 4"), is("1 4"));
        assertThat(maxAndMin.getMaxMin("-1 -2 -3 -4"), is("-4 -1"));
        assertThat(maxAndMin.getMaxMin("-1 -1"), is("-1 -1"));
    }

    @Test
    public void getTower() {
        assertThat(tower.getTower(new int[]{6, 9, 5, 7, 4}), is(new int[] {0, 0, 2, 2, 4}));
        assertThat(tower.getTower(new int[]{3, 9, 9, 3, 5, 7, 2}), is(new int[] {0, 0, 0, 3, 3, 3, 6}));
        assertThat(tower.getTower(new int[]{1, 5, 3, 6, 7, 6, 5}), is(new int[] {0, 0, 2, 0, 0, 5, 6}));
    }

    @Test
    public void getExpressOfNumberTest() {
        assertThat(expressOfNumber.getExpressOfNumber(15), is(4));
    }

    @Test
    public void getFibonacciTest() {
        assertThat(fibonacci.getFibonacci(5), is(5));
        assertThat(fibonacci.getFibonacci(3), is(2));
        assertThat(fibonacci.getFibonacci(10), is(55));
    }

}
