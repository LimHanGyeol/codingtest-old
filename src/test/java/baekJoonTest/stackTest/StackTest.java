package baekJoonTest.stackTest;

import baekJoon.stack.BalancedWorld;
import baekJoon.stack.ValidPs;
import baekJoon.stack.Zero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StackTest {

    private Zero zero;
    private ValidPs validPs;
    private BalancedWorld balancedWorld;

    @BeforeEach
    void setUp() {
        zero = new Zero();
        validPs = new ValidPs();
        balancedWorld = new BalancedWorld();
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

    @Test
    public void getBalancedWorldTest() {
        assertThat(balancedWorld.getBalancedWorld("So when I die (the [first] I will see in (heaven) is a score list)."), is("yes"));
        assertThat(balancedWorld.getBalancedWorld("[ first in ] ( first out )."), is("yes"));
        assertThat(balancedWorld.getBalancedWorld("Half Moon tonight (At least it is better than no Moon at all]."), is("no"));
        assertThat(balancedWorld.getBalancedWorld("A rope may form )( a trail in a maze."), is("no"));
        assertThat(balancedWorld.getBalancedWorld("Help( I[m being held prisoner in a fortune cookie factory)]."), is("no"));
        assertThat(balancedWorld.getBalancedWorld("([ (([( [ ] ) ( ) (( ))] )) ])."), is("yes"));
        assertThat(balancedWorld.getBalancedWorld(" ."), is("yes"));
        assertThat(balancedWorld.getBalancedWorld("."), is("yes"));
    }
}
