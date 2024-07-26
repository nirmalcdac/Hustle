package EveryDayCode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomCacheTest {
    private CustomCache customCache;

    @BeforeEach
    public void setUp() {
        customCache = new CustomCache();
    }

    @Test
    public void testGetVal_EmptyMap() {
        assertNull(customCache.getVal("key1"), "Expected null when map is empty");
    }

    @Test
    public void testGetVal_NonExistingKey() {
        customCache.putVal("key1", "value1");
        assertNull(customCache.getVal("key2"), "Expected null when key does not exist");
    }

    @Test
    public void testGetVal_ExistingKey() {
        customCache.putVal("key1", "value1");
        assertEquals("value1", customCache.getVal("key1"), "Expected 'value1' for key 'key1'");
    }

    @Test
    public void testPutVal_NewKey() {
        assertNull(customCache.putVal("key1", "value1"), "Expected null when inserting new key");
        assertEquals("value1", customCache.getVal("key1"), "Expected 'value1' for key 'key1'");
    }

    @Test
    public void testPutVal_ExistingKey() {
        customCache.putVal("key1", "value1");
        assertEquals("value1", customCache.putVal("key1", "value2"), "Expected 'value1' when updating existing key");
        assertEquals("value2", customCache.getVal("key1"), "Expected 'value2' for key 'key1'");
    }

    @Test
    public void testPutVal_MapFull() {
        for (int i = 0; i < customCache.size; i++) {
            customCache.putVal("key" + i, "value" + i);
        }
        assertEquals("Map is full", customCache.putVal("key101", "value101"), "Expected 'Map is full' when adding to a full map");
    }
}