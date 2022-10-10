package EveryDayTest;

import java.util.HashSet;

public class TestFindPairInUnsortedArray {
    public static void main(String[] args) {
//        int[] intArray = new int[]{1, 2, 4, 4};
        int[] intArray = new int[]{1, 2, 3, 9};
        int target = 8;
        findPairInUnsortedArray(intArray, target);
    }

    private static void findPairInUnsortedArray(int[] intArray, int target) {
        HashSet<Integer> set = new HashSet<>();
        boolean flag = false;
        if (intArray.length < 2) {
            System.out.println("Not enough Elements");
        } else {
            if (intArray.length == 2 && intArray[0] + intArray[1] == target) {
                System.out.println("Pair Found at index 0 and 1");
            } else if (intArray.length == 2 && intArray[0] + intArray[1] != target) {
                System.out.println("No Pair Found");
            } else {
                for (int j : intArray) {
                    if (set.contains(target - j)) {
                        System.out.println("Pair Found");
                        flag = true;
                    } else {
                        set.add(j);
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("No Pair Found");
        }
    }
}
