package EveryDayTest;

public class TestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 7, 5};
        int s = intArray.length;
        int sum = 12;
        subArraySum(intArray, s, sum);

    }

    private static int subArraySum(int[] intArray, int s, int sum) {
        int currentSum = intArray[0], start = 0, i;
        for (i = 1; i <= s; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - intArray[start];
                start++;
            }
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println("Sum found between indexes " + start + " and " + p);
                return 1;
            }
            if (i < s)
                currentSum = currentSum + intArray[i];
        }
        System.out.println("No subArray found");
        return 0;
    }
}