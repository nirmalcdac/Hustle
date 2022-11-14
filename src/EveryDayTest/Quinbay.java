package EveryDayTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quinbay {
    public static void main(String[] args) {
        int number = 29;
        int[][] intArray = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int i = 0;
        for (int j = intArray.length - 1; j > 0; ) {
            int temp = intArray[i][j];
            if (temp > number) {
                j--;
            } else if (temp == number) {
                System.out.println(temp + " i=" + i + " j=" + j);
                break;
            } else {
                if (i == intArray.length - 1) {
                    System.out.println("Number not found");
                    break;
                } else {
                    i++;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(12);
        list = list.stream()
                .map(o -> o * o)
                .filter(n -> n > 100).collect(Collectors.toList());
        list.forEach(System.out::println);
        //DRAWBACK OF INDEX
    }
}
