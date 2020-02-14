package baekJoonTest.stackTest;

import baekJoon.stack.Zero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {

    private Zero zero;

    @BeforeEach
    void setUp() {
        zero = new Zero();
    }


    @Test
    public void getZero() {
        assertThat(zero.getZeroStack(new int[]{1, 3, 5, 4, 0, 0, 7, 0, 0, 6}), is(7));
    }
}
