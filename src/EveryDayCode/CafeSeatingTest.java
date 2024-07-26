package EveryDayCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CafeSeatingTest {

    @Test
    public void testFindUnattendedCustomers() {
        // Test case 1: Given example
        String customerSequence1 = "ABCDDCEFFEBGAG";
        int seatCapacity1 = 3;
        String expectedOutput1 = "D, F";
        assertEquals(expectedOutput1, CafeSeating.findUnattendedCustomers(customerSequence1, seatCapacity1));

        // Test case 2: No unattended customers
        String customerSequence2 = "ABAB";
        int seatCapacity2 = 2;
        String expectedOutput2 = "";
        assertEquals(expectedOutput2, CafeSeating.findUnattendedCustomers(customerSequence2, seatCapacity2));

        // Test case 3: All customers unattended
        String customerSequence3 = "ABCDE";
        int seatCapacity3 = 0;
        String expectedOutput3 = "A, B, C, D, E";
        assertEquals(expectedOutput3, CafeSeating.findUnattendedCustomers(customerSequence3, seatCapacity3));
    }
}