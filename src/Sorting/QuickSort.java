package Sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {
        int pivotValue = arr[right];
        int partitionIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                int temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        int temp = arr[partitionIndex];
        arr[partitionIndex] = arr[right];
        arr[right] = temp;
        return partitionIndex;
    }
}
