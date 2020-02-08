import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
// 1 + 2 = 3
// Calculator
// plus(x, y)
// => plus(1, 2) => 3
// minus(x, y)
// multiply(x, y)
// Divide(x, y)
// lhs, rhs
// lhs operator rhs
// lhs = rhs
// fibonacci => 1 1 2 3 5 8 13 21 34 55

// TDD
// 1. Red
// 2. Green -> 3
// 3. Refactoring -> 1 + 2 -> x + y => Clean Code

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void plus() {
        assertThat(calculator.plus(2, 3), is(5));
        assertThat(calculator.plus(2, -3), is(-1));
    }

    @Test
    public void minus() {
        assertThat(calculator.minus(5, 3), is(2));
        assertThat(calculator.minus(5, -3), is(8));
    }

    @Test
    public void multiplay() {
        assertThat(calculator.multiply(5, 3), is(15));
    }

    @Test
    public void fibonacciNormal() {
        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        IntStream.range(0, numbers.length).forEach(i -> {
            assertThat(calculator.fib(i), is(numbers[i]));

        });
    }

    @Test
    public void fibonacciError() {
        assertThat(calculator.fib(-1), is(0));
        assertThat(calculator.fib(-100), is(0));
    }
}
