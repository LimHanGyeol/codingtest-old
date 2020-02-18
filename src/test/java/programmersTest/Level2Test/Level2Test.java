package programmerstest.level2test;
import programmers.level2.Fibonacci;
import programmers.level2.Lcm;
import programmers.level2.MaxAndMin;
import programmers.level2.Tower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Level2Test {

    private MaxAndMin maxAndMin;
    private Tower tower;
    private Lcm lcm;
    private Fibonacci fibonacci;


    @BeforeEach
    void setUp() {
        maxAndMin = new MaxAndMin();
        tower = new Tower();
        lcm = new Lcm();
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
    }

    @Test
    public void getMultiLcm() {
        assertThat(lcm.getMultiLcm(new int[] {2, 6, 8, 14}), is(168));
    }

    @Test
    public void getFibonacciTest() {
        assertThat(fibonacci.getFibonacci(5), is(5));
        assertThat(fibonacci.getFibonacci(3), is(2));
    }

}
