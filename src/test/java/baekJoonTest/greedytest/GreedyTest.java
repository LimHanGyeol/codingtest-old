package baekJoontest.greedytest;

import baekJoon.greedy.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreedyTest {

    private Coin coin;

    @BeforeEach
    void setUp() {
        coin = new Coin();
    }

    @Test
    public void getCoinTest() {
        assertThat(coin.getCoin(4200, new int[]{1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000}), is(6));
        assertThat(coin.getCoin(4790, new int[]{1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000}), is(12));
        assertThat(coin.getCoin(5000, new int[]{1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000}), is(1));
    }
}
