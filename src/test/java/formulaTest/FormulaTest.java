package formulatest;

import formula.SumFormula;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FormulaTest {

    private SumFormula sumFormula;

    @BeforeEach
    void setUp() {
        sumFormula = new SumFormula();
    }

    @Test
    public void getSumFormula() {
        assertThat(sumFormula.sumFormula(10), is(55));
        assertThat(sumFormula.sumFormula(9), is(45));
        assertThat(sumFormula.sumFormula(100), is(5050));
        assertThat(sumFormula.sumFormula(99), is(5050));
    }

    @Test
    public void setSumFormulaRec() {
        assertThat(sumFormula.sumFormulaRec(10), is(55));
        assertThat(sumFormula.sumFormulaRec(100), is(5050));
        assertThat(sumFormula.sumFormulaRec(99), is(4950));
    }

}
