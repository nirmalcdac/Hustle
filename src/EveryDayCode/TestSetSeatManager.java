package EveryDayCode;

import java.util.SortedSet;
import java.util.TreeSet;

//https://leetcode.com/problems/seat-reservation-manager/
//Try to use ordered set
//Input
//["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]
//[[5], [], [], [2], [], [], [], [], [5]]
//Output
//[null, 1, 2, null, 2, 3, 4, 5, null]
public class TestSetSeatManager {
    static SortedSet<Integer> set = new TreeSet<Integer>();

    TestSetSeatManager(int n) {
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }
    }

    public static void main(String[] args) {
        int totalCapacity = 5;
        startRestaurant(totalCapacity);
        System.out.println(reserve());
        System.out.println(reserve());
        unReserve(2);
        System.out.println(reserve());
        System.out.println(reserve());
        System.out.println(reserve());
        System.out.println(reserve());
        unReserve(2);
    }

    private static void startRestaurant(int capacity) {
        TestSetSeatManager seatManager = new TestSetSeatManager(capacity);
    }

    private static void unReserve(int seatNumber) {
        set.add(seatNumber);
    }

    private static int reserve() {
        int temp = set.first();
        set.remove(set.first());
        return temp;
    }
}