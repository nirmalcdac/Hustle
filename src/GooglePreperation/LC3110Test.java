package GooglePreperation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LC3110Test {

    @Before
    public void init() {
    }

    @Test
    public void testPositiveCase() {
        Assert.assertEquals(LC3110.getScoreOfString("hello"), 13);
    }

    @Test
    public void testPositiveCaseShortString() {
        Assert.assertEquals(LC3110.getScoreOfString("zaz"), 50);
    }

    @Test
    public void testNegativeCase() {
        Assert.assertNotEquals(LC3110.getScoreOfString("zaz"), 51);
    }
}
