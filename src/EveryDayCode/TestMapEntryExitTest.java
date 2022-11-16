package EveryDayCode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*We are working on a security system for a badged-access room in our company's building.
Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:
1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit. (All employees are required to leave the room before the log ends.)
2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter. (The room is empty when the log begins.)
Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.
*/

public class TestMapEntryExitTest {
    TestMapEntryExit testMapEntryExit = new TestMapEntryExit();

    @Before
    public void init() {
    }

    @Test
    public void testMapEntryExitRecordOne() {
        String[][] records1 = {
                {"Paul", "enter"},
                {"Pauline", "exit"},
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Martha", "exit"},
                {"Joe", "enter"},
                {"Martha", "enter"},
                {"Steve", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "enter"},
                {"Joe", "enter"},
                {"Curtis", "exit"},
                {"Curtis", "enter"},
                {"Joe", "exit"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Jennifer", "exit"},
                {"Joe", "enter"},
                {"Joe", "enter"},
                {"Martha", "exit"},
                {"Joe", "exit"},
                {"Joe", "exit"},
        };
        Assert.assertEquals(TestMapEntryExit.myProcess(records1),
                "mismatches(records1) => [\"Steve\", \"Curtis\", \"Paul\", \"Joe\"], [\"Martha\", \"Pauline\", \"Curtis\", \"Joe\"]");
    }

    @Test
    public void testMapEntryExitRecordTwo() {
        String[][] records2 = {
                {"Paul", "enter"},
                {"Paul", "exit"},
        };
        Assert.assertEquals(TestMapEntryExit.myProcess(records2),
                "mismatches(records2) => [], []");
    }

    @Test
    public void testMapEntryExitRecordThree() {
        String[][] records3 = {
                {"Paul", "enter"},
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
        };
        Assert.assertEquals(TestMapEntryExit.myProcess(records3),
                "mismatches(records3) => [\"Paul\"], [\"Paul\"]");
    }

    @Test
    public void testMapEntryExitRecordFour() {
        String[][] records4 = {
                {"Raj", "enter"},
                {"Paul", "enter"},
                {"Paul", "exit"},
                {"Paul", "exit"},
                {"Paul", "enter"},
                {"Raj", "enter"},
        };
        Assert.assertEquals(TestMapEntryExit.myProcess(records4),
                "mismatches(records4) => [\"Raj\", \"Paul\"], [\"Paul\"]");
    }
}