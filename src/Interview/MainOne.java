package Interview;

import java.util.ArrayList;
import java.util.List;

/*
A room with a staircase which has 'n' steps.
Everytime you can climb 1 step/2 steps/3 steps.
You are at 0th step. m no. of ways to reach nth step from 0th step. Given n find m.

For n = 4,
1 step + 1 step + 1 step + 1 step
1 step + 1 step + 2 step
1 step + 2 step + 1 step
2 step + 1 step + 1 step
2 step + 2 step
1 step + 3 step
3 step + 1 step

m=7

n=3

1, 1, 1
2, 1
3
1, 2
*/
public class MainOne {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int steppingStone = 0;
        int destiny = 3;
        System.out.println(takeStep(steppingStone, destiny));
    }

    private static int takeStep(int currentStep, int destiny) {
        int count = 0;
        System.out.println("currentStep" + currentStep);
        System.out.println("destiny" + destiny);
        if (currentStep < destiny) {
            List<Integer> list = getPossibleSteps(destiny);
            list.forEach(o -> takeStep(currentStep + o, destiny));
        } else if (currentStep == destiny) {
            count++;
        }
        return count;
    }

    private static List<Integer> getPossibleSteps(Integer destiny) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }
}