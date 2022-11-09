package EveryDayTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class ServiceTest {
    Service service = new Service();
    @Before
    public void init() {
        testServiceReg();
    }
    @Test
    public void testServiceReg() {
        this.service.serviceMap.clear();
        Assert.assertEquals(this.service.addEntry("Address1", "instance1"), "instance1");
        Assert.assertEquals(this.service.addEntry("Address2", "instance2"), "instance2");
        Assert.assertEquals(this.service.addEntry("Address3", "instance3"), "instance3");
        Assert.assertEquals(this.service.addEntry("Address3", "instance3"), "Duplicate Entry");
        Assert.assertEquals(this.service.addEntry("Address4", "instance4"), "instance4");
        Assert.assertEquals(this.service.addEntry("Address5", "instance5"), "instance5");
        Assert.assertEquals(this.service.addEntry("Address6", "instance6"), "instance6");
        Assert.assertEquals(this.service.addEntry("Address7", "instance7"), "instance7");
        Assert.assertEquals(this.service.addEntry("Address8", "instance8"), "instance8");
        Assert.assertEquals(this.service.addEntry("Address9", "instance9"), "instance9");
        Assert.assertEquals(this.service.addEntry("Address10", "instance10"), "instance10");
        Assert.assertEquals(this.service.addEntry("Address11", "instance1"), "Can Not Add More entries");
    }
    @Test
    public void testGet() {
        Assert.assertNotEquals(this.service.get(), this.service.get());
    }
}