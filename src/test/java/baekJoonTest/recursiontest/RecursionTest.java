package baekJoontest.recursiontest;


import baekJoon.recursion.FactorialRec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RecursionTest {

    private FactorialRec factorialRec;

    @BeforeEach
    void setUp() {
        factorialRec = new FactorialRec();
    }

    @Test
    public void getFactorialRecTest() {
        assertThat(factorialRec.getFactorialRec(10), is(3628800));
        assertThat(factorialRec.getFactorialRec(5), is(120));
    }
}
