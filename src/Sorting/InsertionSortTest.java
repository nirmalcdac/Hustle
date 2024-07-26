package Sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSortSingleElement() {
        int[] arr = {1};
        int[] expected = {1};
        assertArrayEquals(expected, InsertionSort.insertionSort(arr));
    }

    @Test
    public void testInsertionSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, InsertionSort.insertionSort(arr));
    }
}
