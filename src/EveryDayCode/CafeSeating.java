package EveryDayCode;
/*The first occurrence of a character in the given sequence indicates the customer arrival,
and the second occurrence of a character indicates the departure for a customer.
A customer cannot be serviced when the cafe capacity is full.
Input:
customer sequence = “ABCDDCEFFEBGAG”
seat capacity = 3
Output: ‘D’ and ‘F’ left unattended
* */

import java.util.*;

public class CafeSeating {

    public static String findUnattendedCustomers(String sequence, int capacity) {
        Map<Character, Integer> customerArrival = new HashMap<>();
        Set<Character> unattendedCustomers = new HashSet<>();
        Set<Character> seatedCustomers = new HashSet<>();

        for (char customer : sequence.toCharArray()) {
            if (customerArrival.containsKey(customer)) {
                // Customer is leaving
                seatedCustomers.remove(customer);
            } else {
                // Customer is arriving
                customerArrival.put(customer, 1);
                if (seatedCustomers.size() < capacity) {
                    seatedCustomers.add(customer);
                } else {
                    unattendedCustomers.add(customer);
                }
            }
        }

        // Convert Set to List before using String.join
        List<Character> unattendedList = new ArrayList<>(unattendedCustomers);
        return String.join(", ", unattendedList.stream().map(String::valueOf).toArray(String[]::new));
    }

    public static void main(String[] args) {
        String customerSequence = "ABCDDCEFFEBGAG";
        int seatCapacity = 3;

        String result = findUnattendedCustomers(customerSequence, seatCapacity);
        System.out.println("Customers left unattended: " + result);
    }
}
