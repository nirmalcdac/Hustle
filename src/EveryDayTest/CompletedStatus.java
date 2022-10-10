package EveryDayTest;

public class CompletedStatus {
    public static void main(String[] args) {
        int totalLimit = 500;
        int divideByLimit = 100;
        printCompletedStatus(totalLimit, divideByLimit);
    }

    private static void printCompletedStatus(int totalLimit, int divideByLimit) {
        for (int i = 1; i <= totalLimit; i++) {
            if (i % divideByLimit == 0) {
                System.out.println(i / 10 + "%");
            }
        }
    }
}