package GooglePreperation;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LC20Test {

    LC20 lc20 = new LC20();

    @Test
    public void testIsValidOne() {
        assertTrue(lc20.isValidOne("()"));
        assertTrue(lc20.isValidOne("()[]{}"));
        assertFalse(lc20.isValidOne("(]"));
    }

    @Test
    public void testIsValidTwo() {
        assertTrue(lc20.isValidTwo("()"));
        assertTrue(lc20.isValidTwo("()[]{}"));
        assertFalse(lc20.isValidTwo("(]"));
    }

    @Test
    public void testIsValidThree() {
        assertTrue(lc20.isValidThree("()"));
        assertTrue(lc20.isValidThree("()[]{}"));
        assertFalse(lc20.isValidThree("(]"));
    }
}
