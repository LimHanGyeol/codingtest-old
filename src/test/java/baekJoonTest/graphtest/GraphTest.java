package baekJoontest.graphtest;

import baekJoon.graph.DfsAndBfs;
import baekJoon.graph.DfsAndBfs2;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GraphTest {

    private DfsAndBfs dfsAndBfs;

    @Before
    public void setUp() throws Exception {
        dfsAndBfs = new DfsAndBfs();
    }

    @Test
    public void getDfsTest() {
    }
}
