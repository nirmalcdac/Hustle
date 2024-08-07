package EveryDayCode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringToNumberTest {
    @Before
    public void init() {
    }

    @Test
    public void testStringToNumber() {
        Assert.assertEquals(StringToNumber.getNumber("5432"), 5432);
    }

    @Test
    public void testStringToNumberNegative() {
        Assert.assertNotEquals(StringToNumber.getNumber("789"), 0);
    }
}
