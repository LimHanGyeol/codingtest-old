package baekJoontest.sorttest;

import baekJoon.sort.IntegerSort;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTest {

    private IntegerSort integerSort;

    @Before
    public void setUp() throws Exception {
        integerSort = new IntegerSort();
    }

    @Test
    public void getIntegerSortTest() {
    }
}
