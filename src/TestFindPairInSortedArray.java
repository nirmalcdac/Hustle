public class TestFindPairInSortedArray {
    public static void main(String[] args) {
//        int[] intArray = new int[]{1, 2, 3, 9};
        int[] intArray = new int[]{1, 2, 4, 4};
        int target = 8;
        findPair(intArray, target);
    }

    private static void findPair(int[] intArray, int target) {
        int j = intArray.length - 1;
        boolean flag = false;
        if (intArray.length < 2) {
            System.out.println("Not enough Elements");
        } else {
            if (intArray.length == 2 && intArray[0] + intArray[1] == target) {
                System.out.println("Pair Found at index 0 and 1");
            } else if (intArray.length == 2 && intArray[0] + intArray[1] != target) {
                System.out.println("No Pair Found");
            } else {
                for (int i = 0; !flag; ) {
                    if (intArray[i] + intArray[j] == target) {
                        System.out.println("Pair Found");
                        System.out.println(i + " " + j);
                        flag = true;
                    }
                    if (intArray[i] + intArray[j] > target) {
                        j--;
                    } else {
                        i++;
                    }
                    if (i == j && !flag) {
                        System.out.println("No Pair Found");
                        break;
                    }
                }
            }
        }
    }
}
