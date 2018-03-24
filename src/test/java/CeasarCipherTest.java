import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarCipherTest {

    @Test
    public void cipher() {
        assertEquals("bcdefg", CeasarCipher.cipher("abcdef", 1));
        assertEquals("abcdef", CeasarCipher.cipher("bcdefg", -1));

        assertEquals("bCdEfG", CeasarCipher.cipher("aBcDeF", 1));
        assertEquals("aBcDeF", CeasarCipher.cipher("bCdEfG", -1));

        assertEquals("abcdef", CeasarCipher.cipher("abcdef", 0));

        assertEquals("abcdef", CeasarCipher.cipher("abcdef", 26));
        assertEquals("abcdef", CeasarCipher.cipher("abcdef", -26));

        assertEquals("bcdefg", CeasarCipher.cipher("abcdef", 79));
        assertEquals("abcdef", CeasarCipher.cipher("bcdefg", -79));

        assertEquals("bCdEfG", CeasarCipher.cipher("aBcDeF", 79));
        assertEquals("aBcDeF", CeasarCipher.cipher("bCdEfG", -79));
    }
}