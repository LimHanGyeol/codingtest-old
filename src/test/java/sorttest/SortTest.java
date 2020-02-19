package sorttest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sort.SelectionSort;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTest {

    private SelectionSort selectionSort;

    @BeforeEach
    void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void getSelectionSortTest() {
        assertThat(SelectionSort.selectionSortMax(new int[] {5, 6, 2, 8, 7, 23, 4, 1}, 8), is(new int[]{1, 2, 4, 5, 6, 7, 8, 23}));
        assertThat(SelectionSort.selectionSortMin(new int[] {5, 6, 2, 8, 7, 23, 4, 1}, 8), is(new int[]{1, 2, 4, 5, 6, 7, 8, 23}));
    }
}
