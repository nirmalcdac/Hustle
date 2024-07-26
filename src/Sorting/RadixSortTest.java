package Sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RadixSortTest {

    @Test
    public void testRadixSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, RadixSort.radixSort(arr));
    }

    @Test
    public void testRadixSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, RadixSort.radixSort(arr));
    }

    @Test
    public void testRadixSortSingleElement() {
        int[] arr = {1};
        int[] expected = {1};
        assertArrayEquals(expected, RadixSort.radixSort(arr));
    }

    @Test
    public void testRadixSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, RadixSort.radixSort(arr));
    }
}
