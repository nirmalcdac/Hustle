public class SquareArray {
    public static void main(String[] args) {
//        int[] intArray = new int[]{1};
//        int[] intArray = new int[]{-4,-1,0,3,10};
        int[] intArray = new int[]{-7,-3,2,3,11};
        sortArray(intArray);
    }

    private static int[] sortArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray[i] * intArray[i];
        }
        int j = intArray.length - 1;
        int k = intArray.length - 1;
        int[] result = new int[intArray.length];
        if (intArray.length == 1) {
            return intArray;
        } else {
            for (int i = 0; i < j; ) {
                if (intArray[i] > intArray[j]) {
                    result[k] = intArray[i];
                    i++;
                    k--;
                }
                if (intArray[i] <= intArray[j]) {
                    result[k] = intArray[j];
                    k--;
                    j--;
                }
                if (i == j) {
                    result[k] = intArray[i];
                }
            }
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
            return result;
        }
    }
}
