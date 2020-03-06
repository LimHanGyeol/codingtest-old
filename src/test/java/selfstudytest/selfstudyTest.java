package selfstudytest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selfstudy.Question;
import selfstudy.Question2;
import selfstudy.Question3;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class selfstudyTest {

    Question question;
    Question3 question3;

    @BeforeEach
    void setUp() {
        question = new Question();
        question3 = new Question3();
    }

    @Test
    public void getintPrint() {
        assertThat(question.getString("linhangyeol"), is('i'));
    }
    @Test
    public void getSolutionTest() {
        assertThat(Question2.solution(4, "two"), is(8));
    }

    @Test
    public void getSolution3Test() {
        assertThat(Question2.solution3(268), is(5268));
        assertThat(Question2.solution3(670), is(6750));
        assertThat(Question2.solution3(0), is(50));
        assertThat(Question2.solution3(-999), is(-5999));
    }

    @Test
    public void getLostToNumberTest() {
        assertThat(question3.lostToNumber(new int[]{4, 99, 2, 6, 7, 13, 88, 76}, new int[]{6, 88, 13, 4, 99, 2, 7}), is(76));
        assertThat(question3.lostToNumber(new int[]{2, 94, 3, 42, 24, 1, 9, 95, 92}, new int[]{94, 3, 24, 1, 42, 2, 9, 95}), is(92));
        assertThat(question3.lostToNumber(new int[]{7, 2, 32, 80, 89, 57, 44, 61, 93}, new int[]{93, 44, 89, 80, 57, 2, 7, 32}), is(61));
    }

    @Test
    public void cookieWriteCheckTest() {
        assertThat(question3.cookieWriteCheck("cookie", "cooookieee"), is(true));
        assertThat(question3.cookieWriteCheck("cookie", "cokie"), is(false));
        assertThat(question3.cookieWriteCheck("cookie", "cookoie"), is(false));
    }
}
