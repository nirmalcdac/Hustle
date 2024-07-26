package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class RadixSort {
    public static int[] radixSort(int[] arr) {
        int maxDigits = getMaxDigits(arr);
        for (int i = 0; i < maxDigits; i++) {
            ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(Collections.nCopies(10, new ArrayList<>()));
            for (int k : arr) {
                int digit = getDigit(k, i);
                buckets.get(digit).add(k);
            }
            int index = 0;
            for (ArrayList<Integer> bucket : buckets) {
                for (int num : bucket) {
                    arr[index++] = num;
                }
            }
        }
        return arr;
    }

    private static int getMaxDigits(int[] arr) {
        int maxDigits = 0;
        for (int num : arr) {
            maxDigits = Math.max(maxDigits, Integer.toString(num).length());
        }
        return maxDigits;
    }

    private static int getDigit(int num, int place) {
        return (int) (Math.abs(num) / Math.pow(10, place)) % 10;
    }
}
