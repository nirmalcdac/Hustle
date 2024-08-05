package GooglePreperation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LC2325Test {

    @Test
    public void testDecodeMessageWithExample() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String expected = "this is a secret";
        assertEquals(expected, LC2325.decodeMessage(key, message));
    }

    @Test
    public void testDecodeMessageWithEmptyMessage() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "";
        String expected = "";
        assertEquals(expected, LC2325.decodeMessage(key, message));
    }

    @Test
    public void testDecodeMessageWithSingleCharacter() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "b";
        String expected = "i";
        assertEquals(expected, LC2325.decodeMessage(key, message));
    }

    @Test
    public void testDecodeMessageWithAllSpaces() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "     ";
        String expected = "     ";
        assertEquals(expected, LC2325.decodeMessage(key, message));
    }

    @Test
    public void testDecodeMessageWithDifferentKey() {
        String key = "abcdefghijklmnopqrstuvwxyz";
        String message = "vkbs bs t suepuv";
        String expected = "vkbs bs t suepuv";
        assertEquals(expected, LC2325.decodeMessage(key, message));
    }

    @Test
    public void testDecodeMessageWithRepeatedCharactersInKey() {
        String key = "the the the the the the the the the the";
        String message = "eee";
        String expected = "ccc";
        assertEquals(expected, LC2325.decodeMessage(key, message));
    }

    @Test
    public void testDecodeMessageWithSpecialCharactersInKey() {
        String key = "the@quick#brown$fox%jumps^over&the*lazy(dog)";
        String message = "vkbs bs t suepuv";
        String expected = "yikw kw a wfcvfy";
        assertEquals(expected, LC2325.decodeMessage(key, message));
    }
}
