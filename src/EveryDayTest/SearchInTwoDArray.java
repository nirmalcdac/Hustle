package EveryDayTest;

import java.util.Arrays;

/*
   TODO Let us assume that we have an mxn matrix A[][] such that:
    All the rows are in ascending order
    A[i][0] > A[i-1][n-1] for all i  such that 0 < i < m
    Given a matrix A and a key k, can we write a method to find if k exists in A
    M
    01, 02, 03 ,04
    11, 12 ,13 ,14
    21, 22, 23, 24 N
    31, 32, 33, 34
    Total elements are M x N, where M != N

*/
public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] ans = getIndex(arr);
        System.out.println("Element found at index: " + Arrays.toString(ans));
    }

    private static int[] getIndex(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int low = 0;
        int high = row * col - 1;
        while (low <= high) {
            int mid = low + (high - 1) / 2;
            int tc = mid % col;
            int tr = mid / col;
            int val = arr[tr][tc];
            if (val == 12) {
                return new int[]{tr, tc};
            } else if (val < 12) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
