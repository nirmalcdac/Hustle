package EveryDayTest;

import java.util.HashMap;
import java.util.Map;

public class TestFindPairInUnsortedArrayUsingMap {
    public static void main(String[] args) {
        int[] intArray = new int[]{6, 1, 7, 15, 11, 9};
        int target = 10;
//      int[] intArray = new int[]{1, 2, 4, 4};
//      int[] intArray = new int[]{1, 2, 3, 9};
//      int target = 8;
        findPair(intArray, target);
    }

    private static void findPair(int[] intArray, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        if (intArray.length < 2) {
            System.out.println("Not enough Elements");
        } else {
            if (intArray.length == 2 && intArray[0] + intArray[1] == target) {
                System.out.println("Pair Found at index 0 and 1");
            } else if (intArray.length == 2 && intArray[0] + intArray[1] != target) {
                System.out.println("No Pair Found");
            } else {
                for (int i = 0; i < intArray.length; i++) {
                    if (map.containsKey(target - intArray[i])) {
                        flag = true;
                        System.out.println("Pair Found at " + map.get(target - intArray[i]) + " " + i);
                    } else {
                        map.put(intArray[i], i);
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("No Pair Found");
        }
    }
}