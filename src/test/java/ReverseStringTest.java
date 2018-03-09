import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void reverseString() throws Exception {
        assertEquals(new StringBuilder("Hello, World!").reverse().toString(),
                ReverseString.reverseString("Hello, World!"));
    }

}