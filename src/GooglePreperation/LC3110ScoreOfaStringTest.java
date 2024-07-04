package GooglePreperation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LC3110ScoreOfaStringTest {
    LC3110ScoreOfaString lc3110ScoreOfaString = new LC3110ScoreOfaString();

    @Before
    public void init() {
    }

    @Test
    public void testPositiveCase() {
        Assert.assertEquals(lc3110ScoreOfaString.getScoreOfString("hello"), 13);
    }

    @Test
    public void testPositiveCaseShortString() {
        Assert.assertEquals(lc3110ScoreOfaString.getScoreOfString("zaz"), 50);
    }

    @Test
    public void testNegetiveCase() {
        Assert.assertNotEquals(lc3110ScoreOfaString.getScoreOfString("zaz"), 51);
    }
}
