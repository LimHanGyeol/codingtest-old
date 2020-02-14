package selfstudy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
