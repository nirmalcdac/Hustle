package GooglePreperation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LC359Test {

    @Before
    public void init() {
        LC359 lc359 = new LC359();
    }

    @Test
    public void testPositiveCase() {
        Assert.assertTrue(LC359.shouldPrintMessage(1, "Foo"));
    }

    @Test
    public void testPositiveCaseShortString() {
        LC359.shouldPrintMessage(1, "Foo");
        Assert.assertTrue(LC359.shouldPrintMessage(2, "Bar"));
    }

    @Test
    public void testNegativeCase() {
        LC359.shouldPrintMessage(1, "Foo");
        LC359.shouldPrintMessage(2, "Bar");
        Assert.assertFalse(LC359.shouldPrintMessage(3, "Foo"));
    }
}
