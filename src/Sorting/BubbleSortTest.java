package Sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testBubbleSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testBubbleSortSingleElement() {
        int[] arr = {1};
        int[] expected = {1};
        assertArrayEquals(expected, BubbleSort.bubbleSort(arr));
    }

    @Test
    public void testBubbleSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, BubbleSort.bubbleSort(arr));
    }
}
