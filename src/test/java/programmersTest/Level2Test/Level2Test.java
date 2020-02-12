package ProgrammersTest.Level2Test;
import Programmers.Level1.FirstGradeStudent;
import Programmers.Level1.GymClothes;
import Programmers.Level1.HateSameNumber;
import Programmers.Level1.StringSort;
import Programmers.Level2.CorrectBracket;
import Programmers.Level2.MaxAndMin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Level2Test {

    private MaxAndMin maxAndMin;

    @BeforeEach
    void setUp() {
        maxAndMin = new MaxAndMin();
    }

    @Test
    public void getMaxAndMin() {
        assertThat(maxAndMin.getMaxMin("1 2 3 4"), is("1 4"));
        assertThat(maxAndMin.getMaxMin("-1 -2 -3 -4"), is("-4 -1"));
        assertThat(maxAndMin.getMaxMin("-1 -1"), is("-1 -1"));
    }
}
