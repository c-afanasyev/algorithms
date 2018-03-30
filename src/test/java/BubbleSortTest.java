import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BubbleSortTest {
    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new Integer[] {12,11,10,9,8,7,6,5,4,3,2,1,0}, new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12} },
                { new Integer[] {-1,12,5,4,0,8,16,22,22,5,4}, new Integer[] {-1,0,4,4,5,5,8,12,16,22,22} },
                { new Integer[] {17,99,-128,-648,-772,-99999}, new Integer[] {-99999,-772,-648,-128,17,99} }
        });
    }

    @Parameterized.Parameter(0)
    public Integer[] input;

    @Parameterized.Parameter(1)
    public Integer[] expected;

    @Test
    public void bubbleSort() {
        assertArrayEquals(expected, BubbleSort.bubbleSort(input));
    }
}