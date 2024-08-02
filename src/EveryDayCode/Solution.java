package EveryDayCode;

public class Solution {
    public static void main(String[] args) {
//        int [] intArray = new int []{1,3,2,8,4,9};
//        int fee = 2;
        int[] intArray = new int[]{1, 3, 7, 5, 10, 3};
        int fee = 3;

        System.out.println(maxProfit(intArray, fee));
    }

    public static int maxProfit(int[] prices, int fee) {
        int temp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (temp < applyFee(prices[j] - prices[i], fee)) {
                    temp = applyFee(prices[j] - prices[i], fee);
                }
            }
        }
        return temp;
    }

    private static int applyFee(int number, int fee) {
        return number - fee;
    }


}
