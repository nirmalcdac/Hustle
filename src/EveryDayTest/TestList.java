package EveryDayTest;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10000);
        myList.add(5000);
        myList.add(6000);
        myList.add(4000);
        myList.add(8000);
        int x = myList.stream().filter(a -> a >= 5000).toList().size();
        System.out.println(x);
    }
}
