package selfstudytest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selfstudy.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class selfstudyTest {

    private Question question;
    private Question3 question3;
    private Algorithm algorithm;
    private Question5 question5;
    private Question6 question6;
    private Question7 question7;
    private Question8 question8;

    @BeforeEach
    void setUp() {
        question = new Question();
        question3 = new Question3();
        algorithm = new Algorithm();
        question5 = new Question5();
        question6 = new Question6();
        question7 = new Question7();
        question8 = new Question8();
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

    @Test
    public void getConstantTimeComplextiyTest() {
        assertThat(algorithm.isConstantTimeComplexity(new int[]{1, 2, 3, 4, 5, 6}, 6), is(4));
    }

    @Test
    public void getLinearTimeComplexityTest() {
        assertThat(algorithm.isLinearTimeComplexity(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10), is(55));
    }

    @Test
    public void getSequentialSearchTest() {
        assertThat(algorithm.isSequentialSearch(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10), is(9));
    }

    @Test
    public void getQuadraticDistinctTest() {
        assertThat(algorithm.isQuadraticDistinct(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), is(true));
    }

    @Test
    public void getQuestion5Test() {
        assertThat(question5.solution(new int[]{3, 8, 2, 3, 3, 2}), is(3));
        assertThat(question5.solution(new int[]{7, 1, 2, 8, 2}), is(2));
        assertThat(question5.solution(new int[]{3, 1, 4, 1, 5}), is(0));
        assertThat(question5.solution(new int[]{5, 5, 5, 5, 5}), is(5));
        assertThat(question5.solution(new int[]{5, 5,5,5,5,3, 3, 3, 1, 4}), is(5));
    }

    @Test
    public void getQuestion6Test() {
        assertThat(question6.soulution(new int[]{51, 71, 17, 42}), is(93));
        assertThat(question6.soulution(new int[]{42, 33, 60}), is(102));
        assertThat(question6.soulution(new int[]{51, 32, 43}), is(-1));
        assertThat(question6.soulution(new int[]{72, 41, 45, 9}), is(117));
        assertThat(question6.soulution(new int[]{7, 42, 35, 9}), is(-1));
        assertThat(question6.soulution(new int[]{47, 83, 41, 50}), is(130));
        assertThat(question6.soulution(new int[]{44, 34, 61, 52, 89}), is(113));
    }

    @Test
    public void getQuestion7Test() {
        assertThat(question7.solution("MSSLS"), is("SSSML"));
        assertThat(question7.solution("LLMS"), is("SMLL"));
        assertThat(question7.solution("SMS"), is("SSM"));
    }

    @Test
    public void getQuetion8Test() {
        assertThat(question8.solution(10, 20), is(2));
        assertThat(question8.solution(6000, 7000), is(3));
    }
}
