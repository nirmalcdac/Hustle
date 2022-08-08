public class RemoveDuplicateSortedArray {
    //Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int size = intArray.length;
        int count = 1;
        for (int i = 0, j = i + 1; j < size; j++) {
            if (intArray[i] < intArray[j]) {
                i++;
                intArray[i] = intArray[j];
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(intArray[i]);
        }
    }
}