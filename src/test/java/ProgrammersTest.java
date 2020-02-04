import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.matchers.JUnitMatchers;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProgrammersTest {

    private FirstGradeStudent firstGradeStudent;
    private HateSameNumber hateSameNumber;
    private StringSort stringSort;

    @BeforeEach
    void setUp() {
        firstGradeStudent = new FirstGradeStudent();
        hateSameNumber = new HateSameNumber();
        stringSort = new StringSort();
    }

    @Test
    public void getFirstGradeStudent() {
        assertThat(firstGradeStudent.getFirstGradeStudent(new int[]{1, 2, 3, 4, 5}), is(new int[]{1}));
        assertThat(firstGradeStudent.getFirstGradeStudent(new int[]{1, 3, 2, 4, 2}), is(new int[]{1, 2, 3}));
    }

    @Test
    public void getHateSameNumber() {
        assertThat(hateSameNumber.getHateSameNumber(new int[]{1, 1, 3, 3, 0, 1, 1}), is(new int[]{1, 3, 0, 1}));
        assertThat(hateSameNumber.getHateSameNumber(new int[]{4, 4, 4, 3, 3}), is(new int[]{4, 3}));
    }

    @Test
    public void getStringSortResult() {
        assertThat(stringSort.getStringSortResult(new String[]{"sun", "bed", "car"}, 1), is(new String[]{"car", "bed", "sun"}));
        ;
    }

}
