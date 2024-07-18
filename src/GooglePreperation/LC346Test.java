package GooglePreperation;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LC346Test {

    private LC346 lc346;

    @Before
    public void setUp() {
        lc346 = new LC346(3);  // Example window size
    }

    @Test
    public void testInitialAverage() {
        // Test the initial state where no elements have been added
        assertEquals(0.0, lc346.next(0));
    }

    @Test
    public void testSingleElement() {
        // Add a single element and check the average
        assertEquals(1.0, lc346.next(1));
    }


    @Test
    public void testTwoElements() {
        // Add two elements and check the average
        lc346.next(1);
        assertEquals(1.5, lc346.next(2));
    }

    @Test
    public void testThreeElements() {
        // Add three elements and check the average
        lc346.next(1);
        lc346.next(2);
        assertEquals(2.0, lc346.next(3));
    }

    @Test
    public void testMoreThanWindowSizeElements() {
        // Add more elements than the window size and check the average
        lc346.next(1);
        lc346.next(2);
        lc346.next(3);
        assertEquals(3.0, lc346.next(4)); // Average of [2, 3, 4]
        assertEquals(4.0, lc346.next(5)); // Average of [3, 4, 5]
    }

    @Test
    public void testWindowSizeOne() {
        // Test with window size of 1
        LC346 lc346_1 = new LC346(1);
        assertEquals(1.0, lc346_1.next(1));
        assertEquals(2.0, lc346_1.next(2));
        assertEquals(3.0, lc346_1.next(3));
    }

    @Test
    public void testWindowSizeZero() {
        // Test with window size of 0 (should handle gracefully, though not meaningful)
        LC346 lc346_0 = new LC346(0);
        assertEquals(Double.NaN, lc346_0.next(1));
    }

    @Test
    public void testAllZeros() {
        // Test when all elements are zeros
        lc346.next(0);
        lc346.next(0);
        assertEquals(0.0, lc346.next(0));
    }
}
