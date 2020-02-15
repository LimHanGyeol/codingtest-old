package baekJoontest.stringtest;

import baekJoon.string.RepeatString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class StringTest {

    private RepeatString repeatString;

    @BeforeEach
    void setUp() {
        repeatString = new RepeatString();
    }

    @Test
    public void getSumOfNumbersTest() {
        assertThat(repeatString.getSumOfNumbers("3 ABC"), is("AAABBBCCC"));
        assertThat(repeatString.getSumOfNumbers("5 /HTP"), is("/////HHHHHTTTTTPPPPP"));
        assertNotNull(repeatString);
    }
}
