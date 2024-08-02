package EveryDayCode;
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

m=7*/


public class Staircase {

    public static void main(String[] args) {
        Staircase staircase = new Staircase();
        int n = 4;
        System.out.println("Number of ways to reach step " + n + ": " + staircase.countWays(n));
    }

    public int countWays(int n) {
        // If the number of steps is 0 or negative, there's only one way (doing nothing)
        if (n == 0) {
            return 1;
        }

        // Base cases
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (n == 3) {
            return 4; // 1+1+1, 1+2, 2+1, 3
        }

        // Create an array to store the number of ways to reach each step
        int[] dp = new int[n + 1];

        // Initialize the base cases
        dp[0] = 1; // There's one way to stay at the ground
        dp[1] = 1; // One way to reach the first step (1 step)
        dp[2] = 2; // Two ways to reach the second step (1+1, 2)
        dp[3] = 4; // Four ways to reach the third step (1+1+1, 1+2, 2+1, 3)

        // Fill the dp array using the relation
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}
