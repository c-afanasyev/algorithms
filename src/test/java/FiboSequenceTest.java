import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FiboSequenceTest {
    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new Integer[] {123}, new Integer[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144} },
                { new Integer[] {1}, new Integer[] {1,1} },
                { new Integer[] {555}, new Integer[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610} }
        });
    }

    @Parameterized.Parameter(0)
    public Integer[] input;

    @Parameterized.Parameter(1)
    public Integer[] expected;

    @Test
    public void getFiboSequence() throws Exception {
        assertArrayEquals(FiboSequence.getFiboSequence(input[0]), expected);
    }

}