package baekJoonTest.stackTest;

import baekJoon.stack.ValidPs;
import baekJoon.stack.Zero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {

    private Zero zero;
    private ValidPs validPs;

    @BeforeEach
    void setUp() {
        zero = new Zero();
        validPs = new ValidPs();
    }


    @Test
    public void getZero() {
        assertThat(zero.getZeroStack(new int[]{1, 3, 5, 4, 0, 0, 7, 0, 0, 6}), is(7));
    }

    @Test
    public void getValidParenthesisString() {
        assertThat(validPs.getValidPs(new String[]{"(())())"}), is("NO"));
        assertThat(validPs.getValidPs(new String[]{"(((()())()"}), is("NO"));
        assertThat(validPs.getValidPs(new String[]{"(()())((()))"}), is("YES"));
        assertThat(validPs.getValidPs(new String[]{"((()()(()))(((())))()"}), is("NO"));
        assertThat(validPs.getValidPs(new String[]{"()()()()(()()())()"}), is("YES"));
        assertThat(validPs.getValidPs(new String[]{"(()((())()("}), is("NO"));
    }
}
