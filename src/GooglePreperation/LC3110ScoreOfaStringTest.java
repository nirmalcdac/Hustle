package GooglePreperation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LC3110ScoreOfaStringTest {

    @Before
    public void init() {
    }

    @Test
    public void testPositiveCase() {
        Assert.assertEquals(LC3110ScoreOfaString.getScoreOfString("hello"), 13);
    }

    @Test
    public void testPositiveCaseShortString() {
        Assert.assertEquals(LC3110ScoreOfaString.getScoreOfString("zaz"), 50);
    }

    @Test
    public void testNegetiveCase() {
        Assert.assertNotEquals(LC3110ScoreOfaString.getScoreOfString("zaz"), 51);
    }
}
