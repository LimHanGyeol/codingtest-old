package baekJoontest.stringtest;

import baekJoon.string.GroupWordCheck;
import baekJoon.string.RepeatString;
import baekJoon.string.WordStudy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringTest {

    private RepeatString repeatString;
    private GroupWordCheck groupWordCheck;
    private WordStudy wordStudy;

    @BeforeEach
    void setUp() {
        repeatString = new RepeatString();
        groupWordCheck = new GroupWordCheck();
        wordStudy = new WordStudy();
    }

    @Test
    public void getSumOfNumbersTest() {
        assertThat(repeatString.getSumOfNumbers("3 ABC"), is("AAABBBCCC"));
        assertThat(repeatString.getSumOfNumbers("5 /HTP"), is("/////HHHHHTTTTTPPPPP"));
    }

    @Test
    public void getGroupWordCheckTest() {
        assertThat(GroupWordCheck.getGroupWordCheck("aab"), is(true));
        assertThat(GroupWordCheck.getGroupWordCheck("new"), is(true));
        assertThat(GroupWordCheck.getGroupWordCheck("year"), is(true));
    }

    @Test
    public void getWordStudyTest() {
        assertThat(WordStudy.getWordStudy("zZa"), is("Z"));
        assertThat(WordStudy.getWordStudy("Mississipi"), is("?"));
        assertThat(WordStudy.getWordStudy("z"), is("Z"));
        assertThat(WordStudy.getWordStudy("baaa"), is("A"));
        assertThat(WordStudy.getWordStudy("KangKilHawn"), is("?"));
    }
}
