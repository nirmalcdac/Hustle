package EveryDayCode;

public class MaxProfit {
    public static void main(String[] args) {
//        int[] intArray = new int[]{7, 1, 5, 3, 6, 4};
        int [] intArray  = new int[]{7,6,4,3,1};

        System.out.println(generateProfit(intArray));
    }

    private static int generateProfit(int[] intArray) {
        int x = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] > intArray[i]) {
                    System.out.println("profit between i " + i + "and " + j + "=" + x);
                    if (intArray[j] - intArray[i] > x) {
                        x = intArray[j] - intArray[i];
                    }
                }
            }
        }
        return x;
    }
}
