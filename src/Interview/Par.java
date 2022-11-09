package Interview;
/*The first occurrence of a character in the given sequence indicates the customer arrival,
and the second occurrence of a character indicates the departure for a customer.
A customer cannot be serviced when the cafe capacity is full.
Input:
customer sequence = “ABCDDCEFFEBGAG”
seat capacity = 3
Output: ‘D’ and ‘F’ left unattended
* */

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Par {
    public static void main(String[] args) {
//        String customerSequence = "ABCDDCEFFEBGAG";
        String customerSequence = "ABCDECFDFEBGAG";
        Integer capacity = 3;
        Set<Object> set = new HashSet<>();
        attendCustomer(set, customerSequence, capacity);
    }

    private static void attendCustomer(Set<Object> set, String customerSequence, Integer capacity) {
        Set<Character> waitingList = new HashSet<>();
        for (int i = 0; i < customerSequence.length(); i++) {
            if (set.contains(customerSequence.charAt(i))) {
                set.remove(customerSequence.charAt(i));
                Optional<Character> first = waitingList.stream().findFirst();
                set.add(first);
                waitingList.remove(first);
            } else {
                if (set.size() < capacity) {
                    set.add(customerSequence.charAt(i));
                } else {
                    System.out.println("We can not accommodate customer, Customer has added to waiting list" + customerSequence.charAt(i));
                    waitingList.add(customerSequence.charAt(i));
                }
            }
        }
    }
}