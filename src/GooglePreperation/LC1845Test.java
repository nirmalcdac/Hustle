package GooglePreperation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LC1845Test {
    LC1845 lc1845;

    @Before
    public void setUp() {
        lc1845 = new LC1845(5); // Initializing with 5 seats
    }

    @Test
    public void testReserve() {
        assertEquals(1, lc1845.reserve());
        assertEquals(2, lc1845.reserve());
        assertEquals(3, lc1845.reserve());
        assertEquals(4, lc1845.reserve());
        assertEquals(5, lc1845.reserve());
    }

    @Test
    public void testUnreserved() {
        lc1845.reserve(); // reserve seat 1
        lc1845.reserve(); // reserve seat 2
        lc1845.unreserved(1); // unreserve seat 1
        assertEquals(1, lc1845.reserve()); // seat 1 should be reserved again
    }

    @Test
    public void testReserveAndUnreservedSequence() {
        assertEquals(1, lc1845.reserve());
        assertEquals(2, lc1845.reserve());
        lc1845.unreserved(1);
        assertEquals(1, lc1845.reserve());
        assertEquals(3, lc1845.reserve());
        lc1845.unreserved(2);
        lc1845.unreserved(1);
        assertEquals(1, lc1845.reserve());
        assertEquals(2, lc1845.reserve());
    }
}
