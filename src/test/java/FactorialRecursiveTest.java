import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FactorialRecursiveTest {
    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {-10, 1},
                { -1, 1},
                { 0, 1},
                { 1, 1},
                { 2, 2},
                { 3, 6},
                { 4, 24},
                { 5, 120},
                { 6, 720},
                { 7, 5040}
        });
    }

    @Parameterized.Parameter(0)
    public int input;

    @Parameterized.Parameter(1)
    public int expected;

    @Test
    public void factorialRecursive() {
        assertEquals(expected, FactorialRecursive.factorialRecursive(input));
    }
}