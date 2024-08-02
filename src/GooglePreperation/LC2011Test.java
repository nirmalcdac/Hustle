package GooglePreperation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LC2011Test {
    LC2011 lc2011 = new LC2011();

    @Test
    public void testFinalValueAfterOperations() {
        // Test case 1
        String[] operations1 = {"++X", "++X", "X++"};
        assertEquals(3, lc2011.finalValueAfterOperations(operations1));

        // Test case 2
        String[] operations2 = {"--X", "X--", "--X"};
        assertEquals(-3, lc2011.finalValueAfterOperations(operations2));

        // Test case 3
        String[] operations3 = {"++X", "X--", "X++", "--X"};
        assertEquals(0, lc2011.finalValueAfterOperations(operations3));

        // Test case 4
        String[] operations4 = {"X++", "++X", "X--", "--X", "++X"};
        assertEquals(1, lc2011.finalValueAfterOperations(operations4));
    }
}
