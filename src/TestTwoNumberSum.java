public class TestTwoNumberSum {
    public static void main(String[] args) {
//        System.out.println(getBiggestNumber(1, 5));
//        System.out.println(getBiggestNumber(2, 15));
        System.out.println(getBiggestNumber(3, 115));
    }

    private static int getBiggestNumber(int n, int s) {
        if (n == 1) {
            return s;
        } else {
            int i = getMaxNumber(n) - 1;
            while (i > 1) {
                if (((i / 10) + (i % 10) == s)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
    }

    private static int getMaxNumber(int n) {
        int number = 1;
        for (int i = 0; i < n; i++) {
            number = number * 10;
        }
        return number;
    }

}
