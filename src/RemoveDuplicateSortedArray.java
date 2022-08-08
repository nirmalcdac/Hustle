public class RemoveDuplicateSortedArray {
    //Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = extracted(intArray);
        for (int i = 0; i < count; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static int extracted(int[] intArray) {
        int size = intArray.length;
        int count = 1;
        if (size == 1) {
            return 1;
        } else if (size == 2) {
            if (intArray[0] == intArray[1]) {
                return 1;
            } else {
                return 2;
            }
        } else {
            for (int i = 0, j = i + 1; j < size; j++) {
                if (intArray[i] < intArray[j]) {
                    i++;
                    intArray[i] = intArray[j];
                    count++;
                }
            }
            return count;
        }
    }
}