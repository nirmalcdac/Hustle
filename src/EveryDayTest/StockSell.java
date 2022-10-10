package EveryDayTest;

class StockSell {
    public static void main(String[] args) {
        int[] array = {1, 2, 10, 11, 3, 9, 15};
        System.out.println("Final Profit " + makeMaxProfit(array));
    }

    static int makeMaxProfit(int[] array) {
        int maxProfit = 0;
        for (int i = 1; i < array.length; i++)
            if (array[i] > array[i - 1]) {
                System.out.print("Total Profit " + maxProfit);
                System.out.println(" Today's Profit " + (array[i] - array[i - 1]));
                maxProfit = maxProfit + array[i] - array[i - 1];
            }
        return maxProfit;
    }
}
