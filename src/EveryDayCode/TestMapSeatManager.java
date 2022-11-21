package EveryDayCode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/seat-reservation-manager/
//Try to use ordered set
//Input
//["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]
//[[5], [], [], [2], [], [], [], [], [5]]
//Output
//[null, 1, 2, null, 2, 3, 4, 5, null]
public class TestMapSeatManager {
    static int nextPossibleSeat;
    static Map<Integer, String> reservationMap = new HashMap<>();

    TestMapSeatManager(int n) {
        nextPossibleSeat = 1;
        for (int i = 1; i <= n; i++) {
            reservationMap.put(i, "U");
        }
    }

    public static void main(String[] args) {
        int totalCapacity = 5;
        System.out.println(startRestaurant(totalCapacity));
        System.out.println(reserve());
        System.out.println(reserve());
        System.out.println(unReserve(2));
        System.out.println(reserve());
        System.out.println(reserve());
        System.out.println(reserve());
        System.out.println(reserve());
        System.out.println(unReserve(5));
        System.out.println("Finally Seat status is as Follows");
        for (Map.Entry<Integer, String> entry : reservationMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static String startRestaurant(int capacity) {
        TestMapSeatManager seatManager = new TestMapSeatManager(capacity);
        return "null";
    }

    private static String unReserve(int seatNumber) {
        reservationMap.put(seatNumber, "U");
        if (seatNumber < nextPossibleSeat) {
            nextPossibleSeat = seatNumber;
        }
        return "null";
    }

    private static int reserve() {
        int temp = nextPossibleSeat;
        reservationMap.put(nextPossibleSeat, "R");
        nextPossibleSeat = nextPossibleSeat + 1;
        return temp;
    }
}