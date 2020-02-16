package baekJoontest.stringtest;

import baekJoon.string.GroupWordCheck;
import baekJoon.string.RepeatString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class StringTest {

    private RepeatString repeatString;
    private GroupWordCheck groupWordCheck;

    @BeforeEach
    void setUp() {
        repeatString = new RepeatString();
        groupWordCheck = new GroupWordCheck();
    }

    @Test
    public void getSumOfNumbersTest() {
        assertThat(repeatString.getSumOfNumbers("3 ABC"), is("AAABBBCCC"));
        assertThat(repeatString.getSumOfNumbers("5 /HTP"), is("/////HHHHHTTTTTPPPPP"));
        assertNotNull(repeatString);
    }

    @Test
    public void getGroupWordCheckTest() {
        assertThat(groupWordCheck.getGroupWordCheck("happy"), is(true));
        assertThat(groupWordCheck.getGroupWordCheck("new"), is(true));
        assertThat(groupWordCheck.getGroupWordCheck("year"), is(true));
    }

}
