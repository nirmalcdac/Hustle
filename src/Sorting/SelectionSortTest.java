package Sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, SelectionSort.selectionSort(arr));
    }

    @Test
    public void testSelectionSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SelectionSort.selectionSort(arr));
    }

    @Test
    public void testSelectionSortSingleElement() {
        int[] arr = {1};
        int[] expected = {1};
        assertArrayEquals(expected, SelectionSort.selectionSort(arr));
    }

    @Test
    public void testSelectionSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, SelectionSort.selectionSort(arr));
    }
}
