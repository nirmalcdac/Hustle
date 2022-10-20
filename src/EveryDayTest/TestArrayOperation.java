package EveryDayTest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class TestArrayOperation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
        int[] array = {9, 6, 3, 4, 10, 11, 7, 8, 1, 5};
        int sum = 0;
        for (int i = 0; i <= 11; i++) {
            sum = sum + i;
        }
        for (int j : array) {
            sum = sum - j;
        }
        System.out.println(sum);
    }
}