package GooglePreperation;

public class PairSumFinderSortedArrayTest {
    public static void main(String[] args) {
        testFindPairs();
    }

    public static void testFindPairs() {
        // Test case 1
        int[] arr1 = {0, 1, 2, 2, 3, 0, 4, 2};
        int targetSum1 = 10;
        int numPairs1 = PairSumFinderSortedArray.findPairs(arr1, targetSum1);
        System.out.println("Number of pairs with sum " + targetSum1 + ": " + numPairs1); // Expected output: 0

        // Test case 2
        int[] arr2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int targetSum2 = 11;
        int numPairs2 = PairSumFinderSortedArray.findPairs(arr2, targetSum2);
        System.out.println("Number of pairs with sum " + targetSum2 + ": " + numPairs2); // Expected output: 0

        // Test case 3
        int[] arr3 = {0, 1, 2, 2, 3, 0, 4, 2};
        int targetSum3 = 12;
        int numPairs3 = PairSumFinderSortedArray.findPairs(arr3, targetSum3);
        System.out.println("Number of pairs with sum " + targetSum3 + ": " + numPairs3); // Expected output: 0

        // Test case 4
        int[] arr4 = {1, 4, 4, 5, 5, 5, 6, 6, 11};
        int targetSum4 = 10;
        int numPairs4 = PairSumFinderSortedArray.findPairs(arr4, targetSum4);
        System.out.println("Number of pairs with sum " + targetSum4 + ": " + numPairs4); // Expected output: 6

        // Test case 5
        int[] arr5 = {1, 4, 4, 5, 5, 5, 6, 6, 11};
        int targetSum5 = 11;
        int numPairs5 = PairSumFinderSortedArray.findPairs(arr5, targetSum5);
        System.out.println("Number of pairs with sum " + targetSum5 + ": " + numPairs5); // Expected output: 9
    }
}