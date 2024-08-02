package EveryDayCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates_EmptyString() {
        assertEquals("", RemoveDuplicate.removeDuplicates(""), "Expected empty string for empty input");
    }

    @Test
    public void testRemoveDuplicates_SingleCharacter() {
        assertEquals("a", RemoveDuplicate.removeDuplicates("a"), "Expected 'a' for input 'a'");
    }

    @Test
    public void testRemoveDuplicates_NoDuplicates() {
        assertEquals("abcdef", RemoveDuplicate.removeDuplicates("abcdef"), "Expected 'abcdef' for input 'abcdef'");
    }

    @Test
    public void testRemoveDuplicates_AllDuplicates() {
        assertEquals("a", RemoveDuplicate.removeDuplicates("aaaaaa"), "Expected 'a' for input 'aaaaaa'");
    }

    @Test
    public void testRemoveDuplicates_MixedDuplicates() {
        assertEquals("abcde", RemoveDuplicate.removeDuplicates("abbacdbbea"), "Expected 'abcde' for input 'abbacdbbea'");
    }

    @Test
    public void testRemoveDuplicates_SpecialCharacters() {
        assertEquals("a!@#", RemoveDuplicate.removeDuplicates("a!@#!@#a"), "Expected 'a!@#' for input 'a!@#!@#a'");
    }

    @Test
    public void testRemoveDuplicates_NumericCharacters() {
        assertEquals("123", RemoveDuplicate.removeDuplicates("112233"), "Expected '123' for input '112233'");
    }

    @Test
    public void testRemoveDuplicates_Alphanumeric() {
        assertEquals("abc123", RemoveDuplicate.removeDuplicates("abc123abc123"), "Expected 'abc123' for input 'abc123abc123'");
    }

    @Test
    public void testRemoveDuplicates_UpperLowerCase() {
        assertEquals("aAbBcC", RemoveDuplicate.removeDuplicates("aAbBcCaA"), "Expected 'aAbBcC' for input 'aAbBcCaA'");
    }
}
