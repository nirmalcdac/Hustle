package GooglePreperation;

public class PairSumFinderSortedArray {
    public static int findPairs(int[] arr, int targetSum) {
        int count = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum < targetSum) {
                start++;
            } else if (sum > targetSum) {
                end--;
            } else {
                if (arr[start] == arr[end]) {
                    // All pairs between arr[start] and arr[end] (inclusive) are valid
                    int n = end - start + 1;
                    count += n * (n - 1) / 2;
                    break;
                } else {
                    int countStart = 1;
                    int countEnd = 1;
                    while (start + 1 < end && arr[start] == arr[start + 1]) {
                        countStart++;
                        start++;
                    }
                    while (end - 1 > start && arr[end] == arr[end - 1]) {
                        countEnd++;
                        end--;
                    }
                    count += countStart * countEnd;
                    start++;
                    end--;
                }
            }
        }

        return count;
    }
}