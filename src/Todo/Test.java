package Todo;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
* */
public class Test {
    public static void main(String[] args) {
        int[] intArray = new int[]{5, 2, 6, 1, 3, 9}; //8
        int j;
        for(int i=0;i<intArray.length;i++){
            j = i+1;
            if(intArray[j]>intArray[i]){
                i++;
            }
        }


//        int min = intArray[0];
//        int minIndex = 0;
//        int maxIndex = 0;
//        int max = intArray[1];
//        for(int i = 0;i< intArray.length;i++){
//            if(intArray[i]>max){
//                max = intArray[i];
//                maxIndex = i;
//            }
//            if(intArray[i]<min){
//                min = intArray[i];
//                minIndex = i;
//            }
//        }

        //519682
        /*
        1
        2
        3
        5
        6
        9
        * */

        for (int i = 0; i < intArray.length; i++) {

        }
        System.out.println(maxProfitOne(intArray));
    }

    private static int maxProfitOne(int[] ints) {
        int x = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] > ints[i]) {
                    if (ints[j] - ints[i] > x) {
                        x = ints[j] - ints[i];
                    }
                }
            }
        }
        return x;
    }
}
