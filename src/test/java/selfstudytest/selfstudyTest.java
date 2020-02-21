package selfstudytest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selfstudy.Question;
import selfstudy.Question2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class selfstudyTest {

    Question question;

    @BeforeEach
    void setUp() {
        question = new Question();
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
}
