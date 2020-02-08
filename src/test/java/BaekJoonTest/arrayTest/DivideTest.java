package BaekJoonTest.arrayTest;

import BaekJoon.array.Divide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class DivideTest {

    private Divide divide;

    @BeforeEach
    void setUp() {
        divide = new Divide();
    }

    @Test
    public void getDivide() {
        assertThat(divide.getDivide(new int[]{39, 40, 41, 42, 43, 44, 82, 83, 84, 85}), is(6));
        assertNotNull(divide);
    }
}
