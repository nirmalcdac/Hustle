package Sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }

    @Test
    public void testMergeSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }

    @Test
    public void testMergeSortSingleElement() {
        int[] arr = {1};
        int[] expected = {1};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }
}
